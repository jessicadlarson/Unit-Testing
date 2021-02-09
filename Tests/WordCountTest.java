package com.techelevator;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class WordCountTest {
	// Happy path
	
		@Test
		public void testGetCount_withCorrectValues_shouldReturnCorrect(){
			// Arrange
			WordCount wordCount = new WordCount();
			Map<String, Integer> expected = new HashMap<>();
			expected.put("ba", 2);
			expected.put("black", 1);
			expected.put("sheep", 1); 
			
			// Act
			String [] words = {"ba", "ba", "black", "sheep"};
			Map<String, Integer> result = wordCount.getCount(words);
			
			// Assert
			assertEquals(expected, result);
		}
}
