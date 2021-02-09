package com.techelevator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Lucky13Test {
	// Happy path
		@Test
		public void testGetLucky_noOneAndThree_shouldReturnTrue(){
			// Arrange
			Lucky13 lucky13 = new Lucky13();
			// Act
			int[] nums = { 0, 2, 4 };
			boolean result = lucky13.getLucky(nums);
			
			// Assert
			assertTrue(result);  
		}
		
		@Test
		public void testGetLucky_oneAndThreePresent_shouldReturnFalse(){
			// Arrange
			Lucky13 lucky13 = new Lucky13();
			// Act
			int[] nums = { 1, 2, 3 };
			boolean result = lucky13.getLucky(nums);
			
			// Assert
			assertFalse(result);  
		}
}
