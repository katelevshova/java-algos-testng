package com.hally.leetcode;

import java.util.HashMap;

/**
 * Created by Kateryna Levshova on 13.12.2015.
 */
public class ClimbingStairs
{
	// not very good solution but a solution
	public int getDistinctWaysHashMap(int n)
	{
		if (n < 2)
		{
			return 1;
		}

		int result = 0;
		HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();

		if (memo.containsKey(n))
		{
			return memo.get(n);
		}

		result = getDistinctWaysHashMap(n - 1) + getDistinctWaysHashMap(n - 2);
		memo.put(n, result);
		return result;
	}

	// better solution 1
	public int getDistinctWaysArray(int n)
	{
		if (n == 0)
		{
			return 0;
		}

		if (n == 1)
		{
			return 1;
		}

		if (n == 2)
		{
			return 2;
		}

		int ways[] = new int[n];
		ways[0] = 1;
		ways[1] = 2;

		for (int i = 2; i < n; i++)
		{
			ways[i] = ways[i - 2] + ways[i - 1];
		}

		return ways[n - 1];
	}

	// better solution 2
	public int getDistinctWaysVars(int n)
	{
		if (n == 0)
		{
			return 0;
		}

		if (n == 1)
		{
			return 1;
		}

		if (n == 2)
		{
			return 2;
		}

		int minusTwo = 1;
		int minusOne = 2;
		int current = minusOne;

		for (int i = 2; i < n; i++)
		{
			current = minusTwo + minusOne;
			minusTwo = minusOne;
			minusOne = current;
		}

		return current;
	}

	//better solution 3
	public int getDistinctWaysWhile(int n)
	{
		if (n == 0)
		{
			return 0;
		}

		if (n == 1)
		{
			return 1;
		}

		if (n == 2)
		{
			return 2;
		}

		int step = 1;
		int prestep = 1;
		int temp = 0;

		while (--n > 0)
		{
			temp = step;
			step = step + prestep;
			prestep = temp;
		}

		return step;
	}
}
