package com.test.day12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Capital {
	
	public static void main(String[] args) {
		
		readFile(args);
	}
	
	public static void readFile(String[] args) {
		
		
		
		try {
			BufferedReader buffer =new BufferedReader(new FileReader("C:\\Sathish\\Oct2018\\abc.txt"));
			
			String strLine="";
			
			while ((strLine = buffer.readLine()) != null) {
				
				System.out.println(strLine);
				
			}
			
			buffer.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void leran_list(String[] args) {


		List<Integer>  list =new ArrayList<Integer>();
		
		list.add(6);
		list.add(2);
		list.add(7);
		

list.isEmpty();
		System.out.println("before clear " + list.toString());
		list.clear();
		
List<Integer>  list2 =new ArrayList<Integer>();
		
		list2.add(11);
		list2.add(4);
		list2.add(17);
		
		//list.addAll(list2);
		
		Collections.sort(list);
		
		System.out.println(list.toString());
		
		
	}

	public static void longest(String[] args) {
		
		String inputValue="According to Wikipedia \"An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,"+
		" typically using all the originalletters exactly once. For example, the word anagram can be rearranged into nag a ram, or the word binary into brainy.\"";
	
	StringTokenizer token =new StringTokenizer(inputValue);
		
		List<String> wordsList=new ArrayList<String>();
		
		while (token.hasMoreElements()) {
			wordsList.add( (String) token.nextElement());
		}
		int maxLength=0;
		String longestWord="";
		for (String word : wordsList) {
			
			if(word.length() > maxLength){
				maxLength= word.length();
				longestWord=word;
			}
		}
	
	System.out.println(longestWord);
	}

	public static void Question58() {
		String inputValue = "Python 3.0";
		String insertValue = " Tutorial ";

		inputValue = inputValue.replace(" ", insertValue);
		System.out.println(inputValue);

	}

	public static void Question57(String[] args) {
		String inputValue = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
		System.out.println(inputValue.toLowerCase());
	}

	public static void Questiion56(String[] args) {
		String input = "the quick brown fox new jumps over the lazy dog";

		StringTokenizer stringInput = new StringTokenizer(input);

		StringBuilder outputValue = new StringBuilder();

		while (stringInput.hasMoreTokens()) {

			String token = stringInput.nextToken();

			token = (token.charAt(0) + "").toUpperCase() + token.substring(1);
			outputValue.append(token + " ");

		}

		System.out.println(outputValue.toString());
	}

}
