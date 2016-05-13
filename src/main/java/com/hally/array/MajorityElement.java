package com.hally.array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Kateryna Levshova on 24.11.2015.
 */
public class MajorityElement
{
	/*
	Task:
	Given an array of size n, find the majority element.
	The majority element is the element that appears more than  n/2  times.
	You may assume that the array is non-empty and the majority element always exist in the array.
	 */

	public int majorityElementSorting(int[] nums)
	{
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}

	public int majorityElementHashMap(int[] nums)
	{
		HashMap<Integer, Integer> hashMap = new HashMap<>();

		int result = 0;

		for (int element : nums)
		{
			if (!hashMap.containsKey(element))
			{
				hashMap.put(element, 1);
			}
			else
			{
				hashMap.put(element, hashMap.get(element) + 1);
			}

			if (hashMap.get(element) > nums.length / 2)
			{
				result = element;
				break;
			}
		}

		return result;
	}

	public int majorityElementMooreVoting(int[] nums)
	{
		int result = 0;
		int counter = 0;

		for (int element : nums)
		{
			if (counter == 0)
			{
				result = element;
			}

			if (result != element)
			{
				counter--;
			}
			else
			{
				counter++;
			}
		}

		return result;
	}

	public int majorityElementBitManipulation(int[] nums)
	{
		int result = 0;

		int[] bits = new int[32];

		for (int element: nums)
		{
			for (int i = 0; i < 32; i++)
			{
				if( ((element >> (31 - i) & 1) == 1))
				{
					bits[i]++;
				}
			}
		}

		for(int i = 0; i < 32; i++)
		{
			bits[i] = bits[i] > nums.length/2?1:0;
			result += bits[i]*(1 << (31 - i));
		}

		return result;
	}
}
