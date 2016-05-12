package com.hally.number;

/**
 * Created by Oni on 12.02.2016.
 */
public class IsUglySolution
{
	/**
	 *  Write a program to check whether a given number is an ugly number.
	 Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.
	 Note that 1 is typically treated as an ugly number.
	 */
	public boolean isUgly(int num)
	{
		if(num == 1)
		{
			return true;
		}

		if(num < 0)
		{
			num = Math.abs(num);
		}

		int[] divisors = new int[]{2, 3, 5};

		for (int d: divisors )
		{
			while (num%d == 0)
			{
				num = num/d;
			}

		}

		return num == 1;
	}
}
