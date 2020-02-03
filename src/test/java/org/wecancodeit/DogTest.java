package org.wecancodeit;
//Mod 4: Virtual Pets Amok

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
//import static org.junit.Assert.*;

class DogTest {

	Dog underTest = new Dog(3,"Name", "description", 10, 0, 0, 0, 0);

	@Test
	void boredomShouldBe0AfterWalk() {

		underTest.getBoredom();
		underTest.tick();
		assertTrue(underTest.getBoredom() > 0);
		underTest.walk();
		int boredomLevel = underTest.getBoredom();
		assertEquals(boredomLevel, 0);

	}

	@Test
	void poopShouldBe0AfterWalk() {

		underTest.getPoop();
		underTest.tick();
		assertTrue(underTest.getPoop() > 0);
		underTest.walk();
		int poopLevel = underTest.getPoop();
		assertEquals(poopLevel, 0);

	}

	@Test
	void healthShouldIncreaseBy1After1Walk() {

		int beforeWalk = underTest.getHealth();
		underTest.tick();
		underTest.walk();
		int healthLevel = underTest.getHealth();
		assertEquals(healthLevel, beforeWalk + 1);

	}
}
