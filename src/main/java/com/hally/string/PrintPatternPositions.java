package com.hally.string;

import java.util.HashMap;

/**
 * Created by Kateryna Levshova on 12.05.2016.
 */
public class PrintPatternPositions
{
	/**
	 * Task: Given a string print all positions of word pattern in it. Function similar to indexOf()
	 * Example: "makaroni o vse oni on voobshe" Print: "5, 15"
	 */
	public String printPatternPositionsWithIndexOf(String source, String pattern)
	{
		int lastIndex = 0;
		String result = "";

		if (pattern.length() > source.length())
		{
			return "";
		}

		while (lastIndex != -1)
		{
			lastIndex = source.indexOf(pattern, lastIndex);

			if (lastIndex != -1)
			{
				result += lastIndex + ", ";
				lastIndex += pattern.length();
			}
		}

		if (result == "")
		{
			return result;
		}
		else
		{
			return result.substring(0, result.length() - 2);
		}
	}

	public String printPatternPositions(String source, String pattern)
	{
		String result = "";
		return result;
	}
}
