package com.in28minutes.juint.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();

	@Test
	public void testTruncateAInFirst2Positions1_AInFirstTwoPositions() {
		assertEquals("Comparing the truncateAInFirst2Positions expected vs actual values: "
				, "CD"
				, helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions2_AInFirstPosition() {
		assertEquals("Comparing the truncateAInFirst2Positions expected vs actual values: "
				, "CD"
				, helper.truncateAInFirst2Positions("ACD"));
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
	
	@Test
	//ABCD => false, ABAB => true, AB => true, A => false
	public void testAreFirstAndLastTwoCharactersTheSame_basicNegativeScenario() {
		assertFalse("Expecting False from areFirstAndLastTwoCharactersTheSame"
				, helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	//ABCD => false, ABAB => true, AB => true, A => false
	public void testAreFirstAndLastTwoCharactersTheSame_basicPositiveScenario() {
		assertTrue("Expecting False from areFirstAndLastTwoCharactersTheSame"
				, helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	//ABCD => false, ABAB => true, AB => true, A => false
	public void testAreFirstAndLastTwoCharactersTheSame_AcceptOneCharacterScenario() {
		assertFalse("Expecting False from areFirstAndLastTwoCharactersTheSame"
				, helper.areFirstAndLastTwoCharactersTheSame("A"));
	}
	
	@Test
	//ABCD => false, ABAB => true, AB => true, A => false
	public void testAreFirstAndLastTwoCharactersTheSame_AcceptTwoCharacterScenario() {
		assertTrue("Expecting False from areFirstAndLastTwoCharactersTheSame"
				, helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
}