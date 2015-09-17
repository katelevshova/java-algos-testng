package com.hally.task78;

/**
 * Created by Kateryna Levshova
 * @date 16.09.2015
 */
public class LookupUtil
{
	public static final String NOT_EXIST = "Not exist";
	public static final String SHARP_SPACE_STR = "# ";
	public static final String EOL_CHAR = "\n";
	public static final String CLASS_NAME = LookupUtil.class.getName();

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

	public static String substrVendorName(String searchStr, String bssId)
	{
//		Log.d(CLASS_NAME, "splitedStr[0]=searchStr= "+searchStr);
		String result = "";

		int start = searchStr.indexOf(SHARP_SPACE_STR);
		int end = searchStr.length();

		if (start == -1)
		{
//			Log.d(CLASS_NAME, "description is not exist, result= "+bssId);
			return bssId;
		}

		result = searchStr.substring(start + SHARP_SPACE_STR.length(), end);
//		Log.d(CLASS_NAME, "result= "+result);
		return result;
	}
}
