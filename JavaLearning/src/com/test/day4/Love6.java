package com.test.day4;

public class Love6 {

	public static void main(String[] args) {

		//System.out.println(Love6(4, 2));
		
		System.out.println(doubleChar("The double"));
	}

	private static String doubleChar(String string) {

		String returnValue="";
		
		char[]  arrayChar= string.toCharArray();
		
		for (int i = 0; i < arrayChar.length; i++) {
			
			returnValue= returnValue + arrayChar[i] +arrayChar[i];
		}
		
		
//['T','H','E'...]
		
		for (char element : string.toCharArray()) {
			
			returnValue= returnValue + element +element;
		}
		
		return returnValue;
		
	}

	public static boolean Love6(int a, int b) {

		if (a == 6 || b == 6) {
			return true;
		}

		if (Math.abs(a - b) == 6)
			return true;
		return (Math.abs(a + b) == 6) ? true : false;
	}
	
	
	// true or true = true
	// true or false =true
	// false or true =true
	// false or false =false.

	// true and true = true
	// true and false =false
	// false and true =false
	// false and false =false.
}
