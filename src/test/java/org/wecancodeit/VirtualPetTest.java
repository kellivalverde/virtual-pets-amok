package org.wecancodeit;

import static org.junit.Assert.*;

import org.junit.Test;

public class VirtualPetTest {
	// Mod 4: Virtual Pets Amok

	VirtualPet underTest = new Cat("Name", "description", 0, 0, 0, 0);

	
	@Test
	public void healthShouldStartAt10() {

		int result = underTest.getHealth();
		// assert
		assertEquals(10, result);
	}


	@Test
	public void shouldReturnPetName() {

		String check = underTest.getPetName();
		assertEquals(check, "Name");

	}


	@Test
	public void shouldReturnPetDescription() {

		String check = underTest.getPetDescription();
		assertEquals(check, "description");

	}

	@Test
	public void healthShouldDecreaseBy1IfPoopLevelIsOver10() {

//		int result1 = underTest.getHealth();
//		int result2 = underTest.getPoopLevel();
//		if(result2 >= 10) {
//			
//		}
//		// assert
//		assertEquals(10, result);
	}
}
