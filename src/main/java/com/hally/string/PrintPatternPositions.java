package com.hally.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Kateryna Levshova on 12.05.2016.
 */
public class PrintPatternPositions
{
	/**
	 * Task: Given a string print all positions of word occurrences in it. Example: "makaroni o vse
	 * oni on voobshe" Print: "5, 15"
	 */
	public String printPatternPositionsWithIndexOf(String source, String findStr)
	{
		int lastIndex = 0;
		String result = "";

		if (findStr.length() > source.length())
		{
			return "";
		}

		while (lastIndex != -1)
		{
			lastIndex = source.indexOf(findStr, lastIndex);

			if (lastIndex != -1)
			{
				result += lastIndex + ", ";
				lastIndex += findStr.length();
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

	public String printPatternPositionsRegEx(String source, String findStr)
	{
		String result = "";

		if (findStr.length() > source.length())
		{
			return "";
		}

		Pattern pattern = Pattern.compile(findStr);
		Matcher matcher = pattern.matcher(source);

		while (matcher.find())
		{
			result += matcher.start() + ", ";
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

	// the worst solution. It also has 2 failed tests
	public String printPatternPositions(String source, String findStr)
	{
		String result = "";

		if (findStr.length() > source.length())
		{
			return "";
		}

		boolean flag = false;
		int index = 0;

		for (int i = 0; i < source.length(); i++)
		{
			for (int j = 0; j < findStr.length(); j++)
			{
				if(  source.charAt(i) == findStr.charAt(j))
				{
					if(flag == false)
					{
						index = i;
					}

					if(i != source.length() -1)
					{
						i++;
					}

					flag = true;
				}
				else
				{
					flag = false;
					break;
				}

				if(flag == true && j == findStr.length()-1)
				{
					result += index + ", ";
					flag = false;
				}
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
}
