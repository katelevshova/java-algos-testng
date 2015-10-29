package com.hally.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Kateryna Levshova on 28.10.2015.
 */
public class ContainsDuplicatesArraySolution
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

		for (int elem: nums)
		{
			if (set.contains(elem))
			{
				return true;
			}
			else
			{
				set.add(elem);
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

		List<Integer> intList = new ArrayList<>(); //NOTE: needs because int[] -> Integer

		for (int elem: nums)
		{
			intList.add(elem);
		}

		Set set = new HashSet(intList);

		return set.size() < nums.length;
	}
}
