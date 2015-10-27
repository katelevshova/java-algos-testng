package com.hally.leetcode;

import java.util.Arrays;

/**
 * Created by Kateryna Levshova on 27.10.2015.
 */
public class MoveZeroesSolution
{
	public int[] moveZeroes(int[] scrArray)
	{
		int i = 0;
		int length = scrArray.length;
		int counter =0;

		while (length > 0)
		{
			i = length - 1;

			if(scrArray[i] == 0)
			{
				counter++;

				int end = scrArray.length - counter;

				for(int j = i; j< end; j++)
				{
					scrArray[j] = scrArray[j+1];
				}

				scrArray[end] = 0;
			}

			length--;
		}

		System.out.println(Arrays.toString(scrArray));

		return scrArray;
	}
}
