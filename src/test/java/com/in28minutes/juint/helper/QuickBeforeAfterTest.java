package com.in28minutes.juint.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@BeforeClass
	public static void beforeClassTest() {
		System.out.println("Before Testing Anything in the Class");
	} 
	
	@Before
	public void setup() {
		System.out.println("Before Test");
	}
	
	@Test
	public void test1() {
		System.out.println("test 1 executed");
	}
	
	@Test
	public void test2() {
		System.out.println("test 2 executed");
	}
	
	@After
	public void teardown() {
		System.out.println("After Test");
	}
	
	@AfterClass
	public static void afterClassTest() {
		System.out.println("After Testing Anything in the Class");
	}
}
