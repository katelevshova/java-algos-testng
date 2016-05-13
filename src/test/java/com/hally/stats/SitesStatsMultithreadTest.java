package com.hally.stats;

import com.hally.TraceUtil;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by Kateryna Levshova
 *
 * @date 17.09.2015
 */
public class SitesStatsMultithreadTest
{
	public static final String CLASS_NAME = SitesStatsMultithreadTest.class.getName();

	private final String _pageNameKey1 = "a.html";
	private SitesStats _sitesStats;

	/**
	 * Execution procedure:
	 * beforeSuite
	 * beforeTest
	 * beforeClass
	 * beforeMethod
	 * test case 1
	 * afterMethod
	 * beforeMethod
	 * test case 2
	 * afterMethod
	 * afterClass
	 * afterTest
	 * afterSuite
	 */

	@BeforeSuite(alwaysRun = false)
	public void setUp()
	{
		TraceUtil.logD(CLASS_NAME, "setUp", "BeforeSuite");
		_sitesStats = new SitesStats();
	}

	// The method will be run a total of 2 times using 2 threads
	@Test(threadPoolSize = 2, invocationCount = 2, timeOut = 10000)
	public void testReportPageAccess2Threads()
	{
		Long id = Thread.currentThread().getId();
		TraceUtil.logD(CLASS_NAME, "testReportPageAccess2Threads",
				"executing on thread with id: " + id);

		_sitesStats.reportPageAccess(_pageNameKey1);
	}

	@AfterMethod(alwaysRun = true)
	public void testSize()
	{
		TraceUtil.logD(CLASS_NAME, "testSize", "AfterMethod");
		Assert.assertEquals(_sitesStats.getPages().size(), 1);
		Assert.assertTrue(_sitesStats.getPages().containsKey(_pageNameKey1),
				"Must contain key " + _pageNameKey1);
	}

	@AfterSuite(alwaysRun = false)
	public void testValue()
	{
		TraceUtil.logD(CLASS_NAME, "testValue", "AfterSuite");
		int actualValueResult = _sitesStats.getPages().get(_pageNameKey1);
		Assert.assertEquals(actualValueResult, 2);
	}
}
