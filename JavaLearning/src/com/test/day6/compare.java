package com.test.day6;

import java.util.Arrays;
import java.util.Scanner;

public class compare {
	
	public static void main(String[] args) {
		
		//System.out.println(Arrays.toString(args));
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Enter the a value:");
		int a = scan.nextInt();
	
		
		for (int i = 1; i <= 10; i++) {
			
			
			System.out.println(a + " X "+ i +" = "+ a*i);
		}
		
		//System.out.println(compareArray(first, first));
		
		
		//System.out.println(74+36);
		
		//System.out.println(Arrays.toString(maxEnd3(second)));
	}

	
	private static int[] maxEnd3(int[] arrayValue) {


		int maxValue = 0;
		if (arrayValue[0] >= arrayValue[arrayValue.length - 1]) {
			maxValue = arrayValue[0];
		} else {
			maxValue = arrayValue[arrayValue.length - 1];
		}
		
		for (int i = 0; i < arrayValue.length; i++) {
			arrayValue[i] =maxValue;
		}
		
		return arrayValue;
	}


	public static boolean compareArray(int[] first, int[] second){
	
		Arrays.equals(first, second);
		
		if(first.length != second.length)
			return false;
		
		for (int index = 0; index < first.length; index++) {
			
			if(first[index] != second[index])
				return false;
			
		}
		
		
		return true;
	}
}
