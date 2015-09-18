package com.hally.stats;

import com.hally.task78.TraceUtil;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Kateryna Levshova
 *
 * @date 17.09.2015
 */
public class ThreadDemo extends Thread
{
	public static final String CLASS_NAME = ThreadDemo.class.getName();
	private Thread _thread;
	private String _threadName;
	private SitesStats _sitesStats;

	public ThreadDemo(String name)
	{
		_threadName = name;
		_sitesStats = new SitesStats();
		TraceUtil.logD(CLASS_NAME, "Constructor", _threadName);
	}

	public void run()
	{
		TraceUtil.logD(CLASS_NAME, "run", _threadName);
		_sitesStats.reportPageAccess("c.html");
		_sitesStats.reportPageAccess("c.html");
	}

	public void start()
	{
		TraceUtil.logD(CLASS_NAME, "start", _threadName);

		if(_thread == null)
		{
			_thread = new Thread(this, _threadName);
			_thread.start();
		}
	}
}
