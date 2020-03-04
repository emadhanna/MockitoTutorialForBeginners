package com.in28minutes.juint.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	//Using Arrays.sort function
	@Test
	public void testArraysSort_RandomArray() {

		int[] numbers = {12, 3, 4, 1};
		int[] expected = { 1, 3, 4, 12};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	
	@Test(expected=NullPointerException.class)
	public void testArraysSort_NullArray() {
		int[] numbers = null;
		Arrays.sort(numbers);
	}
	
	@Test(timeout=15)
	public void testSort_Performance() {
		int numbers[] = {12, 23, 4};
		for (int count= 1; count < 1000000; count++) {
			numbers[0] = count;
			Arrays.sort(numbers);
		}
	}
}
