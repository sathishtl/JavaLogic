package com.test.day3;

public class Rotate {

	public static void main(String[] args) {
		System.out.println(countXX("fghxxxx"));
	}

	public static String rotate2(String pValue) {

		String tmp = pValue.substring(pValue.length() - 2, pValue.length());

		String tmp2 = pValue.substring(0, pValue.length() - 2);

		return tmp + tmp2;

	}

	public static String withouEnd2(String pValue) {

		return pValue.substring(1, pValue.length() - 1);
	}

	public static int DoubleSum(int a, int b) {

		return (a == b) ? 2 * (a + b) : a + b;

	}

	public static int diff21(int value) {

		if (value > 21)
			return 2 * Math.abs(value - 21);

		return Math.abs(value - 21);
	}
	
	public static int countXX(String pValue) {

		int count = 0;

		int totalXX = 0;

		while (count < pValue.length() - 1) {

			if (pValue.charAt(count) == 'x' && pValue.charAt(count + 1) == 'x') {
				totalXX++;
			}
			count++;
		}

		return totalXX;
	}
}
