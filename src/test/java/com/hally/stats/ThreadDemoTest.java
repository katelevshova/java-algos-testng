package com.hally.stats;

import com.hally.task78.TraceUtil;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Kateryna Levshova
 *
 * @date 17.09.2015
 */
public class ThreadDemoTest
{
	public static final String CLASS_NAME = ThreadDemoTest.class.getName();

	@Test
	public void testStart()
	{
		ThreadDemo threadDemo1 = new ThreadDemo("Thread_1");
		threadDemo1.start();
		long id = Thread.currentThread().getId();
		TraceUtil.logD(CLASS_NAME, "testStart", "id=" + id);

		ThreadDemo threadDemo2 = new ThreadDemo("Thread_2");
		threadDemo2.start();
		id = Thread.currentThread().getId();
		TraceUtil.logD(CLASS_NAME, "testStart", "id=" + id);
	}

	@Test(threadPoolSize = 3, invocationCount = 6, timeOut = 5000)
	public void testMethod()
	{
		Long id = Thread.currentThread().getId();
		TraceUtil.logD(CLASS_NAME, "testMethod", "executing on thread with id: " + id);

		for(int i = 0; i < 5; i++)
		{
			ThreadDemo threadDemo = new ThreadDemo("Thread_"+i);
			threadDemo.start();
		}
	}

}
