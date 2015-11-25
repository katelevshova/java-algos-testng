package com.hally.leetcode;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Kateryna Levshova on 24.11.2015.
 */
public class RomanToInteger
{
	/*
	Task:
	Given a roman numeral, convert it to an integer.
	Input is guaranteed to be within the range from 1 to 3999.
	 */


	public int romanToInt(String s)
	{
		HashMap<Character, Integer> hashMap = new HashMap<>();
		hashMap.put('I', 1);
		hashMap.put('V', 5);
		hashMap.put('X', 10);
		hashMap.put('L', 50);
		hashMap.put('C', 100);
		hashMap.put('D', 500);
		hashMap.put('M', 1000);

		char[] symbols = s.toUpperCase().toCharArray();
		int result = 0;

		for (int i = 0; i < symbols.length - 1; i++)
		{
			if (hashMap.containsKey(symbols[i]) && hashMap.containsKey(symbols[i + 1]))
			{
				if (hashMap.get(symbols[i]) >= hashMap.get(symbols[i + 1]))
				{
					result += hashMap.get(symbols[i]);
				}
				else
				{
					result -= hashMap.get(symbols[i]);
				}
			}
		}

		result += hashMap.get(symbols[symbols.length - 1]);

		return result;
	}
}
