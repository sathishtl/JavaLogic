package com.test.day1;

public class Reverse {

	
	public static void main(String[] args) {
		
		//Hello World, this week no work!
		
		String rerve="Hello World, this week no work!";
		
		int lng= rerve.length();
		
		do{
			lng--;//lng= lng-1
			System.out.print(rerve.charAt(lng));
			
		}while(lng !=0);
		
		lng= rerve.length();
		System.out.println();
		
		
		while(lng!=0){
			lng--;//lng= lng-1
			System.out.print(rerve.charAt(lng));
		}
		
		lng= rerve.length();
		System.out.println();
		
		for (int i = rerve.length()-1; i >=0; i--) {
			System.out.print(rerve.charAt(i));
			
		}
		
		//do while
		//while
		//for loop
	}
}
