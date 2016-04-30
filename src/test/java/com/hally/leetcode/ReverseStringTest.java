package com.hally.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Kateryna Levshova on 29.04.2016.
 */
public class ReverseStringTest
{

	@Test
	public void testReverseString()
	{
		ReverseString solution = new ReverseString();
		Assert.assertEquals(solution.reverseString("hello"), "olleh");
		Assert.assertEquals(solution.reverseString("G89 jh5"), "5hj 98G");
		Assert.assertEquals(solution.reverseString(""), "");
	}
}