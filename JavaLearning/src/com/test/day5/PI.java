package com.test.day5;

import java.util.Arrays;

public class PI {

	
	public static void main(String[] args) {
		
		
		System.out.println(Arrays.toString(makePi()));

		System.out.println(makePi());

//		System.out.print('[');
//		int count = 0;
//		for (int a : makePi()) {
//			count++;
//			System.out.print(a + ((makePi().length != count) ? "," : ""));
//		}
//		System.out.print(']');

	}
	
	public static int[] makePi(){
		
		int[] pi= {3,1,4};
		
		return pi;
	}
	
	
	public static boolean commonLastFirst(int[] first, int[] second) {

		if (first[0] == second[0]
				|| first[first.length - 1] == second[second.length - 1]) {
			return true;
		}

		return false;
	}
	
	
	public static int sumArray(int[] values){
		
		int sum =0;
		for (int i : values) {
			sum =sum +i;
		}
		return sum;
	}
	
	public static int[] rotateLeft3(int[] values){
		
		// 1%5 =1   2%5 =2   3%5=3  4%5=4  5%5=0
		
		int[] returnArry= new int[values.length];
		
		for(int ind=0 ;ind< values.length;ind++){
			
			returnArry[ind]= values[(ind+1)%values.length];
			
		}
		
		return returnArry;
	}
}
