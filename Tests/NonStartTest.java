package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NonStartTest {
	// Happy Path
		@Test
		public void testGetPartialString_helloThereScenario_shouldReturnElloHere(){
			// Arrange
			NonStart nonStart = new NonStart();
			
			String expected = "ellohere";
			
			// Act
			String result = nonStart.getPartialString("Hello", "There");
			
			// Assert
			assertEquals(expected, result);
		}
		
		@Test
		public void testGetPartialString_firstStringOnly_shouldReturnEllo(){
			// Arrange
			NonStart nonStart = new NonStart();
			
			String expected = "ello";
			
			// Act
			String result = nonStart.getPartialString("Hello", "");
			
			// Assert
			assertEquals(expected, result);
		}

		@Test
		public void testGetPartialString_secondStringOnly_shouldReturnHere(){
			// Arrange
			NonStart nonStart = new NonStart();
			
			String expected = "here";
			
			// Act
			String result = nonStart.getPartialString("", "There");
			
			// Assert
			assertEquals(expected, result);
		}
}
