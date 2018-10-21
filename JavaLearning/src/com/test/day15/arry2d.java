package com.test.day15;

import java.util.HashMap;
import java.util.Set;

public class arry2d {

	//1 2 3 4 5
	//6 7 7 8 9
	//1 3 4 6 7
	
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashmap= new HashMap<Integer, String>();
		
		
		hashmap.put(1, "one");
		hashmap.put(2, "two");
		hashmap.put(3, "three");
		
		hashmap.put(1, "only");
		
		Set<Integer> set= hashmap.keySet();
		
		for (Integer key : set) {
			System.out.println("key :"+key + " Value : "+ hashmap.get(key));
		}
		
		hashmap.clear();
		
		System.out.println(hashmap.size());
		
		HashMap<Integer, String> hashmap2= (HashMap<Integer, String>) hashmap.clone();
	
	}
}
