package com.hally.number;

/**
 * Created by Kateryna Levshova on 29.04.2016.
 */
public class IsPowerOfTwoSolution
{
	// Given an integer, write a function to determine if it is a power of two.
	public boolean isPowerOfTwo(int n)
	{
		return n <= 0 ? false : (n & (n - 1)) == 0;
	}

	/**
	 * Each number in power 2 ends with all zeroes in binary system.
	 * 2^1 = 2 (10) -> 0010 (2)
	 * 2^2 = 4 (10) -> 0100 (2)
	 * 2^3 = 8 (10) -> 1000 (2)
	 * 2^4 = 16 (10) -> 10000 (2)
	 * But
	 * 2(10) - 1 = 1 (10) -> 0011(2)
	 * 4(10) - 1 = 3 (10) -> 0011(2)
	 * 8(10) - 1 = 7 (10) -> 0111(2)
	 *
	 * We know that bitwise operation & returns 1 if only two 1s otherwise we will receive 0.
	 * Each number in power 2 ends with 0.
	 * Each number not in power 2 ends with 1.
	 */

}
