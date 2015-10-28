package com.hally.leetcode;

/**
 * Created by Kateryna Levshova on 21.10.2015.
 */
public class AddDigitsSolution
{
	public static final String ERROR = "Num must be > 0";
	/**
	 *  Task:
	 *  Given a non-negative integer num, repeatedly add all its digits until the result has only
	 *  one digit.  For example:
	 *  Given num = 38, the process is like:
	 *  3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
	 */
	public int addDigits(int num) throws Exception
	{
		if(num > 9)
		{
			int result = num % 9;

			if(result == 0)
			{
				return 9;
			}
			else
			{
				return result;
			}
		}
		else if (num > 0)
		{
			return num;
		}
		else
		{
			throw new Exception(ERROR);
		}
	}
}
