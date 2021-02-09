package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FrontTimesTest {
		// Happy Path
		@Test
		public void testGenerateString_chocolate_shouldReturnChoChoCho(){
			// Arrange
			FrontTimes frontTimes = new FrontTimes();
			
			String expected = "ChoChoCho";
			
			// Act
			String result = frontTimes.generateString("Chocolate", 3);
			
			// Assert
			assertEquals(expected, result);
		}
		
		@Test
		public void testGenerateString_checkingForNull_shouldReturnEmptyString(){
			// Arrange
			FrontTimes frontTimes = new FrontTimes();
			
			String expected = "";
			
			// Act
			String result = frontTimes.generateString(null, 3);
			
			// Assert
			assertEquals(expected, result);
		}
		
		@Test
		public void testGenerateString_checkingForEmptyString_shouldReturnEmptyString(){
			// Arrange
			FrontTimes frontTimes = new FrontTimes();
			
			String expected = "";
			
			// Act
			String result = frontTimes.generateString("", 3);
			
			// Assert
			assertEquals(expected, result);
		}
}
