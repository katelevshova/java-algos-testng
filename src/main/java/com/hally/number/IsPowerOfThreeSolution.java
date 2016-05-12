package com.hally.number;

/**
 * Created by Kateryna Levshova on 29.04.2016.
 */
public class IsPowerOfThreeSolution
{
	public boolean isPowerOfThreeLoop(int n)
	{
		if (n > 1)
		{
			while (n % 3 == 0)
			{
				n /= 3;
			}
		}
		return n == 1;
	}

	public boolean isPowerOfThreeRecursive(int n)
	{
		return n > 0 && (n == 1 || (n % 3 == 0 && isPowerOfThreeRecursive(n / 3)));
	}

	public boolean isPowerOfThreeHardCoded(int n)
	{
		int max3PowerInt = 1162261467; // 3^19, 3^20 =
		//Typically, Log(x, y) is not O(1), it should be O(ln(N)), which just hides the loop/recursion .
		return n > 0 && (max3PowerInt % n == 0);
	}

	public boolean isPowerOfThreeLog(int n)
	{
		return (Math.log10(n) / Math.log10(3)) % 1 == 0;
	}

	public boolean isPowerOfThreeMath(int n)
	{
		return n == 0 ? false : n == Math.pow(3, Math.round(Math.log(n) / Math.log(3)));
	}
}
