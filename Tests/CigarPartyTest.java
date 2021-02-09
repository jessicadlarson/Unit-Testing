package com.techelevator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CigarPartyTest {
	// Happy path not weekend
	
		@Test
		public void testHaveParty_successfulPartyNotWeekend_shouldReturnTrue(){
			// Arrange
			CigarParty cigarParty = new CigarParty();
			 
			
			// Act
			boolean result = cigarParty.haveParty(40, false);
			
			// Assert
			assertTrue(result);   
		}
	// Happy path with weekend
		@Test
		public void testHaveParty_successfulPartyWeekend_shouldReturnTrue(){
			// Arrange
			CigarParty cigarParty = new CigarParty();
			
			
			// Act
			boolean result = cigarParty.haveParty(100, true);
			
			// Assert
			assertTrue(result);
		}
		
		@Test
		public void testHaveParty_unsuccessfulPartyNotWeekend_shouldReturnFalse(){
			// Arrange
			CigarParty cigarParty = new CigarParty();
			
			
			// Act
			boolean result = cigarParty.haveParty(30, false);
			
			// Assert
			assertFalse(result);
		}
		
		@Test
		public void testHaveParty_unsuccessfulPartyWeekend_shouldReturnFalse(){
			// Arrange
			CigarParty cigarParty = new CigarParty();
			
			// Act
			boolean result = cigarParty.haveParty(30, true);
			
			// Assert
			assertFalse(result);
		}
		
		@Test
		public void testHaveParty_unsuccessfulPartyOverLimitNotWeekend_shouldReturnFalse(){
			// Arrange
			CigarParty cigarParty = new CigarParty();
			
			// Act
			boolean result = cigarParty.haveParty(70, false);
			
			// Assert
			assertFalse(result);
		}
}
