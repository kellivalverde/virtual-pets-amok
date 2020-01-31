package org.wecancodeit;
//Mod 4: Virtual Pets Amok

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class OrganicPetTest {

	OrganicPet underTest = new Cat("Name", "description", 0, 0, 0, 0);

	@Test
	public void hungerShouldStartAt0() {

		int result = underTest.getHunger();
		// assert
		assertEquals(0, result);
	}

	@Test
	public void hungerShouldBe0AfterFeed() {
		// act
		// int beforeFeed = underTest.getHunger();
		underTest.feed(); // void - just eats
		int result = underTest.getHunger();
		// assert
		assertEquals(0, result);

	}

	@Test
	public void thirstShouldBe0AtStart() {
		// act
		int result = underTest.getThirst(); // makes a method in VP2 class
		// assert
		assertEquals(0, result);

	}

	@Test
	public void thirstShouldBe0AfterGiveWater() {
		// act
		int beforeGiveWater = underTest.getThirst();
		underTest.giveWater(); // void - just eats
		int result = underTest.getThirst();
		// assert
		assertEquals(0, result);

	}

	@Test
	public void thirstShouldIncreaseBy1AfterPlay() {
		// Act
		int beforePlay = underTest.getThirst();
		underTest.play();
		int result = underTest.getThirst();
		assertEquals(beforePlay + 1, result); //will not work if I use ++ instead of + 1 -> why?
	}

	@Test
	public void boredomShouldBe0AtStart() {
		// act
		int result = underTest.getBoredom(); // makes a method in VP2 class
		// assert
		assertEquals(0, result);
	}

	@Test
	public void boredomShouldBe0AfterPlay() {
		// act
//		int beforePlay = underTest.getBoredom();
//		underTest.play(); // void - just eats
		int result = underTest.getBoredom();
		// assert
		assertEquals(0, result);

	}

	@Test
	public void poopLevelShouldStartAt0() {
		// act
		int result = underTest.getPoop();
		// assert
		assertEquals(0, result);
	}

	@Test
	public void poopLevelShouldBe0AfterCleanPoop() {
		// act
		underTest.cleanPoop();
		int result = underTest.getPoop();
		// assert
		assertEquals(0, result);

	}

	@Test
	public void hungerShouldIncreaseBy1AfterTick() {
		// Act
		int beforeTick = underTest.getHunger();
		underTest.tick();
		int result = underTest.getHunger();

		// assert
		assertEquals(beforeTick + 1, result);
	}

	@Test
	public void thirstShouldIncreaseBy1AfterTick() {
		// Act
		int beforeTick = underTest.getThirst();
		underTest.tick();
		int result = underTest.getThirst();
		assertEquals(beforeTick + 1, result);
	}

	@Test
	public void boredomShouldIncreaseBy1AfterTick() {
		// Act
		int beforeTick = underTest.getBoredom();
		underTest.tick();
		int result = underTest.getBoredom();
		assertEquals(beforeTick + 1, result);
	}

	@Test
	public void poopShouldIncreaseBy1AfterTick() {
		// Act
		int beforeTick = underTest.getPoop();
		underTest.tick();
		int result = underTest.getPoop();
		assertEquals(beforeTick + 1, result);
	}

	@Test
	public void poopShouldIncreaseBy1AfterFeed() {
		// Act
		int beforeFeed = underTest.getPoop();
		underTest.feed();
		int result = underTest.getPoop();
		assertEquals(beforeFeed + 1, result);
	}

}
