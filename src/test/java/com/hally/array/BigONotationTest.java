package com.hally.array;

import com.hally.array.BigONotation;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Kateryna Levshova
 *
 * @date 21.09.2015
 */
public class BigONotationTest
{
	@Test
	public void testHasDuplicates()
	{
		BigONotation bigONotation = new BigONotation();

		int[] array = {2,4,5,2,5,6,3};

		boolean actualResult = bigONotation.hasDuplicates(array);
		Assert.assertTrue(actualResult == true);

		array = new int[]{2};
		actualResult = bigONotation.hasDuplicates(array);
		Assert.assertFalse(actualResult == true);
	}
}
