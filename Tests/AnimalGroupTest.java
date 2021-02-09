package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnimalGroupTest {

	// Happy path
	
	@Test
	public void testGetHerdName_withFoundKey_shouldReturnCorrect(){
		// Arrange
		AnimalGroupName animalGroupName = new AnimalGroupName();
		
		String expected = "Herd";
		
		// Act
		String result = animalGroupName.getHerd("elephant");
		
		// Assert
		assertEquals(expected, result);
	}
	
	@Test
	public void testGetHerdName_withFoundKeyInWrongCase_shouldReturnCorrect(){
		// Arrange
		AnimalGroupName animalGroupName = new AnimalGroupName();
		
		String expected = "Herd";
		
		// Act
		String result = animalGroupName.getHerd("ElepHant");
		
		// Assert
		assertEquals(expected, result);
	}
	
	@Test
	// unknown
	public void testGetHerdName_withNotFoundKey_shouldReturnUnkown(){
		// Arrange
		AnimalGroupName animalGroupName = new AnimalGroupName();
		
		String expected = "unknown";
		
		// Act
		String result = animalGroupName.getHerd("xxxxxxxxx");
		 
		// Assert
		assertEquals(expected, result);
	
	}
	
	@Test
	public void testGetHerdNull_shouldReturnUnknown() {
		// Arrange
		AnimalGroupName animalGroupName = new AnimalGroupName();
		
		String expected = "unknown";
		
		// Act
		String result = animalGroupName.getHerd(null);
		
		// Assert
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testGetHerd_withEmptyString_shouldReturnUnknown() {
		// Arrange
		AnimalGroupName animalGroupName = new AnimalGroupName();
		
		String expected = "unknown";
		
		// Act
		String result = animalGroupName.getHerd("");
		
		// Assert
		assertEquals(expected, result);
		
	}
	
}
