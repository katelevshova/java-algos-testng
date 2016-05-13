package com.hally.array;

import com.hally.array.MoveZeroesSolution;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by Kateryna Levshova on 27.10.2015.
 */
public class MoveZeroesSolutionTest
{
	private MoveZeroesSolution _moMoveZeroesSolution;

	@BeforeSuite(alwaysRun = true)
	public void setUp()
	{
		_moMoveZeroesSolution = new MoveZeroesSolution();
	}


	@Test
	public void moveZeroes_1()
	{
		int[] actualArray = _moMoveZeroesSolution.moveZeroes(new int[]{0,1,0,3,12});
		int[] expectedArray = new int[]{1,3,12,0,0};

		Assert.assertTrue(actualArray.length == expectedArray.length);

		for (int i = 0; i < actualArray.length; i++)
		{
			Assert.assertEquals(actualArray[i], expectedArray[i]);
		}
	}


	@Test
	public void moveZeroes_2()
	{
		int[] actualArray = _moMoveZeroesSolution.moveZeroes(new int[]{0,1,0,3,12,0});
		int[] expectedArray = new int[]{1,3,12,0,0,0};

		Assert.assertTrue(actualArray.length == expectedArray.length);

		for (int i = 0; i < actualArray.length; i++)
		{
			Assert.assertEquals(actualArray[i], expectedArray[i]);
		}
	}

	@Test
	public void moveZeroes_3()
	{
		int[] actualArray = _moMoveZeroesSolution.moveZeroes(new int[]{0,1,0,3,12,0,0,0});
		int[] expectedArray = new int[]{1,3,12,0,0,0,0,0};

		Assert.assertTrue(actualArray.length == expectedArray.length);

		for (int i = 0; i < actualArray.length; i++)
		{
			Assert.assertEquals(actualArray[i], expectedArray[i]);
		}
	}

	@Test
	public void moveZeroes_4()
	{
		int[] actualArray = _moMoveZeroesSolution.moveZeroes(new int[]{0,0,0,0,0});
		int[] expectedArray = new int[]{0,0,0,0,0};

		Assert.assertTrue(actualArray.length == expectedArray.length);

		for (int i = 0; i < actualArray.length; i++)
		{
			Assert.assertEquals(actualArray[i], expectedArray[i]);
		}
	}

	@Test
	public void moveZeroes_5()
	{
		int[] actualArray = _moMoveZeroesSolution.moveZeroes(new int[]{5,6,0,0,0});
		int[] expectedArray = new int[]{5,6,0,0,0};

		Assert.assertTrue(actualArray.length == expectedArray.length);

		for (int i = 0; i < actualArray.length; i++)
		{
			Assert.assertEquals(actualArray[i], expectedArray[i]);
		}
	}

	@Test
	public void moveZeroes_6()
	{
		int[] actualArray = _moMoveZeroesSolution.moveZeroes(new int[]{5,6,0,3,0});
		int[] expectedArray = new int[]{5,6,3,0,0};

		Assert.assertTrue(actualArray.length == expectedArray.length);

		for (int i = 0; i < actualArray.length; i++)
		{
			Assert.assertEquals(actualArray[i], expectedArray[i]);
		}
	}
}
