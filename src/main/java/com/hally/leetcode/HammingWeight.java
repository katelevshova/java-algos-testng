package com.hally.leetcode;

/**
 * Created by Kateryna Levshova on 14.11.2015.
 */
public class HammingWeight
{
	/**
	 * Task:
	 * Write a function that takes an unsigned integer and returns the number of '1' bits it
	 * has (also known as the Hamming weight).
	 * For example, the 32-bit integer '11' has binary
	 * representation 00000000000000000000000000001011,
	 * so the function should return 3.
	 */

	public int hammingWeight(int n)
	{
		String binaryString = Integer.toBinaryString(n);

		char[] chars = binaryString.toCharArray();

		int bits1Counter = 0;

		for(int i = 0; i < chars.length; i++)
		{
			if(chars[i] == '1')
			{
				bits1Counter++;
			}
		}

		return bits1Counter;
	}

	public int hammingWeightBestSolution(int n)
	{
		int bits1Counter = 0;
		String tmp = Integer.toBinaryString(n);

		for(int i = 0; i < 32; i++)
		{
			if( (n & 1) == 1)
			{
				bits1Counter++;
			}

			n = n >>> 1;
		}

		return bits1Counter;
	}
}
