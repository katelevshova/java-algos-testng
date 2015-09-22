package com.hally.task78;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Kateryna Levshova
 *
 * @date 22.09.2015
 */
public class StringConverterTest
{
	private StringConverter _stringConverter;

	@BeforeMethod(alwaysRun = true)
	public void setUp()
	{
		_stringConverter = new StringConverter();
	}

	@Test
	public void testConvertStrToInt()
	{
		int actualStr = _stringConverter.stringToInt("1234");
		Assert.assertEquals(actualStr, 1234);
	}

	@Test
	public void testConvertStrToIntWithMinus()
	{
		int actualStr = _stringConverter.stringToInt("-12");
		Assert.assertEquals(actualStr, -12);
	}

	@Test
	public void testConvertStrToIntWithPlus() throws NumberFormatException
	{
		try
		{
			int actualStr = _stringConverter.stringToInt("+12");
			Assert.fail("Should have thrown RuntimeException exception: " + StringConverter
					.PLUS_CHAR_EXCEPTION_ERROR);
		}
		catch (NumberFormatException e)
		{
			Assert.assertEquals(e.getMessage(), StringConverter.PLUS_CHAR_EXCEPTION_ERROR);
		}
	}

	@Test
	public void testConvertStrToIntWithDot()
	{
		int actualStr = _stringConverter.stringToInt("12.34");
		Assert.assertEquals(actualStr, 12);
	}

	@Test
	public void testConvertStrToIntWithWords1()
	{
		int actualStr = _stringConverter.stringToInt("1234 with words");
		Assert.assertEquals(actualStr, 1234);
	}

	@Test
	public void testConvertStrToIntWithWords2()
	{
		int actualStr = _stringConverter.stringToInt("words and 2");
		Assert.assertEquals(actualStr, 0);
	}
}
