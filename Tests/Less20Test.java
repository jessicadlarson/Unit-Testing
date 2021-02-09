package com.techelevator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Less20Test {
	// Happy path
	@Test
	public void testIsLessThanMultipleOf20_is19LessThan20_shouldReturnTrue(){
		// Arrange
		Less20 less20 = new Less20();
		// Act
		boolean result = less20.isLessThanMultipleOf20(19);
		
		// Assert
		assertTrue(result);  
	}
	@Test
	public void testIsLessThanMultipleOf20_is50LessThan20_shouldReturnFalse(){
		// Arrange
		Less20 less20 = new Less20();
		// Act
		boolean result = less20.isLessThanMultipleOf20(50);
		
		// Assert
		assertFalse(result);  
	}
	
	@Test
	public void testIsLessThanMultipleOf20_is20LessThan20_shouldReturnFalse(){
		// Arrange
		Less20 less20 = new Less20();
		// Act
		boolean result = less20.isLessThanMultipleOf20(20);
		
		// Assert
		assertFalse(result);   
	}
}
