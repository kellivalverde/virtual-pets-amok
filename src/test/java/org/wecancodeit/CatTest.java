package org.wecancodeit;

//Mod 4: Virtual Pets Amok

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class CatTest {

	Cat underTest = new Cat("Name", "description", 10, 0, 0, 0, 0);
	Cat underTest2 = new Cat("2ndCat", "2nd description", 10, 0, 0, 0, 0);

	LitterBox litterBox = new LitterBox();

	public void shouldBeAbleToUseLitterBox() {
		underTest.setLitterBox(litterBox);
		underTest.tick();
		underTest.tick();

		int catPoop = underTest.getPoop();

		assertTrue(catPoop > 0);

		underTest.useLitterBox();
		int boxPoopLevel = litterBox.getPoopLevel();

		assertEquals(catPoop, boxPoopLevel);
		assertEquals(underTest.getPoop(), 0);
	}

	// with 2 cats
	// add 2, add litter box to both
	// call tick and see if their poops go in the box
	public void twoCatsShouldBeAbleToUseLitterBox() {
		underTest.setLitterBox(litterBox);
		underTest2.setLitterBox(litterBox);
		underTest.tick();
		underTest2.tick();
		underTest.tick();
		underTest2.tick();

		int catPoop = underTest.getPoop();

		assertTrue(catPoop > 0);

		underTest.useLitterBox();
		int boxPoopLevel = litterBox.getPoopLevel();

		assertEquals(catPoop, boxPoopLevel);
		assertEquals(underTest.getPoop(), 0);

	}

	@Test
	public void boredomShouldBe0AfterPlayWithLaser() {

		underTest.getBoredom();
		underTest.tick();
		assertTrue(underTest.getBoredom() > 0);
		underTest.playWithLaser();
		int boredomLevel = underTest.getBoredom();
		assertEquals(boredomLevel, 0);

	}

	@Test
	public void healthShouldIncreaseBy1AfterPlayWithLaser() {

		int beforePlay = underTest.getHealth();
		underTest.tick();
		underTest.playWithLaser();
		int healthLevel = underTest.getHealth();
		assertEquals(healthLevel, beforePlay + 1);

	}
}