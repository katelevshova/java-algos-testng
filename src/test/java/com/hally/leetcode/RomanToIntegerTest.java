package com.hally.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Kateryna Levshova on 24.11.2015.
 */
public class RomanToIntegerTest
{
	@Test
	public void testRomanToInt()
	{
		RomanToInteger romanToInteger = new RomanToInteger();
		Assert.assertEquals(romanToInteger.romanToInt("XIII"), 13);
		Assert.assertEquals(romanToInteger.romanToInt("CCVII"), 207);
		Assert.assertEquals(romanToInteger.romanToInt("MLXVI"), 1066);

		Assert.assertEquals(romanToInteger.romanToInt("IV"), 4 );
		Assert.assertEquals(romanToInteger.romanToInt("IX"), 9 );
		Assert.assertEquals(romanToInteger.romanToInt("XL"), 40 );
		Assert.assertEquals(romanToInteger.romanToInt("XC"), 90 );
		Assert.assertEquals(romanToInteger.romanToInt("CD"), 400 );
		Assert.assertEquals(romanToInteger.romanToInt("CM"), 900 );
		Assert.assertEquals(romanToInteger.romanToInt("MMMCMXCIX"), 3999 );
	}
}