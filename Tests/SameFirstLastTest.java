package com.techelevator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SameFirstLastTest {
	// Happy path
		@Test
		public void testIsItTheSame_endAndBeginningEqual_shouldReturnTrue(){
			// Arrange
			SameFirstLast sameFirstLast = new SameFirstLast();
			// Act
			int [] nums = {1, 2, 3, 1};
			boolean result = sameFirstLast.isItTheSame(nums);
			
			// Assert
			assertTrue(result);  
		}
		
		@Test
		public void testIsItTheSame_endAndBeginningUnequal_shouldReturnFalse(){
			// Arrange
			SameFirstLast sameFirstLast = new SameFirstLast();
			// Act
			int [] nums = {1, 2, 3, 4};
			boolean result = sameFirstLast.isItTheSame(nums);
			
			// Assert
			assertFalse(result);  
		}
		
		@Test
		public void testIsItTheSame_checkingForNull_shouldReturnFalse(){
			// Arrange
			SameFirstLast sameFirstLast = new SameFirstLast();
			// Act
			int [] nums = null;
			boolean result = sameFirstLast.isItTheSame(nums);
			
			// Assert
			assertFalse(result);  
		}
}
