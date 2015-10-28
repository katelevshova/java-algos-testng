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
		boolean actualResult = solution.containsDuplicate(new Integer[]{1, 2, 3, 4, 2, 6});
		Assert.assertTrue(actualResult);
	}

	@Test
	public void testContainsDuplicate_2_Null_Duplicates()
	{
		HasArrayDuplicatesSolution solution = new HasArrayDuplicatesSolution();
		boolean actualResult = solution.containsDuplicate(new Integer[]{1, 2, null, 4, null, 6});
		Assert.assertTrue(actualResult);
	}

	@Test
	public void testContainsDuplicate_All_Null()
	{
		HasArrayDuplicatesSolution solution = new HasArrayDuplicatesSolution();
		boolean actualResult = solution.containsDuplicate(new Integer[]{null, null, null});
		Assert.assertTrue(actualResult);
	}

	@Test
	public void testContainsDuplicate_No()
	{
		HasArrayDuplicatesSolution solution = new HasArrayDuplicatesSolution();
		boolean actualResult = solution.containsDuplicate(new Integer[]{1, 2, 3, 4});
		Assert.assertFalse(actualResult);
	}

	@Test
	public void testContainsDuplicate_No_With_1_Element()
	{
		HasArrayDuplicatesSolution solution = new HasArrayDuplicatesSolution();
		boolean actualResult = solution.containsDuplicate(new Integer[]{1});
		Assert.assertFalse(actualResult);
	}

	@Test
	public void testContainsDuplicate_No_With_1_Null()
	{
		HasArrayDuplicatesSolution solution = new HasArrayDuplicatesSolution();
		boolean actualResult = solution.containsDuplicate(new Integer[]{1, 2, null, 4, 5});
		Assert.assertFalse(actualResult);
	}


}
