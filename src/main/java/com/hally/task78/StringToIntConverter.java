package com.hally.task78;

/**
 * Created by Kateryna Levshova
 *
 * @date 22.09.2015
 */
public class StringToIntConverter
{
	public static String PLUS_CHAR_EXCEPTION_ERROR = "Do not use + for positive values";
	private static final int ZERO = 48; // ASCII code of zero '0'
	private static final int NINE = 57; // ASCII code of zero '9'

	/**
	 * Converts an ASCII string into an integer
	 * @param src
	 * @return
	 */
	public int convert(String src) throws NumberFormatException
	{
		boolean isNegative = false;
		int total = 0;
		int result = 0;

		char[] charArray = src.toCharArray();

		for (int i = 0; i < charArray.length; i++)
		{
			if (charArray[0] == '-' && i == 0) // if it is negative
			{
				isNegative = true;
			}
			else if (charArray[0] == '+' && i == 0) // if it is positive with '+' char
			{
				throw new NumberFormatException(PLUS_CHAR_EXCEPTION_ERROR);
			}
			else
			{
				if(charArray[i] - ZERO > 0 && charArray[i] < NINE)
				{
					total = total * 10 + charArray[i] - ZERO;
				}
				else
				{
					break;
				}
			}
		}

		result = total;

		if (isNegative)
		{
			result = -total; //inverse
		}

		return result;
	}

	/**
	 * Limitations: it only works if the string consists of an optional negative sign followed by
	 * digits.
	 * If the number is too big the result will be incorrect due to overflow.
	 */
}
