package com.hally.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Kateryna Levshova on 28.10.2015.
 */
public class HasArrayDuplicatesSolutionTest
{
	@Test
	public void testContainsDuplicate_2_Duplicates()
	{
		HasArrayDuplicatesSolution solution = new HasArrayDuplicatesSolution();
		Assert.assertTrue(solution.containsDuplicateInteger(new Integer[]{1, 2, 3, 4, 2, 6}));
		Assert.assertTrue(solution.containsDuplicate(new int[]{1, 2, 3, 4, 2, 6}));
	}

	@Test
	public void testContainsDuplicate_Integer_2_Null()
	{
		HasArrayDuplicatesSolution solution = new HasArrayDuplicatesSolution();
		boolean actualResult =
				solution.containsDuplicateInteger(new Integer[]{1, 2, null, 4, null, 6});
		Assert.assertTrue(actualResult);
	}

	@Test
	public void testContainsDuplicate_Integer_All_Null()
	{
		HasArrayDuplicatesSolution solution = new HasArrayDuplicatesSolution();
		boolean actualResult = solution.containsDuplicateInteger(new Integer[]{null, null, null});
		Assert.assertTrue(actualResult);
	}

	@Test
	public void testContainsDuplicate_No()
	{
		HasArrayDuplicatesSolution solution = new HasArrayDuplicatesSolution();
		Assert.assertFalse(solution.containsDuplicateInteger(new Integer[]{1, 2, 3, 4}));
		Assert.assertFalse(solution.containsDuplicate(new int[]{1, 2, 3, 4}));
	}

	@Test
	public void testContainsDuplicate_No_With_1_Element()
	{
		HasArrayDuplicatesSolution solution = new HasArrayDuplicatesSolution();
		Assert.assertFalse(solution.containsDuplicateInteger(new Integer[]{1}));
		Assert.assertFalse(solution.containsDuplicate(new int[]{1}));
	}

	@Test
	public void testContainsDuplicate_Integer_No_With_1_Null()
	{
		HasArrayDuplicatesSolution solution = new HasArrayDuplicatesSolution();
		boolean actualResult = solution.containsDuplicateInteger(new Integer[]{1, 2, null, 4, 5});
		Assert.assertFalse(actualResult);
	}

	@Test
	public void testContainsDuplicate_Very_Long_Array()
	{
		HasArrayDuplicatesSolution solution = new HasArrayDuplicatesSolution();

		int[] array = new int[29999];

		for(int i = 0; i < array.length; i++)
		{
			array[i] = i;
		}

		Assert.assertFalse(solution.containsDuplicate(array));
	}


}
