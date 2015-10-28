package com.hally.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

/**
 * Created by Kateryna Levshova on 28.10.2015.
 */
public class HasArrayDuplicatesSolution
{
	/**
	 * Task:
	 * Given an array of integers, find if the array contains any duplicates.
	 * Your function should return true if any value appears at least twice in the array,
	 * and it should return false if every element is distinct.
	 */

	/**
	 * Check if array contains duplicates or not
	 * @param nums
	 * @return
	 */
	public boolean containsDuplicate(Integer[] nums)
	{
		//NOTE: if use int[] nums then won't work
		if(nums.length < 2)
		{
			return false;
		}

		Set set = new HashSet(Arrays.asList(nums));

		return set.size() < nums.length;
	}
}
