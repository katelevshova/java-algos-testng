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
	public void testClimbStairs_50()
	{
		ClimbingStairs solution = new ClimbingStairs();
		solution.climbStairs(50);
		//Assert.assertEquals(solution.climbStairs(4), 5);
	}
}