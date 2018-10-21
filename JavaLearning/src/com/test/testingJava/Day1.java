package com.test.testingJava;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.day1.background;
import com.test.day1.helloName;

public class Day1 {

	
	@Test
	public void hellname(){
		Assert.assertEquals("Hello Sathish!", helloName.helloName("Sathish"));
		Assert.assertEquals("Hello !", helloName.helloName(""));
		Assert.assertEquals("Hello !", helloName.helloName(null));
	}
	
	@Test
	public void backAround(){
		
		Assert.assertEquals("gdogg", background.backAround("dog"));
		Assert.assertEquals("aaa", background.backAround("a"));
		Assert.assertEquals("", background.backAround(""));
		Assert.assertEquals("", background.backAround(null));
	}
	
	@Test
	public void frontback(){
		
	}
}
