package com.hally.number;

import com.hally.number.IsHappyNumber;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Kateryna Levshova on 02.05.2016.
 */
public class IsHappyNumberTest
{

	@Test
	public void testIsHappy_True()
	{
		IsHappyNumber solution = new IsHappyNumber();
		Assert.assertTrue(solution.isHappy(7));
		Assert.assertTrue(solution.isHappy(19));
		Assert.assertTrue(solution.isHappy(1111111));
		Assert.assertTrue(solution.isHappy(1));
	}

	@Test
	public void testIsHappy_False()
	{
		IsHappyNumber solution = new IsHappyNumber();
		Assert.assertFalse(solution.isHappy(-7));
		Assert.assertFalse(solution.isHappy(0));
		Assert.assertFalse(solution.isHappy(21));
		Assert.assertFalse(solution.isHappy(14));
	}

	@Test
	public void testCalculateSquareSum()
	{
		IsHappyNumber solution = new IsHappyNumber();
		Assert.assertEquals(solution.calculateSquareSum(97), 130);
		Assert.assertEquals(solution.calculateSquareSum(130), 10);
		Assert.assertEquals(solution.calculateSquareSum(81), 65);
	}
}