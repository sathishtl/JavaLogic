package com.test.day1;

public class Exchange {

	
	public static void main(String[] args) {
		System.out.println(frontBack(null));
	}
	
	public static String frontBack(String pValue){
		
		if(pValue == null){
			return "";
		}
		if(pValue.length() >1){
		
			return pValue.charAt(pValue.length()-1)+ pValue.substring(1, pValue.length()-1) + pValue.charAt(0);
		}
		else{
			return pValue;
		}
	}
}
