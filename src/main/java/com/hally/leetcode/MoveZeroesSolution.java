package com.hally.leetcode;

import java.util.Arrays;

/**
 * Created by Kateryna Levshova on 27.10.2015.
 */
public class MoveZeroesSolution
{
	/**
	 * Task:
	 *  Given an array scrArray, write a function to move all 0's to the end of it while maintaining
	 *  the relative order of the non-zero elements.
	 *  For example, given scrArray = [0, 1, 0, 3, 12], after calling your function,
	 *  scrArray should be [1, 3, 12, 0, 0].
	 *  You must do this in-place without making a copy of the array.
	 *  Minimize the total number of operations.
	 */

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
