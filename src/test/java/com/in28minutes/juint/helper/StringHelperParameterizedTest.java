package com.in28minutes.juint.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

	private String givenInputs;
	private String expectedOutputs;
		
	StringHelper helper = new StringHelper();
		
	public StringHelperParameterizedTest(String givenInputs, String expectedOutputs) {
		super();
		this.givenInputs = givenInputs;
		this.expectedOutputs = expectedOutputs;
	}

	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutputs [][] = { {"AACD", "CD"},
										{"ACD", "CD"},
										{"CDAA", "CDAA"},
										{"CDEF", "CDEF"} };
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void testTruncateAInFirst2Positions1_AInFirstTwoPositions() {
		assertEquals("Comparing the truncateAInFirst2Positions expected vs actual values: "
				, expectedOutputs
				, helper.truncateAInFirst2Positions(givenInputs));
	}
	
	@Test
	public void testTruncateAInFirst2Positions2_AInFirstPosition() {
		assertEquals("Comparing the truncateAInFirst2Positions expected vs actual values: "
				, expectedOutputs
				, helper.truncateAInFirst2Positions(givenInputs));
	}
	
	@Test
	public void testTruncateAInFirst2Positions3_AAfterFirstTwoPositions() {
		assertEquals("Comparing the truncateAInFirst2Positions expected vs actual values: "
				, "CDAA"
				, helper.truncateAInFirst2Positions("CDAA"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions4_AIsNotFoundInAnyPositions() {
		assertEquals("Comparing the truncateAInFirst2Positions expected vs actual values: "
				, "CDEF"
				, helper.truncateAInFirst2Positions("CDEF"));
	}
	
//	@Test
//	//ABCD => false, ABAB => true, AB => true, A => false
//	public void testAreFirstAndLastTwoCharactersTheSame_basicNegativeScenario() {
//		assertFalse("Expecting False from areFirstAndLastTwoCharactersTheSame"
//				, helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
//	}
//	
//	@Test
//	//ABCD => false, ABAB => true, AB => true, A => false
//	public void testAreFirstAndLastTwoCharactersTheSame_basicPositiveScenario() {
//		assertTrue("Expecting False from areFirstAndLastTwoCharactersTheSame"
//				, helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
//	}
//	
//	@Test
//	//ABCD => false, ABAB => true, AB => true, A => false
//	public void testAreFirstAndLastTwoCharactersTheSame_AcceptOneCharacterScenario() {
//		assertFalse("Expecting False from areFirstAndLastTwoCharactersTheSame"
//				, helper.areFirstAndLastTwoCharactersTheSame("A"));
//	}
//	
//	@Test
//	//ABCD => false, ABAB => true, AB => true, A => false
//	public void testAreFirstAndLastTwoCharactersTheSame_AcceptTwoCharacterScenario() {
//		assertTrue("Expecting False from areFirstAndLastTwoCharactersTheSame"
//				, helper.areFirstAndLastTwoCharactersTheSame("AB"));
//	}
}