package com.test.day2;

public class Front3 {

	public static void main(String[] args) {
		System.out.println(front3("Jav"));
	}
	public static String front3(String pValue){
		if(pValue.length()<3)
			return pValue + pValue +pValue;
		
		return pValue.substring(0, 3) + pValue.substring(0, 3)+pValue.substring(0, 3);
		
	}
}
