package com.test.day3;

public class StringMakeit {

	
	public static void main(String[] args) {
		
		System.out.println(conCat("abc","cat"));
	}
	
	public static String makeOutWord(String pMask, String pValue){
		//<<>>
		
		char mask=  pMask.charAt(0);
		
		String firstpar= pMask.substring(0,pMask.lastIndexOf(mask)+1);
		
		
		int tmp = pMask.lastIndexOf(mask);
		int leng =pMask.length();
		
		String secondpar=pMask.substring(pMask.lastIndexOf(mask)+1, pMask.length());
		System.out.println(secondpar);
		
		return firstpar+pValue+secondpar;
	}
	public static String firstHalf(String pValue){
		
		int halfLng= pValue.length()/2;
		
		int a = 3/2;
		double b= (double)3/2;
		int rem = 3%2;
		
		
		return pValue.substring(0,  halfLng);
	}
	
	public static String seeColor(String pValue){
		
		
		//abredllllred
		
		if(pValue.indexOf("red") >0 ){
			
			return "red";
		}
		
		
		return"";
	}
	
	public static String conCat(String a, String b){
		
	//a A
		//==
		
		
		
//		if(a.charAt(a.length()) == b.charAt(0)){
//			
//		}
		
		
		if (a.substring(a.length() - 1, a.length()).equals(b.substring(0, 1))) {
			b = b.substring(1, b.length());
		}
		
		return a.concat(b);//a+b
	}
	
	//axjxkm  0,3
}
