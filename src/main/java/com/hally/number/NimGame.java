package com.hally.number;

/**
 * Created by Kateryna Levshova
 *
 * @date 02.10.2015
 */
public class NimGame
{
	private static final int max = 3;

	/**
	 * Task:
	 * You are playing the following Nim Game with your friend: There is a heap of stones on the
	 * table, each time one of you take turns to remove 1 to 3 stones. The one who removes the last
	 * stone will be the winner. You will take the first turn to remove the stones.
	 * Both of you are very clever and have optimal strategies for the game. Write a function to
	 * determine whether you can win the game given the number of stones in the heap.
	 * For example, if there are 4 stones in the heap, then you will never win the game: no matter
	 * 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.
	 */

	//NOTE: 0 ms
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
