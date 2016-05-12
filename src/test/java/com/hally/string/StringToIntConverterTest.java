package com.hally.string;

import com.hally.string.StringToIntConverter;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Kateryna Levshova
 *
 * @date 22.09.2015
 */
public class StringToIntConverterTest
{
	private StringToIntConverter _stringToIntConverter;

	@BeforeMethod(alwaysRun = true)
	public void setUp()
	{
		_stringToIntConverter = new StringToIntConverter();
	}

	@Test
	public void testConvertStrToInt()
	{
		int actualStr = _stringToIntConverter.convert("1234");
		Assert.assertEquals(actualStr, 1234);
	}

	@Test
	public void testConvertStrToIntWithMinus()
	{
		int actualStr = _stringToIntConverter.convert("-12");
		Assert.assertEquals(actualStr, -12);
	}

	@Test
	public void testConvertStrToIntWithPlus() throws NumberFormatException
	{
		try
		{
			int actualStr = _stringToIntConverter.convert("+12");
			Assert.fail("Should have thrown RuntimeException exception: " + StringToIntConverter
					.PLUS_CHAR_EXCEPTION_ERROR);
		}
		catch (NumberFormatException e)
		{
			Assert.assertEquals(e.getMessage(), StringToIntConverter.PLUS_CHAR_EXCEPTION_ERROR);
		}
	}

	@Test
	public void testConvertStrToIntWithDot()
	{
		int actualStr = _stringToIntConverter.convert("12.34");
		Assert.assertEquals(actualStr, 12);
	}

	@Test
	public void testConvertStrToIntWithWords1()
	{
		int actualStr = _stringToIntConverter.convert("1234 with words");
		Assert.assertEquals(actualStr, 1234);
	}

	@Test
	public void testConvertStrToIntWithWords2()
	{
		int actualStr = _stringToIntConverter.convert("words and 2");
		Assert.assertEquals(actualStr, 0);
	}
}
