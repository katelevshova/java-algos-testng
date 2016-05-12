package com.hally.number;

import java.util.HashMap;

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


	public int romanToInt(String str)
	{
		HashMap<Character, Integer> hashMap = new HashMap<>();
		hashMap.put('I', 1);
		hashMap.put('V', 5);
		hashMap.put('X', 10);
		hashMap.put('L', 50);
		hashMap.put('C', 100);
		hashMap.put('D', 500);
		hashMap.put('M', 1000);

		char[] symbols = str.toUpperCase().toCharArray();
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

	public int romanToIntCharCodes(String str)
	{
		int[] a = new int[26];
		a['I' - 'A'] = 1;
		a['V' - 'A'] = 5;
		a['X' - 'A'] = 10;
		a['L' - 'A'] = 50;
		a['C' - 'A'] = 100;
		a['D' - 'A'] = 500;
		a['M' - 'A'] = 1000;

		char prev = 'A';
		int sum = 0;

		for (char s : str.toCharArray())
		{
			if (a[s - 'A'] > a[prev - 'A'])
			{
				sum = sum - 2 * a[prev - 'A'];
			}
			sum = sum + a[s - 'A'];
			prev = s;
		}

		return sum;
	}

	public int romanToIntSwitch(String s)
	{
		int nums[] = new int[s.length()];

		for (int i = 0; i < s.length(); i++)
		{
			switch (s.charAt(i))
			{
				case 'M':
					nums[i] = 1000;
					break;
				case 'D':
					nums[i] = 500;
					break;
				case 'C':
					nums[i] = 100;
					break;
				case 'L':
					nums[i] = 50;
					break;
				case 'X':
					nums[i] = 10;
					break;
				case 'V':
					nums[i] = 5;
					break;
				case 'I':
					nums[i] = 1;
					break;
			}
		}

		int sum = 0;

		for (int i = 0; i < nums.length - 1; i++)
		{
			if (nums[i] < nums[i + 1])
			{
				sum -= nums[i];
			}
			else
			{
				sum += nums[i];
			}
		}
		return sum + nums[nums.length - 1];
	}
}
