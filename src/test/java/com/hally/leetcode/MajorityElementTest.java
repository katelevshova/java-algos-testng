package com.hally.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Kateryna Levshova on 24.11.2015.
 */
public class MajorityElementTest
{
	@Test
	public void testMajorityElement()
	{
		MajorityElement majorityElement = new MajorityElement();

		int[] elements = new int[]{4,4,4,3,3,4,2,4,1,4};

		Assert.assertEquals(majorityElement.majorityElementHashMap(elements), 4);
		Assert.assertEquals(majorityElement.majorityElementMooreVoting(elements), 4);
		Assert.assertEquals(majorityElement.majorityElementBitManipulation(elements), 4);
		Assert.assertEquals(majorityElement.majorityElementSorting(elements), 4);
	}


	@Test
	public void testMajorityElement_Equal()
	{
		MajorityElement majorityElement = new MajorityElement();

		int[] elements = new int[]{4,4,4,4,4,3,3,3,3,3};

//		Assert.assertEquals(majorityElement.majorityElementHashMap(elements), 4); needs
// additional condition
		Assert.assertEquals(majorityElement.majorityElementMooreVoting(elements), 4);
//		Assert.assertEquals(majorityElement.majorityElementBitManipulation(elements), 4); needs
// additional condition
		Assert.assertEquals(majorityElement.majorityElementSorting(elements), 4);
	}
}