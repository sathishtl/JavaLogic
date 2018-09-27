package com.test.day1;

public class helloName {

	
	public static void main(String[] args) {
		
		System.out.println(helloName("Sathish"));
	}
	
	public static String helloName(String pname) {
		if (pname == null) {
			pname = "";
		}
		return "Hello " + pname + "!";
	}
}
