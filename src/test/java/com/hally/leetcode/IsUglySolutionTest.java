package com.hally.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Oni on 12.02.2016.
 */
public class IsUglySolutionTest
{

	@Test
	public void testIsUgly_Positive() throws Exception
	{
		IsUglySolution solution = new IsUglySolution();

		Assert.assertTrue(solution.isUgly(6));
		Assert.assertTrue(solution.isUgly(8));
		Assert.assertTrue(solution.isUgly(1));
		Assert.assertFalse(solution.isUgly(14));
	}

	@Test
	public void testIsUgly_Negative() throws Exception
	{
		IsUglySolution solution = new IsUglySolution();

		Assert.assertTrue(solution.isUgly(-6));
		Assert.assertTrue(solution.isUgly(-8));
		Assert.assertTrue(solution.isUgly(-1));
		Assert.assertFalse(solution.isUgly(-14));
	}
}