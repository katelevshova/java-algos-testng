package com.hally.leetcode;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by Oni on 25.10.2015.
 */
public class TreeEqualtyAnalizerTest
{
	private TreeEqualtyAnalyzer _treeEqualtyAnalyzer;

	@BeforeSuite(alwaysRun = true)
	public void setUp()
	{
		_treeEqualtyAnalyzer = new TreeEqualtyAnalyzer();
	}

	@Test
	public void testIsEqual_Single_Root_Node()
	{
	}
}
