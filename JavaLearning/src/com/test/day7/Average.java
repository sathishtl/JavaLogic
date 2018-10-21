package com.test.day7;

import java.math.BigDecimal;

public class Average {

	public static void main(String[] args) {
		
		System.out.println("\t");

		// System.out.println(area(2, 4.5));

		// System.out.println(System.getProperty("java.specification.version"));

		String value = " Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

		int s = ' ';// 32

		int a = 'a';// 97
		int z = 'z';// 122

		int aa = 'A';// 65
		int zz = 'Z';// 90

		char[] array = value.toCharArray();

		int smalletter = 0;
		int upperCase = 0;
		int space = 0;
		int special = 0;
		for (char c : array) {
int inValue= c;
			if (inValue >= 97 && inValue <= 122) {
				smalletter++;
			} else if (inValue == 32) {
				space++;
			}

		}

		System.out.println("Small Letter "+ smalletter);
		System.out.println("Space "+ space);

		// System.out.println(perimeter(2.5, 3.5));

		// System.out.println(average());
		// System.out.println(average(5,4,6,7,8));
		//
		// System.out.println(average(5,4,6,7,8,9,3,4));;
	}

	public static int average(int... values) {

		if (values.length == 0)
			return 0;
		int total = 0;
		for (int value : values) {

			total = total + value;

		}

		return total / values.length;
	}

	public static void swap() {

		int a = 8;
		int b = 5;

		b = a + b;// 13 a=8 b=13
		a = b - a;// 5 a=5 b 13
		b = b - a;// 8 a=5 b=8

		String value = "abcd";
		String Value2 = "xyz";

		// do substring..

		System.out.println("a=" + a);
		System.out.println("b=" + b);

	}

	public static double area(double width, double height) {

		return width * height;
	}

	public static double perimeter(double width, double height) {

		double tmp = width + height;
		return 2 * tmp;
	}

	public static double findDistance(double lat1, double lot1, double lat2,
			double lot2) {

		double radius = 6371.01;

		double d = radius
				* radius
				* Math.acos((Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1)
						* Math.cos(lat2) * Math.cos(lot1 - lot2)));

		return d;
	}
}
