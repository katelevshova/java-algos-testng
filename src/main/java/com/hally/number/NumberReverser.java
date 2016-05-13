package com.hally.number;

/**
 *	Task if given a number 12345 print a reverse number 54321 without String or Array.
 *  @author Kateryna Levshova
 * @date 01.10.2015
 */
public class NumberReverser
{
	public static final String CLASS_NAME = NumberReverser.class.getName();
	public static final String ERROR = "Reversed number is not in Integer bounds";

	public int reverse(int srcNumber)
	{
		int reversedNumber = 0;

		while (srcNumber != 0)
		{
			int lastDigit = srcNumber%10;
			reversedNumber = reversedNumber*10 + lastDigit;
			srcNumber = srcNumber/10;
		}

		if(reversedNumber > Integer.MAX_VALUE || reversedNumber < Integer.MIN_VALUE)
		{
			throw new IllegalArgumentException(ERROR);
		}

		return reversedNumber;
	}
}
