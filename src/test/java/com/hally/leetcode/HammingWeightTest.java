package com.hally.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Kateryna Levshova on 14.11.2015.
 */
public class HammingWeightTest
{

	@Test
	public void testHammingWeight()
	{
		HammingWeight hammingWeight = new HammingWeight();
		Assert.assertEquals(hammingWeight.hammingWeight(11), 3);
		Assert.assertEquals(hammingWeight.hammingWeight(5896), 5); // 5896 = 1011100001000
	}

	@Test
	public void testHammingWeightBestSolution()
	{
		HammingWeight hammingWeight = new HammingWeight();
		Assert.assertEquals(hammingWeight.hammingWeightBestSolution(11), 3);
		Assert.assertEquals(hammingWeight.hammingWeightBestSolution(5896), 5); // 5896 = 1011100001000
//		Assert.assertEquals(hammingWeight.hammingWeightBestSolution(Integer.MAX_VALUE), 1);
	}
}