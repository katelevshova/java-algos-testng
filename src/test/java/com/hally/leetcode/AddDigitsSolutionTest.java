package com.hally.leetcode;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by Kateryna Levshova on 21.10.2015.
 */
public class AddDigitsSolutionTest
{
	private AddDigitsSolution _addDigitsSolution;

	@BeforeSuite
	public void setUp()
	{
		_addDigitsSolution = new AddDigitsSolution();
	}

	/**
	 * Given a non-negative integer num, repeatedly add all its digits until the result has only one
	 * digit.  For example: Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has
	 * only one digit, return it.
	 */
	@Test
	public void testAddDigits_1()
	{
		try
		{
			Assert.assertEquals(_addDigitsSolution.addDigits(546), 6);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testAddDigits_2()
	{
		try
		{
			Assert.assertEquals(_addDigitsSolution.addDigits(382), 4);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testAddDigits_3()
	{
		try
		{
			Assert.assertEquals(_addDigitsSolution.addDigits(9), 9);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testAddDigits_4()
	{
		try
		{
			Assert.assertEquals(_addDigitsSolution.addDigits(18), 9);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testAddDigits_Negative()
	{
		try
		{
			_addDigitsSolution.addDigits(-56);
			Assert.fail("Should have shown a message - " + AddDigitsSolution.ERROR);
		}
		catch (Exception e)
		{
			Assert.assertEquals(e.getMessage(), AddDigitsSolution.ERROR);
		}
	}

}
