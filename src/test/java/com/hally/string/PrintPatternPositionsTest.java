package com.hally.string;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Kateryna Levshova on 18.05.2016.
 */
public class PrintPatternPositionsTest
{

	@Test
	public void testPrintPatternPositionsWithIndexOf() throws Exception
	{
		PrintPatternPositions solution = new PrintPatternPositions();
		Assert.assertEquals(solution.printPatternPositionsWithIndexOf("vo vo", "vo"), "0, 3");
		Assert.assertEquals(solution.printPatternPositionsWithIndexOf("vo vo", "voto"), "");
		Assert.assertEquals(solution.printPatternPositionsWithIndexOf("vovo", "vovovovo"), "");
		Assert.assertEquals(solution.printPatternPositionsWithIndexOf("vo vo", "vo vo"), "0");
		Assert.assertEquals(solution.printPatternPositionsWithIndexOf("vvoo mjk", "vo"), "1");
		Assert.assertEquals(solution.printPatternPositionsWithIndexOf("vvoo mjkva", "vo"), "1");
	}
}