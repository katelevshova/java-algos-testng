package com.hally.string;

import com.hally.TraceUtil;

/**
 * Class LookupUtil searches a vendor name in a string based on bssId
 * Created by Kateryna Levshova
 * @date 16.09.2015
 */
public class LookupUtil
{
	public static final String NOT_EXIST = "Not exist";
	public static final String SHARP_SPACE_STR = "# ";
	public static final String EOL_CHAR = "\n";
	public static final String CLASS_NAME = LookupUtil.class.getName();

	/**
	 * Returns:
	 * vendor name based on its bssId, example "ARTISOFT, INC."
	 * bssId if it does not have a vendor name, example "00:00:6F"
	 * "Not exist" if bssId does not exist.
	 * @param text - String from file, contains all vendors
	 * @param bssId - example "00:00:6F"
	 * @return
	 */
	public static String findVendorName(String text, String bssId)
	{
		if (text.contains(bssId))
		{
			int bssIdStartIndex = text.indexOf(bssId);
			String searchPartString = text.substring(bssIdStartIndex);
			int endIndex = searchPartString.indexOf(EOL_CHAR);

			if (endIndex == -1)
			{
				endIndex = searchPartString.length();
			}

			String oneVendorStr = searchPartString.substring(0, endIndex);
			return substrVendorName(oneVendorStr, bssId);
		}
		else
		{
			return NOT_EXIST;
		}
	}

	/**
	 * Returns vendor name or bssId
	 * @param searchStr - one line for vendor with bssId. Example "00:00:6E	Artisoft               # ARTISOFT, INC."
	 * @param bssId - example "00:00:6F"
	 * @return
	 */
	public static String substrVendorName(String searchStr, String bssId)
	{
		TraceUtil.logD(CLASS_NAME, "substrVendorName", "splitedStr[0]=searchStr= " + searchStr);
		String result = "";

		int start = searchStr.indexOf(SHARP_SPACE_STR);
		int end = searchStr.length();

		if (start == -1)
		{
			TraceUtil.logD(CLASS_NAME, "substrVendorName", "description does not exist, result= " +
					bssId);
			return bssId;
		}

		result = searchStr.substring(start + SHARP_SPACE_STR.length(), end);
		TraceUtil.logD(CLASS_NAME, "substrVendorName", "result= " + result);
		return result;
	}
}
