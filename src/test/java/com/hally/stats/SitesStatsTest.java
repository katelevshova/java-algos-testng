package com.hally.stats;


import com.hally.task78.TraceUtil;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Kateryna Levshova
 *
 * @date 17.09.2015
 */
public class SitesStatsTest
{
	public static final String CLASS_NAME = SitesStatsTest.class.getName();

	ConcurrentHashMap<String, Integer> _pages;
	private SitesStats _sitesStats;

	@BeforeMethod(alwaysRun = true)
	public void setUp()
	{
		_sitesStats = new SitesStats();
		_pages = _sitesStats.getPages();
		TraceUtil.logD(CLASS_NAME, "setUp", "_pages.size= " + _pages.size());
	}

	@Test
	public void testReportPageAccess()
	{
		String pageNameKey1 = "b.html";

		Assert.assertEquals(_pages.size(), 0);

		checkPage(pageNameKey1);

		//add pageNameKey1 again
		_sitesStats.reportPageAccess(pageNameKey1);
		Assert.assertEquals(_pages.size(), 1);
		int actualValueResult = _pages.get(pageNameKey1);
		Assert.assertEquals(actualValueResult, 2);

		String pageNameKey2 = "a.html";
		checkPage(pageNameKey2);

		Assert.assertEquals(_pages.size(), 2);

		//add pageNameKey2 again
		_sitesStats.reportPageAccess(pageNameKey2);
		Assert.assertEquals(_pages.size(), 2);
		actualValueResult = _pages.get(pageNameKey2);
		Assert.assertEquals(actualValueResult, 2);
	}

	private void checkPage(String pageNameKey)
	{
		Integer pageValue = 1;
		_sitesStats.reportPageAccess(pageNameKey);
		Assert.assertTrue(_pages.containsKey(pageNameKey), "Must contain key " + pageNameKey);
		Assert.assertTrue(_pages.containsValue(pageValue), "Must contain value " + pageValue);
		Assert.assertEquals(_pages.get(pageNameKey), pageValue);
	}

	@Test
	public void testGetTopAllPages2()
	{
		_sitesStats.reportPageAccess("c.html");
		_sitesStats.reportPageAccess("c.html");
		_sitesStats.reportPageAccess("c.html");
		_sitesStats.reportPageAccess("a.html");
		_sitesStats.reportPageAccess("b.html");
		_sitesStats.reportPageAccess("b.html");

		List<String> topAllPages = _sitesStats.getTopAllPages();

		Assert.assertEquals(topAllPages.size(), _pages.size());
		Assert.assertEquals(topAllPages.size(), 3);

		Assert.assertEquals(topAllPages.get(0), "c.html");
		Assert.assertEquals(topAllPages.get(1), "b.html");
		Assert.assertEquals(topAllPages.get(2), "a.html");
	}

	@Test
	public void testGetTopAllPages3()
	{
		_sitesStats.reportPageAccess("c.html");
		_sitesStats.reportPageAccess("c.html");
		_sitesStats.reportPageAccess("c.html");
		_sitesStats.reportPageAccess("b.html");
		_sitesStats.reportPageAccess("b.html");

		List<String> topAllPages = _sitesStats.getTopAllPages();

		Assert.assertEquals(topAllPages.size(), _pages.size());
		Assert.assertEquals(topAllPages.size(), 2);

		Assert.assertEquals(topAllPages.get(0), "c.html");
		Assert.assertEquals(topAllPages.get(1), "b.html");

		Assert.assertFalse(topAllPages.size() != 2);
	}
}
