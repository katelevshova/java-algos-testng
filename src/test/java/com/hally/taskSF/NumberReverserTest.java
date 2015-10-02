package com.hally.taskSF;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Kateryna Levshova
 *
 * @date 01.10.2015
 */
public class NumberReverserTest
{
	private NumberReverser _numberReverser;

	@BeforeMethod(alwaysRun = true)
	public void setUp()
	{
		_numberReverser = new NumberReverser();
	}

	@Test
	public void testReverse1()
	{
		int actualResult = _numberReverser.reverse(12345);
		Assert.assertEquals(actualResult, 54321);
	}

	@Test
	public void testReverse2()
	{
		int actualResult = _numberReverser.reverse(-345);
		Assert.assertEquals(actualResult, -543);
	}

	@Test
	public void testExceptionalCase()
	{
		try
		{
			_numberReverser.reverse(Integer.MAX_VALUE);
			Assert.fail("Should have thrown exception that " +
					NumberReverser.ERROR);
		}
		catch (IllegalArgumentException e)
		{
			Assert.assertEquals(e.getMessage(), NumberReverser.ERROR);
		}
	}
}
