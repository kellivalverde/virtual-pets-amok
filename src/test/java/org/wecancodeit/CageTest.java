package org.wecancodeit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CageTest {

	
	Dog underTest = new Dog(3, "Name", "description", 10, 0, 0, 0, 0);

	@Test
	void healthShouldDecreaseBy1IfCageIsDirty() {

		int before = underTest.getHealth();
		underTest.feed(); // adds to health, but also poop
		underTest.tick();

		int healthLevel = underTest.getHealth();
		assertEquals(healthLevel, before--);

	}

}
