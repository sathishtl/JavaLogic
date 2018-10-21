package com.test.day1;

public class background {

	public static String backAround(String pValue) {

		
		
		if (null == pValue || pValue.length() == 0)
			return "";

		char lastChar = pValue.charAt(pValue.length() - 1);

		return lastChar + pValue + lastChar;
	}
}
