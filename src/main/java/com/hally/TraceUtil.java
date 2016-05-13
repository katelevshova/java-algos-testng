package com.hally;

/**
 * Created by Kateryna Levshova
 *
 * @date 16.09.2015
 */
public class TraceUtil
{
	private static final String CLASS_NAME = TraceUtil.class.getSimpleName();
	private static final String methodSeparator1 = "->";
	private static final String methodSeparator2 = ": ";
	private static final String classSeparator1 = " [";
	private static final String classSeparator2 = "]";
	private static boolean IS_DEBUG_MODE_ENABLED = true; //TODO: changed it to false before release

	private static TraceUtil _traceUtilInst;
	private static boolean _isInstantiationAllowed = false;

	public static TraceUtil getInstance()
	{
		if (_traceUtilInst == null)
		{
			_isInstantiationAllowed = true;
			_traceUtilInst = new TraceUtil();
			_isInstantiationAllowed = false;
		}
		return _traceUtilInst;
	}

	private void TraceUtil()
	{
		if (!_isInstantiationAllowed)
		{
			String errorMessage =
					"You cannot use Constructor to create an instance of this class. " +
							"Instead of it please use TraceUtil.getInstance().";
			logD(CLASS_NAME, "Constructor", errorMessage);
			throw new IllegalArgumentException(errorMessage);
		}
	}

	/**
	 * Sends a log message if <code>IS_DEBUG_MODE_ENABLED=true</code>.
	 *
	 * @param methodName Used to identify the source of a log message.  It usually identifies the
	 *                   class or activity where the log call occurs.
	 * @param msg        The message you would like logged.
	 */
	public static void logD(String className, String methodName, Object msg)
	{
		if (IS_DEBUG_MODE_ENABLED)
		{
			System.out.println(getTraceMessageFormat(className, methodName) + msg.toString());
		}
	}

	/**
	 * Created message string. Example:  [TraceUtil]->logD:
	 *
	 * @param className
	 * @param methodName
	 * @return
	 */
	public static String getTraceMessageFormat(String className, String methodName)
	{
		return classSeparator1 + className + classSeparator2 + methodSeparator1 + methodName +
				methodSeparator2;
	}

}
