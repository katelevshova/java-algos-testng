package com.hally.task78;


import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Kateryna Levshova
 *
 * @date 16.09.2015
 */
public class LookupUtilTest
{
	//Test string with normal data. It ends with vendor name and "\n"
	private static final String TEST_STR_1 =
			"00:00:6E\tArtisoft               # ARTISOFT, INC.\n" +
			"00:00:6F\tMadge                  # Madge Ltd.\n" +
			"00:00:70\tHcl                    # HCL LIMITED\n" +
			"00:00:71\tAdra                   # ADRA SYSTEMS INC.\n" +
			"00:00:72\tMiniware               # MINIWARE TECHNOLOGY\n" +
			"00:00:73\tSiecor                 # SIECOR CORPORATION\n" +
			"00:00:74\tRicoh                  # RICOH COMPANY LTD.\n" +
			"00:00:75\tNortelNe               # Nortel Networks\n" +
			"00:00:76\tAbekasVi               # ABEKAS VIDEO SYSTEM\n" +
			"00:00:77\tInterpha               # INTERPHASE CORPORATION\n" +
			"00:00:78\tLabtam                 # LABTAM LIMITED\n" +
			"00:00:79\tNetworth               # NETWORTH INCORPORATED\n" +
			"00:00:7A\tArdent\n" +
			"00:00:7B\tResearch               # RESEARCH MACHINES\n" +
			"00:00:7C\tAmpere                 # AMPERE INCORPORATED\n";

	// Test string without "\n" in the end of line after the vendor name
	private static final String TEST_STR_2 =
			"00:00:7A\tArdent\n" +
			"00:00:7B\tResearch               # RESEARCH MACHINES\n" +
			"00:00:7C\tAmpere                 # AMPERE INCORPORATED";

	//Test string without a vendor name and "\n" in the end of line
	private static final String TEST_STR_3 =
			"00:00:6E\tArtisoft               # ARTISOFT, INC.\n" +
			"00:00:6F\tMadge                  # Madge Ltd.\n" +
			"00:00:70\tHcl                    # HCL LIMITED\n" +
			"00:00:71\tAdra                   # ADRA SYSTEMS INC.\n" +
			"00:00:79\tNetworth               # NETWORTH INCORPORATED\n" +
			"00:00:7A\tArdent\n" +
			"00:00:7B\tResearch               # RESEARCH MACHINES\n" +
			"00:00:7C\tAmpere                 # AMPERE INCORPORATED\n" +
			"00:00:7D\tCray";

	@Test
	public void testFindVendorNameFirstLine()
	{
		//looking 1st string
		String expectedStr = "ARTISOFT, INC.";
		String actualStr = LookupUtil.findVendorName(TEST_STR_1, "00:00:6E");
		Assert.assertEquals(actualStr, expectedStr);
	}

	@Test
	public void testFindVendorNameInTheMiddle()
	{
		//looking in the middle
		String expectedStr = "ABEKAS VIDEO SYSTEM";
		String actualStr = LookupUtil.findVendorName(TEST_STR_1, "00:00:76");
		Assert.assertEquals(actualStr, expectedStr);
	}

	@Test
	public void testFindVendorNameLastLine()
	{
		//looking at the end of the string
		String expectedStr = "AMPERE INCORPORATED";
		String actualStr = LookupUtil.findVendorName(TEST_STR_1, "00:00:7C");
		Assert.assertEquals(actualStr, expectedStr);
	}

	@Test
	public void testFindVendorNameTestString2()
	{
		// no end of line at the end
		String expectedStr = "AMPERE INCORPORATED";
		String actualStr = LookupUtil.findVendorName(TEST_STR_2, "00:00:7C");
		Assert.assertEquals(actualStr, expectedStr);
	}

	@Test
	public void testFindVendorNameTestString3()
	{
		String expectedStr = "00:00:7A";
		String actualStr = LookupUtil.findVendorName(TEST_STR_3, "00:00:7A");

		Assert.assertEquals(actualStr, expectedStr);

		expectedStr = "00:00:7D";
		actualStr = LookupUtil.findVendorName(TEST_STR_3, "00:00:7D");

		Assert.assertEquals(actualStr, expectedStr);
	}

	@Test
	public void testFindVendorNameNotExist()
	{
		String expectedStr = LookupUtil.NOT_EXIST;
		String actualStr = LookupUtil.findVendorName(TEST_STR_3, "00:00:55");

		Assert.assertEquals(actualStr, expectedStr);
	}
}
