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
	public String sourceStr = "State California. California is the 3rd lrget tate in the United " +
			"States in area, after Alaska and Texas. In the middle of the state lies the " +
			"California Central Valley. Let me repeat this California is the 3rd lrget tate in the United	States in area, after Alaska and Texas. In the middle of the states lies the California Central Valley.";

	private String testStr1 = "Test one one one three";

	private StringAnalizer _stringAnalizer;
	private TreeMap<String, Integer> _treeMapWords;


	@BeforeSuite(alwaysRun = false)
	public void setUp()
	{
		System.out.println("setUp");
		_stringAnalizer = new StringAnalizer();
		_treeMapWords =_stringAnalizer.getWords();
	}

	@BeforeMethod(alwaysRun = true)
	public void clearData()
	{
		_treeMapWords = new TreeMap<String, Integer>();
	}

//	@Test
//	public void testPrintWordsInfo1()
//	{
//		String actualResult =  _stringAnalizer.printWordsInfo(testStr1);
//		String expectedResult = "{Test=2, one=1}";
//		Assert.assertEquals(actualResult, expectedResult);
//	}

	@Test
	public void testPrintWordsInfo2()
	{
		 _stringAnalizer.printWordsInfo(testStr1);
		//Assert.assertEquals(actualResult, expectedResult);
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
