package com.test.day10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LearnList {

	
	public static void main(String[] args) {
		
		List<String> mylist= new ArrayList();
		mylist.add("abc");
		mylist.add("xyz");
		
		List<String> list= new ArrayList();
		
		list.add("red");//0
		list.add("blue");//1
		list.add("white");//2
		list.add("black");//3
		
		list.addAll(mylist);
		
		String[]  temp=(String[]) list.toArray();
		
		
		Collections.sort(list);
		
	
		
//		list.set(0, "red changed to brown");
		
//		System.out.println("3rd index value " + list.get(3));
		
		for (String string2 : list) {
			System.out.println(string2);
		}
			
			
			
	}
}
