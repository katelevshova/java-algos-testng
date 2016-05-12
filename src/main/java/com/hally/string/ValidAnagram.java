package com.hally.string;

import java.util.Arrays;
import java.util.Objects;

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

	public boolean isAnagramBestSolution(String s, String t)
	{
		if(s.length() < t.length() )
		{
			return false;
		}

		char[] chars1 = s.toCharArray();
		char[] chars2 = t.toCharArray();

		Arrays.sort(chars1); // Arrays.sort() is implemented using Dual-Pivot QuickSort - O(n*logn)
		Arrays.sort(chars2);

		return Objects.equals(String.valueOf(chars1), String.valueOf(chars2));
	}
}
