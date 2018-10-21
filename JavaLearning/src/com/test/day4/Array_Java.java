package com.test.day4;

public class Array_Java {

	public static void main(String[] args) {

		// int[] arr2 = new int[3];
		//
		// arr2[0]=4;
		//
		// System.out.println(arr2.length);
		//
		//
		//
		//

		int[] ar = {};

		//firstLast6(ar);

		System.out.println(sameFirstLast(ar));
	}

	private static boolean sameFirstLast(int[] ar) {

		if (ar.length>1 & ar[0] == 1 && ar[ar.length - 1] == 1) {
			return true;
		}
		return false;
	}

	
	
	
	
	
	
	
	
	
	private static boolean firstLast6(int[] arry) {

		if (arry.length < 1) {
			return false;
		}

		if (arry[0] == 1 || arry[arry.length - 1] == 1) {
			return true;
		}
		return false;
	}

}
