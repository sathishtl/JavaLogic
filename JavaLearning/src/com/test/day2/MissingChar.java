package com.test.day2;

public class MissingChar {
	
	public static void main(String[] args) {
		System.out.println(missingChar("kitten", 1));
	}

	public static String missingChar(String pValue, int index) {
		
		int count = 0;

		String returnValue = "";
		while (count != pValue.length()) {

			if (count != index) {
				returnValue = returnValue + pValue.charAt(count);
			}
			count++;
		}
		return returnValue;
	}
}
