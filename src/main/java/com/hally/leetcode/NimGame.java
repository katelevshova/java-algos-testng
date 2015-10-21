package com.hally.leetcode;

/**
 * Created by Kateryna Levshova
 *
 * @date 02.10.2015
 */
public class NimGame
{
	private static final int max = 3;

	public boolean canWinNim(int n)
	{
		if(n < 1)
		{
			return false;
		}

		int remaining = n % (max + 1);
		return (remaining <= max && remaining != 0);
	}
}
