package com.hally.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Kateryna Levshova on 13.11.2015.
 */
public class ExcelSheetColumnNumberTest
{
	@Test
	public void testTitleToNumber_SingleLetter()
	{
		ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();
		Assert.assertEquals(excelSheetColumnNumber.titleToNumber("A"), 1);
		Assert.assertEquals(excelSheetColumnNumber.titleToNumber("a"), 1);

		Assert.assertEquals(excelSheetColumnNumber.titleToNumber("B"), 2);
		Assert.assertEquals(excelSheetColumnNumber.titleToNumber("b"), 2);

		Assert.assertEquals(excelSheetColumnNumber.titleToNumber("Z"), 26);
		Assert.assertEquals(excelSheetColumnNumber.titleToNumber("z"), 26);
	}

	@Test
	public void testTitleToNumber_TwoLetters()
	{
		ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();
		Assert.assertEquals(excelSheetColumnNumber.titleToNumber("AA"), 27);
		Assert.assertEquals(excelSheetColumnNumber.titleToNumber("aA"), 27);

		Assert.assertEquals(excelSheetColumnNumber.titleToNumber("AB"), 28);
		Assert.assertEquals(excelSheetColumnNumber.titleToNumber("ab"), 28);

		Assert.assertEquals(excelSheetColumnNumber.titleToNumber("AZ"), 52);
		Assert.assertEquals(excelSheetColumnNumber.titleToNumber("Az"), 52);
	}

	@Test
	public void testTitleToNumber_Abnormal()
	{
		ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();
		Assert.assertEquals(excelSheetColumnNumber.titleToNumber(""), 0);

		Assert.assertEquals(excelSheetColumnNumber.titleToNumber("ABC"), 0);
		Assert.assertEquals(excelSheetColumnNumber.titleToNumber("A4"), 0);
	}
}