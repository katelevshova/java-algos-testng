package com.hally.leetcode;

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

		String result = "";

		for (int i = s.length()-1; i >= 0; i--)
		{
			result += s.charAt(i);
		}

		return result;
	}
}
