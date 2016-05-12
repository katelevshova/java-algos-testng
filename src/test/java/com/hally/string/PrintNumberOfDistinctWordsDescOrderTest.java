package com.hally.string;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;
import java.util.TreeMap;

/**
 * Created by Kateryna Levshova
 *
 * @date 25.09.2015
 */
public class PrintNumberOfDistinctWordsDescOrderTest
{
	private String _testStr1 = "Test one one one three";
	private String _testStr2 = "Test test test. test";
	private PrintNumberOfDistinctWordsDescOrder _solution;

	@BeforeSuite(alwaysRun = false)
	public void setUp()
	{
		System.out.println("setUp");
		_solution = new PrintNumberOfDistinctWordsDescOrder();
	}

	@Test(groups = "group1")
	public void testPrintWordsInfo1()
	{
		 _solution.printWordsInfo(_testStr1);

		TreeMap<String, Integer> treeMapWords = _solution.getWords();
		Assert.assertEquals(treeMapWords.size(), 3);

		Assert.assertTrue(treeMapWords.containsKey("Test"), "Must contain key 'Test'");
		Assert.assertTrue(treeMapWords.containsKey("one"), "Must contain key 'one'");
		Assert.assertTrue(treeMapWords.containsKey("three"), "Must contain key 'three'");

		Assert.assertEquals(treeMapWords.get("Test").intValue(), 1);
		Assert.assertEquals(treeMapWords.get("one").intValue(), 3);
		Assert.assertEquals(treeMapWords.get("three").intValue(), 1);
	}

	@Test(groups = "group1", dependsOnMethods = {"testPrintWordsInfo1"})
	public void testGetTopAllWords1()
	{
		List<String> topAllWords = _solution.getTopAllWords();
		Assert.assertEquals(topAllWords.size(),  _solution.getWords().size());

		Assert.assertEquals("one=3", topAllWords.get(0) );
		Assert.assertEquals("Test=1", topAllWords.get(1) );
		Assert.assertEquals("three=1", topAllWords.get(2) );
	}

	@Test(groups = "group2", dependsOnGroups = "group1")
	public void testPrintWordsInfo2()
	{
		_solution.printWordsInfo(_testStr2);
		TreeMap<String, Integer> treeMapWords = _solution.getWords();
		Assert.assertEquals(treeMapWords.size(), 3);

		Assert.assertTrue(treeMapWords.containsKey("Test"), "Must contain key 'Test'");
		Assert.assertTrue(treeMapWords.containsKey("test"), "Must contain key 'test'");
		Assert.assertTrue(treeMapWords.containsKey("test."), "Must contain key 'test.'");

		Assert.assertEquals(treeMapWords.get("Test").intValue(), 1);
		Assert.assertEquals(treeMapWords.get("test").intValue(), 2);
		Assert.assertEquals(treeMapWords.get("test.").intValue(), 1);
	}

	@Test(groups = "group2", dependsOnMethods = {"testPrintWordsInfo2"})
	public void testGetTopAllWords2()
	{
		List<String> topAllWords = _solution.getTopAllWords();
		Assert.assertEquals(topAllWords.size(), _solution.getWords().size());

		Assert.assertEquals("test=2", topAllWords.get(0) );
		Assert.assertEquals("Test=1", topAllWords.get(1) );
		Assert.assertEquals("test.=1", topAllWords.get(2) );
	}
}
