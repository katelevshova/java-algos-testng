package com.hally.string;

import com.hally.string.ExcelSheetColumnNumber;

import org.testng.Assert;
import org.testng.annotations.Test;

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

	@Test
	public void testTitleToNumberBestWay_SingleLetter()
	{
		ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();
		Assert.assertEquals(excelSheetColumnNumber.titleToNumberBestWay("A"), 1);
		Assert.assertEquals(excelSheetColumnNumber.titleToNumberBestWay("a"), 1);

		Assert.assertEquals(excelSheetColumnNumber.titleToNumberBestWay("B"), 2);
		Assert.assertEquals(excelSheetColumnNumber.titleToNumberBestWay("b"), 2);

		Assert.assertEquals(excelSheetColumnNumber.titleToNumberBestWay("Z"), 26);
		Assert.assertEquals(excelSheetColumnNumber.titleToNumberBestWay("z"), 26);
	}

	@Test
	public void testTitleToNumberBestWay_TwoLetters()
	{
		ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();
		Assert.assertEquals(excelSheetColumnNumber.titleToNumberBestWay("AA"), 27);
		Assert.assertEquals(excelSheetColumnNumber.titleToNumberBestWay("aA"), 27);

		Assert.assertEquals(excelSheetColumnNumber.titleToNumberBestWay("AB"), 28);
		Assert.assertEquals(excelSheetColumnNumber.titleToNumberBestWay("ab"), 28);

		Assert.assertEquals(excelSheetColumnNumber.titleToNumberBestWay("AZ"), 52);
		Assert.assertEquals(excelSheetColumnNumber.titleToNumberBestWay("Az"), 52);
	}

	@Test
	public void testTitleToNumberBestWay_Abnormal()
	{
		ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();
		Assert.assertEquals(excelSheetColumnNumber.titleToNumberBestWay(""), 0);
		Assert.assertEquals(excelSheetColumnNumber.titleToNumberBestWay("ABC"), 731);
		Assert.assertEquals(excelSheetColumnNumber.titleToNumberBestWay("A4"), 14); // because
		// 'A' is 1 and 4 is 4 => 14
		Assert.assertEquals(excelSheetColumnNumber.titleToNumberBestWay("A*"), 4);
		// 'A' is 65 and '*' is 42
	}
}