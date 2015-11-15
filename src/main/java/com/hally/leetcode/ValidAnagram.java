package com.hally.leetcode;

import java.util.Arrays;

/**
 * Created by Kateryna Levshova on 14.11.2015.
 */
public class ValidAnagram
{
	/**
	 * Task:
	 * Given two strings s and t, write a function to determine if t is an anagram of s.

	 For example,
	 s = "anagram", t = "nagaram", return true.
	 s = "rat", t = "car", return false.

	 Note:
	 You may assume the string contains only lowercase alphabets.
	 */

	public boolean isAnagram(String s, String t)
	{
		boolean result = false;

		if(s.length() >= t.length())
		{
			for(int j = 0; j < t.length(); j++)
			{
				if(!isExist(t.charAt(j), s))
				{
					return false;
				}

				result = true;
			}
		}
		else
		{
			result = false;
		}

		return result;
	}

	private boolean isExist(char ch, String source)
	{
		char[] chars = source.toCharArray();

		for (int i = 0; i < chars.length; i++)
		{
			if(chars[i] == ch)
			{
				return true;
			}
		}

		return false;
	}
}
