package com.techelevator;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxEnd3Test {
	// Happy Path
			@Test
			public void testMakeArray_firstIsLargest_shouldReturnFirstFirstFirst(){
				// Arrange
				MaxEnd3 maxEnd3 = new MaxEnd3();
				
				int [] expected = { 11, 11, 11 };
				
				
				// Act
				int [] nums = { 11, 5, 9 };
				int [] result = maxEnd3.makeArray(nums);
				
				// Assert
				assertArrayEquals(expected, result); 
			}
			
			@Test
			public void testMakeArray_lastIsLargest_shouldReturnLastLastLast(){
				// Arrange
				MaxEnd3 maxEnd3 = new MaxEnd3();
				
				int [] expected = { 13, 13, 13 };
				
				
				// Act
				int [] nums = { 11, 5, 13 };
				int [] result = maxEnd3.makeArray(nums);
				
				// Assert
				assertArrayEquals(expected, result);
			}
}
