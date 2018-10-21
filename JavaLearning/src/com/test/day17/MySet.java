package com.test.day17;

import java.util.HashSet;
import java.util.TreeSet;

public class MySet {

	
	public static void main(String[] args) {
		
		
		
		HashSet<Object> myset = new HashSet<Object>();
		//List<String> myset=new ArrayList<String>();
		
		
		myset.add("abc");
		myset.add("xyz");
		
		
		myset.add("red");//0
		myset.add("blue");//1
		myset.add("white");//2
		myset.add("black");//3
		
		myset.add(new Integer(234));//3
		
		myset.add(new Boolean(true));//3
		
		myset.add(new Character('j'));//3
		
		
		Object[] strin= myset.toArray();
		
		
	myset.clear();
		
		for (Object string : myset) {

			if(string instanceof Integer){
				System.out.println(string);
			}
			
		}
		
		
		
	}
}
