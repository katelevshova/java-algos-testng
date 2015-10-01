package com.hally.taskSF;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;
import java.util.TreeMap;

/**
 * Created by Kateryna Levshova
 *
 * @date 25.09.2015
 */
public class StringAnalizerTest
{
	private String _testStr2 = "State California. California is the 3rd lrget tate in the United " +
			"States in area, after Alaska and Texas. In the middle of the state lies the " +
			"California Central Valley. Let me repeat this California is the 3rd lrget tate in the United	States in area, after Alaska and Texas. In the middle of the states lies the California Central Valley.";

	private String _testStr1 = "Test one one one three";

	private StringAnalizer _stringAnalizer;
	private TreeMap<String, Integer> _treeMapWords;


	@BeforeSuite(alwaysRun = false)
	public void setUp()
	{
		System.out.println("setUp");
		_stringAnalizer = new StringAnalizer();
	}

	@BeforeMethod(alwaysRun = true)
	public void clearData()
	{
		_treeMapWords =_stringAnalizer.getWords();
	}

	@Test
	public void testPrintWordsInfo1()
	{
		 _stringAnalizer.printWordsInfo(_testStr1);

		Assert.assertEquals(_treeMapWords.size(), 3);

		Assert.assertTrue(_treeMapWords.containsKey("Test"), "Must contain key 'Test'");
		Assert.assertTrue(_treeMapWords.containsKey("one"), "Must contain key 'one'");
		Assert.assertTrue(_treeMapWords.containsKey("three"), "Must contain key 'three'");

		Assert.assertEquals(_treeMapWords.get("Test").intValue(), 1);
		Assert.assertEquals(_treeMapWords.get("one").intValue(), 3);
		Assert.assertEquals(_treeMapWords.get("three").intValue(), 1);
	}

//	@Test
//	public void testGetTopAllWords()
//	{
//		_stringAnalizer.printWordsInfo(sourceStr);
//
//		List<String> topAllWords = _stringAnalizer.getTopAllWords();
//
//		Assert.assertEquals(topAllWords.size(), _treeMapWords.size());
//
//		///Assert.assertEquals(topAllWords.size(), );
//	}


}
