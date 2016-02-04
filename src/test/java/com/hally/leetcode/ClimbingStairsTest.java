package com.hally.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Kateryna Levshova on 13.12.2015.
 */
public class ClimbingStairsTest
{
	@Test
	public void testGetDistinctWays_4()
	{
		ClimbingStairs solution = new ClimbingStairs();
		Assert.assertEquals(solution.getDistinctWaysHashMap(4), 5);
		Assert.assertEquals(solution.getDistinctWaysArray(4), 5);
		Assert.assertEquals(solution.getDistinctWaysVars(4), 5);
		Assert.assertEquals(solution.getDistinctWaysWhile(4), 5);
	}

	@Test
	public void testGetDistinctWays_23()
	{
		ClimbingStairs solution = new ClimbingStairs();
		Assert.assertEquals(solution.getDistinctWaysHashMap(23), 46368);
		Assert.assertEquals(solution.getDistinctWaysArray(23), 46368);
		Assert.assertEquals(solution.getDistinctWaysVars(23), 46368);
		Assert.assertEquals(solution.getDistinctWaysWhile(23), 46368);
	}

	@Test
	public void testGetDistinctWays_1()
	{
		ClimbingStairs solution = new ClimbingStairs();
		Assert.assertEquals(solution.getDistinctWaysHashMap(1), 1);
		Assert.assertEquals(solution.getDistinctWaysArray(1), 1);
		Assert.assertEquals(solution.getDistinctWaysVars(1), 1);
		Assert.assertEquals(solution.getDistinctWaysWhile(1), 1);
	}
}