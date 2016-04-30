package com.hally.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Kateryna Levshova on 29.04.2016.
 */
public class IsPowerOfThreeSolutionTest
{
	@Test
	public void testIsPowerOfThree_Loop()
	{
		IsPowerOfThreeSolution solution = new IsPowerOfThreeSolution();
		Assert.assertTrue(solution.isPowerOfThreeLoop(9));
		Assert.assertTrue(solution.isPowerOfThreeLoop(3));
		Assert.assertTrue(solution.isPowerOfThreeLoop(27));
		Assert.assertFalse(solution.isPowerOfThreeLoop(-3));
		Assert.assertFalse(solution.isPowerOfThreeLoop(0));
		Assert.assertFalse(solution.isPowerOfThreeLoop(4));
		Assert.assertFalse(solution.isPowerOfThreeLoop(21));
	}

	@Test
	public void testIsPowerOfThree_HardCoded()
	{
		IsPowerOfThreeSolution solution = new IsPowerOfThreeSolution();
		Assert.assertTrue(solution.isPowerOfThreeHardCoded(9));
		Assert.assertTrue(solution.isPowerOfThreeHardCoded(3));
		Assert.assertTrue(solution.isPowerOfThreeHardCoded(27));
		Assert.assertFalse(solution.isPowerOfThreeHardCoded(-3));
		Assert.assertFalse(solution.isPowerOfThreeHardCoded(0));
		Assert.assertFalse(solution.isPowerOfThreeHardCoded(4));
		Assert.assertFalse(solution.isPowerOfThreeHardCoded(21));
	}

	@Test
	public void testIsPowerOfThree_Log()
	{
		IsPowerOfThreeSolution solution = new IsPowerOfThreeSolution();
		Assert.assertTrue(solution.isPowerOfThreeLog(9));
		Assert.assertTrue(solution.isPowerOfThreeLog(3));
		Assert.assertTrue(solution.isPowerOfThreeLog(27));
		Assert.assertFalse(solution.isPowerOfThreeLog(-3));
		Assert.assertFalse(solution.isPowerOfThreeLog(0));
		Assert.assertFalse(solution.isPowerOfThreeLog(4));
		Assert.assertFalse(solution.isPowerOfThreeLog(21));
	}

	@Test
	public void testIsPowerOfThree_Recursive()
	{
		IsPowerOfThreeSolution solution = new IsPowerOfThreeSolution();
		Assert.assertTrue(solution.isPowerOfThreeRecursive(9));
		Assert.assertTrue(solution.isPowerOfThreeRecursive(3));
		Assert.assertTrue(solution.isPowerOfThreeRecursive(27));
		Assert.assertFalse(solution.isPowerOfThreeRecursive(-3));
		Assert.assertFalse(solution.isPowerOfThreeRecursive(0));
		Assert.assertFalse(solution.isPowerOfThreeRecursive(4));
		Assert.assertFalse(solution.isPowerOfThreeRecursive(21));
	}

	@Test
	public void testIsPowerOfThree_Math()
	{
		IsPowerOfThreeSolution solution = new IsPowerOfThreeSolution();
		Assert.assertTrue(solution.isPowerOfThreeMath(9));
		Assert.assertTrue(solution.isPowerOfThreeMath(3));
		Assert.assertTrue(solution.isPowerOfThreeMath(27));
		Assert.assertFalse(solution.isPowerOfThreeMath(-3));
		Assert.assertFalse(solution.isPowerOfThreeMath(0));
		Assert.assertFalse(solution.isPowerOfThreeMath(4));
		Assert.assertFalse(solution.isPowerOfThreeMath(21));
	}
}