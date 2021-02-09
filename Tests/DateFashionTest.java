package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DateFashionTest {
	
	// Happy Path
	@Test
	public void testGetATable_eightAndThree_shouldReturnTwo(){
		// Arrange
		DateFashion dateFashion = new DateFashion();
		
		int expected = 2;
		
		// Act
		int result = dateFashion.getATable(8, 3);
		
		// Assert
		assertEquals(expected, result);
	} 
	 
	@Test
	public void testGetATable_fiveAndFive_shouldReturnOne(){
		// Arrange
		DateFashion dateFashion = new DateFashion();
		
		int expected = 1;
		
		// Act
		int result = dateFashion.getATable(5, 5);
		
		// Assert
		assertEquals(expected, result);
	}
	
	@Test
	public void testGetATable_tenAndTwo_shouldReturnZero(){
		// Arrange
		DateFashion dateFashion = new DateFashion();
		
		int expected = 0;
		
		// Act
		int result = dateFashion.getATable(10, 2);
		
		// Assert
		assertEquals(expected, result);
	}
}
