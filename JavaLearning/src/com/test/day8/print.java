package com.test.day8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class print {

	
	public static void main(String[] args) {
		
		SimpleDateFormat formater =new SimpleDateFormat("yyy/MM/dd hh:mm:ss:SSS aa");
		
		System.out.format(formater.format(new Date()));
		
	}
	
	public static int getAddedValue(int value) {

		return value + 11 * value + 111 * value;
	}
}
