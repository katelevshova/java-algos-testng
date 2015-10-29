package com.hally.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Kateryna Levshova on 28.10.2015.
 */
public class HasArrayDuplicatesSolution
{
	/**
	 * Task: Given an array of integers, find if the array contains any duplicates. Your function
	 * should return true if any value appears at least twice in the array, and it should return
	 * false if every element is distinct.
	 */

	//NOTE: My best solution - 15 ms
	public boolean containsDuplicate(int[] nums)
	{
		if (nums.length < 2)
		{
			return false;
		}

		Set set = new HashSet();

		for (int i = 0; i < nums.length; i++)
		{
			if (set.contains(nums[i]))
			{
				return true;
			}
			else
			{
				set.add(nums[i]);
			}
		}

		return false;
	}

	public boolean containsDuplicateInteger(Integer[] nums)
	{
		if (nums.length < 2)
		{
			return false;
		}

		Set set = new HashSet(Arrays.asList(nums)); //NOTE: if use int[] nums then won't work

		return set.size() < nums.length;
	}

	public boolean containsDuplicate_old_version(int[] nums)
	{
		if (nums.length < 2)
		{
			return false;
		}

		List<Integer> intList = new ArrayList<Integer>(); //NOTE: needs because int[] -> Integer

		for (int index = 0; index < nums.length; index++)
		{
			intList.add(nums[index]);
		}

		Set set = new HashSet(intList);

		return set.size() < nums.length;
	}
}
