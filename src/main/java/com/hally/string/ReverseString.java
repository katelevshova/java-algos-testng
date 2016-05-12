package com.hally.string;

/**
 * Created by Kateryna Levshova on 29.04.2016.
 */
public class ReverseString
{
	public String reverseString(String s)
	{
		if (s.length() < 2)
		{
			return s;
		}

		StringBuilder result = new StringBuilder();
		int counter = s.length() - 1;

		while (counter >= 0)
		{
			result = result.append(s.charAt(counter));
			counter --;
		}

		return result.toString();
	}
}
