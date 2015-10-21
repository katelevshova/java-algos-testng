package com.hally.leetcode;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by Kateryna Levshova
 *
 * @date 02.10.2015
 */
public class NimGameTest
{
	private NimGame _nimGame;
	@BeforeSuite
	public void setUp()
	{
		_nimGame = new NimGame();
	}
	/**
	 * You are playing the following Nim Game with your friend: There is a heap of stones on the
	 * table, each time one of you take turns to remove 1 to 3 stones. The one who removes the last
	 * stone will be the winner. You will take the first turn to remove the stones.
	 * <p/>
	 * Both of you are very clever and have optimal strategies for the game. Write a function to
	 * determine whether you can win the game given the number of stones in the heap.
	 * <p/>
	 * For example, if there are 4 stones in the heap, then you will never win the game: no matter
	 * 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.
	 */

	@Test
	public void testCanWinNim_True()
	{
		Assert.assertTrue(_nimGame.canWinNim(1));
		Assert.assertTrue(_nimGame.canWinNim(2));
		Assert.assertTrue(_nimGame.canWinNim(3));
		Assert.assertTrue(_nimGame.canWinNim(5));
		Assert.assertTrue(_nimGame.canWinNim(6));
		Assert.assertTrue(_nimGame.canWinNim(7));
		Assert.assertTrue(_nimGame.canWinNim(513));
	}

	@Test
	public void testCanWinNim_False()
	{
		Assert.assertFalse(_nimGame.canWinNim(0));
		Assert.assertFalse(_nimGame.canWinNim(4));
		Assert.assertFalse(_nimGame.canWinNim(8));
		Assert.assertFalse(_nimGame.canWinNim(12));
		Assert.assertFalse(_nimGame.canWinNim(16));
		Assert.assertFalse(_nimGame.canWinNim(512));
	}

	@Test
	public void testCanWinNim_Negative()
	{
		Assert.assertFalse(_nimGame.canWinNim(-6));
		Assert.assertFalse(_nimGame.canWinNim(-4));
	}
}
