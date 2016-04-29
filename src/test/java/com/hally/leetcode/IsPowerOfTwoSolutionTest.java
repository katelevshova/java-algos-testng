package com.hally.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Kateryna Levshova on 29.04.2016.
 */
public class IsPowerOfTwoSolutionTest
{

	@Test
	public void testIsPowerOfTwo_True() throws Exception
	{
		IsPowerOfTwoSolution solution = new IsPowerOfTwoSolution();
		Assert.assertTrue(solution.isPowerOfTwo(8));
		Assert.assertTrue(solution.isPowerOfTwo(256));
		Assert.assertTrue(solution.isPowerOfTwo(1024));
		Assert.assertTrue(solution.isPowerOfTwo(16));
	}

	@Test
	public void testIsPowerOfTwo_False() throws Exception
	{
		IsPowerOfTwoSolution solution = new IsPowerOfTwoSolution();
		Assert.assertFalse(solution.isPowerOfTwo(5));
		Assert.assertFalse(solution.isPowerOfTwo(12));
		Assert.assertFalse(solution.isPowerOfTwo(24));
		Assert.assertFalse(solution.isPowerOfTwo(-30));
		Assert.assertFalse(solution.isPowerOfTwo(0));
	}
}