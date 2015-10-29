package com.hally.leetcode;

import java.util.Arrays;

/**
 * Created by Kateryna Levshova on 27.10.2015.
 */
public class MoveZeroesSolution
{
	/**
	 * Task: Given an array scrArray, write a function to move all 0's to the end of it while
	 * maintaining the relative order of the non-zero elements. For example, given scrArray = [0, 1,
	 * 0, 3, 12], after calling your function, scrArray should be [1, 3, 12, 0, 0]. You must do this
	 * in-place without making a copy of the array. Minimize the total number of operations.
	 */

	//NOTE: 20 ms
	public int[] moveZeroes(int[] scrArray)
	{
		int iterator = scrArray.length;
		int counter = 0;

		//start search of zeroes from the tail
		while (iterator > 0)
		{
			// find zero
			if (scrArray[iterator - 1] == 0)
			{
				counter++;

				// rearrange all elements placed between position of zero and appropriate end
				for (int j = iterator - 1; j < scrArray.length - counter; j++)
				{
					scrArray[j] = scrArray[j + 1];
				}
				// move zero to the appropriate end position
				scrArray[scrArray.length - counter] = 0;
			}
			iterator--;
		}

		System.out.println(Arrays.toString(scrArray));
		return scrArray;
	}
}
