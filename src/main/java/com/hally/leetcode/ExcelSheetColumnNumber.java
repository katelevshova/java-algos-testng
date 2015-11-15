package com.hally.leetcode;

import java.util.Hashtable;

/**
 * Created by Kateryna Levshova on 13.11.2015.
 */
public class ExcelSheetColumnNumber
{
	/**
	 * Task: Given a column title as appear in an Excel sheet, return its corresponding column
	 * number. For example: A -> 1 B -> 2 C -> 3 ... Z -> 26 AA -> 27 AB -> 28
	 */

	public int titleToNumber(String s)
	{
		if (s == "")
		{
			return 0;
		}

		int result = 0;

		char[] alphabet = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
				'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

		Hashtable<Character, Integer> hashtable = new Hashtable<>();
		int counter = 0;

		for (char ch : alphabet)
		{
			if (!hashtable.containsKey(ch))
			{
				counter++;
				hashtable.put(ch, counter);
			}
		}

		char[] source = s.toUpperCase().toCharArray();

		for (Character ch: source)
		{
			if(!hashtable.containsKey(ch))
			{
				return 0;
			}
		}

		if (source.length == 2)
		{
			result = alphabet.length * hashtable.get(source[0]) + hashtable.get(source[1]);
		}
		else if (source.length == 1)
		{
			result = hashtable.get(source[0]);
		}

		return result;
	}
}
