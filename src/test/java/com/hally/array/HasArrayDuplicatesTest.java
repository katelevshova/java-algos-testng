package com.hally.array;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Kateryna Levshova
 *
 * @date 21.09.2015
 */
public class HasArrayDuplicatesTest
{
	@Test
	public void testHasDuplicates()
	{
		HasArrayDuplicates hasArrayDuplicates = new HasArrayDuplicates();

		int[] array = {2,4,5,2,5,6,3};

		boolean actualResult = hasArrayDuplicates.hasDuplicates(array);
		Assert.assertTrue(actualResult == true);

		array = new int[]{2};
		actualResult = hasArrayDuplicates.hasDuplicates(array);
		Assert.assertFalse(actualResult == true);
	}
}
