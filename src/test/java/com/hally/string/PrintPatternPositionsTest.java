package com.hally.string;

import org.testng.Assert;
import org.testng.annotations.Test;

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
		Assert.assertEquals(solution.printPatternPositionsWithIndexOf("23232", "232"), "0");
	}


	@Test
	public void testPrintPatternPositionsRegEx() throws Exception
	{
		PrintPatternPositions solution = new PrintPatternPositions();
		Assert.assertEquals(solution.printPatternPositionsRegEx("vo vo", "vo"), "0, 3");
		Assert.assertEquals(solution.printPatternPositionsRegEx("vo vo", "voto"), "");
		Assert.assertEquals(solution.printPatternPositionsRegEx("vovo", "vovovovo"), "");
		Assert.assertEquals(solution.printPatternPositionsRegEx("vo vo", "vo vo"), "0");
		Assert.assertEquals(solution.printPatternPositionsRegEx("vvoo mjk", "vo"), "1");
		Assert.assertEquals(solution.printPatternPositionsRegEx("vvoo mjkva", "vo"), "1");
		Assert.assertEquals(solution.printPatternPositionsRegEx("23232", "232"), "0");
	}

	@Test
	public void testPrintPatternPositions() throws Exception
	{
		PrintPatternPositions solution = new PrintPatternPositions();
		Assert.assertEquals(solution.printPatternPositions("azvo vo", "vo"), "2, 5");
		Assert.assertEquals(solution.printPatternPositions("vo vo", "voto"), "");
		Assert.assertEquals(solution.printPatternPositions("vovo", "vovovovo"), "");
		Assert.assertEquals(solution.printPatternPositions("vo vo", "vo vo"), "0");
		Assert.assertEquals(solution.printPatternPositions("vvoo mjk", "vo"), "1"); 	// fail
		Assert.assertEquals(solution.printPatternPositions("vvoo mjkva", "vo"), "1");	//fail
		Assert.assertEquals(solution.printPatternPositions("23232", "232"), "0");
	}
}