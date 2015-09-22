package com.hally.task78;

/**
 * Big O notation is a way that programmers use to determine how the running speed of an
 * algorithm is affected as the input size is increased.
 *
 * Created by Kateryna Levshova
 *
 * @date 21.09.2015
 */
public class BigONotation
{
	/**
	 * This array takes O(n^2) running time because each element has to be compared with n
	 * elements (where n is the length of the array). Therefore, if we double the input size, we
	 * quadruple the running time.
	 *
	 * @param array
	 * @return
	 */
	boolean hasDuplicates(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			for(int j=0; j < array.length; j++)
			{
				if(array[i] == array[j])
				{
					return true;
				}
			}
		}

		return false;
	}
}
