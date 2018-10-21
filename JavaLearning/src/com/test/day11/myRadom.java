package com.test.day11;

import java.util.ArrayList;
import java.util.List;

public class myRadom {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			threeAndFive(i);
		}
		System.out.println("Div by 3: ");
		for (Integer three : three) {
			System.out.print(three+",");
		}
		System.out.println("\nDiv by 5: ");
		for (Integer three : five) {
			System.out.print(three+",");
		}
		
		System.out.println("\nDiv by 3 and 5: ");
		for (Integer three : threeFive) {
			System.out.print(three+",");
		}
	}

	static List<Integer> threeFive = new ArrayList<Integer>();
	static List<Integer> three = new ArrayList<Integer>();
	static List<Integer> five = new ArrayList<Integer>();

	public static void threeAndFive(int value) {

		if (value % 3 == 0 && value % 5 == 0) {
			threeFive.add(value);
		}
		if (value % 3 == 0)
			three.add(value);
		if (value % 5 == 0)
			five.add(value);
	}

	public static void evenodd(int value) {

		System.out.println(value % 2 == 1 ? "0" : "1");
	}
}
