package com.hally.taskSF;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * TASK:
 * Print a table indicating the number of occurrences of each different word in the text.
 * the 10
 * California 5
 * Add a possibility to print information in descending order based on number value.
 *
 * @author Kateryna Levshova
 * @date 25.09.2015
 */
public class StringAnalizer
{
	private TreeMap<String, Integer> _treeMapWords = new TreeMap<String, Integer>();

	/**
	 * Used for <code>StringAnalizerTest</code> class
	 * @return
	 */
	public TreeMap<String, Integer> getWords()
	{
		return  _treeMapWords;
	}

	/**
	 * Analizes input text and prints number of ocurances for each word
	 * @param text
	 * @return
	 */
	public String printWordsInfo(String text)
	{
		String result = "";
		String[] words = text.split(" ");

//		StringTokenizer is also could be used for this purpose, its use is discouraged in new code
//		StringTokenizer st = new StringTokenizer("this is a test");
//		while (st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}

		HashSet<String> hashSet = new HashSet<String>();
		int counter = -1;

		for(String str: words)
		{
			System.out.println("Distinct word detected =" + str);
			hashSet.add(str);

			//check if we have this word already then count its number
			if(hashSet.contains(str))
			{
				counter++;
				_treeMapWords.put(str, counter);
			}
		}

		System.out.println(hashSet.size() + " distinct words detected "+ hashSet);
		System.out.println(_treeMapWords);

		//print information without sorting
		for (Map.Entry<String, Integer> e : _treeMapWords.entrySet())
		{
			System.out.println(e);
		}

		result = _treeMapWords.toString();
		System.out.println("result= "+result);
		return result;
	}

	/**
	 * Sorts data by value and then by key
	 * @return
	 */
	public List<String> getTopAllWords()
	{
		Map<String, Integer> stringIntegerMap = sortByValues(_treeMapWords);
		List<String> wordsList = new ArrayList<>();

		for (Map.Entry<String, Integer> e : stringIntegerMap.entrySet())
		{
			wordsList.add(e.getKey());
		}

		System.out.println("getTopAllWords= "+ wordsList.toString());

		return wordsList;
	}

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
}
