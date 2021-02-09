package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringBitsTest {
	// Happy path
	
		@Test
		public void testGetBits_withCorrectString_shouldReturnCorrect(){
			// Arrange
			StringBits stringBits = new StringBits();
			
			String expected = "Hlo";
			
			// Act
			String result = stringBits.getBits("Hello");
			
			// Assert
			assertEquals(expected, result);
		}
		@Test
		public void testGetBits_withNull_shouldReturnCorrect(){
			// Arrange
			StringBits stringBits = new StringBits();
			
			String expected = "";
			
			// Act
			String result = stringBits.getBits(null);
			
			// Assert
			assertEquals(expected, result);
		}
		
		
}
