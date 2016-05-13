package com.hally.stats;

import com.hally.TraceUtil;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Stores statistics of pages accessing by a user and returns top of all pages.
 * If user accesses a page "a.html" twice, we need to save statistics in form "pageName" and
 * "number of access". It returns top of all pages. Example: "c.html" - 3 times, "a.html" - 1
 * time, "b.html" - 2. The result must be: "c.html", "b.html", "a.html"
 *
 * Created by Kateryna Levshova
 * @date 17.09.2015
 */
public class SitesStats implements ISitesStats
{
	public static final String CLASS_NAME = SitesStats.class.getName();
	private ConcurrentHashMap<String, Integer> _pages = new ConcurrentHashMap<String, Integer>();

	/**
	 * Custom Comparator to sort a map by values
	 * @param map
	 * @param <K>
	 * @param <V>
	 * @return
	 */
	public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map)
	{
		Comparator<K> valueComparator = new Comparator<K>()
		{
			public int compare(K k1, K k2)
			{
				V value1 = map.get(k1);
				V value2 = map.get(k2);
				int compare = value2.compareTo(value1);
				/// 0 if this instance has the same order as another
				//a positive integer if this instance is greater than another
				//a negative integer if this instance is less than another
				if (compare == 0)
				{
					return 1;
				}
				else
				{
					return compare;
				}
			}
		};

		// TreeMap sorts the key in ascending order (alphabetical and upper/down case sensitive)
		Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
		sortedByValues.putAll(map);
		return sortedByValues;
	}

	/**
	 * Checks and saves current number of access to this page
	 * @param pageName
	 */
	public void reportPageAccess(String pageName)
	{
		TraceUtil.logD(CLASS_NAME, "reportPageAccess", pageName);
		if (_pages.containsKey(pageName))
		{
			int value = _pages.get(pageName);
			_pages.remove(pageName);
			value++;
			_pages.put(pageName, value);
		}
		else
		{
			_pages.put(pageName, 1);
		}
	}

	/**
	 * Used for <code>SitesStatsTest</code> class. Returns information about page access in form
	 * "pageName" and "number of access"
	 * @return
	 */
	public ConcurrentHashMap<String, Integer> getPages()
	{
		return _pages;
	}

	/**
	 * Sorts data by value and then by key.
	 * @return
	 */
	public List<String> getTopAllPages()
	{
		Map<String, Integer> stringIntegerMap = sortByValues(_pages);
		List<String> pagesList = new ArrayList<>();

		for (Map.Entry<String, Integer> e : stringIntegerMap.entrySet())
		{
			pagesList.add(e.getKey());
		}

		return pagesList;
	}
}
