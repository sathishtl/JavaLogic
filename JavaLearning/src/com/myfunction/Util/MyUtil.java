package com.myfunction.Util;

/**
 * My util
 * 
 * @author i705060
 *
 */
public class MyUtil {

	/**
	 * Add n number of values
	 * 
	 * @param value
	 *            value as integer for addition
	 * @return
	 */
	public static int add(int... value) {
		int total = 0;
		for (int i : value) {
			total = total + i;
		}
		return total;
	}

	/**
	 * Add two values
	 * 
	 * @param value
	 * @param value2
	 * @return
	 */
	public static int add(int value, int value2) {
		return value + value2;
	}

	/**
	 * Sub two values
	 * 
	 * @param value
	 * @param value2
	 * @return
	 */
	public static int sub(int value, int value2) {
		return value - value2;
	}
}
