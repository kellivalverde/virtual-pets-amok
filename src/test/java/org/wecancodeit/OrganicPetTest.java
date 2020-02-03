package org.wecancodeit;
//Mod 4: Virtual Pets Amok

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class OrganicPetTest {

	OrganicPet underTest = new Cat(1, "Name", "description", 10, 0, 0, 0, 0);

	@Test
	public void hungerShouldStartAt0() {

		int result = underTest.getHunger();
		// assert
		assertEquals(0, result);
	}

	@Test
	public void hungerShouldBe0AfterFeed() {
		
		underTest.feed(); 
		int result = underTest.getHunger();
		
		assertEquals(0, result);

	}

	@Test
	public void thirstShouldBe0AtStart() {
		
		int result = underTest.getThirst(); // makes a method in VP2 class
		
		assertEquals(0, result);

	}

	@Test
	public void thirstShouldBe0AfterGiveWater() {
		
		underTest.play();
		underTest.tick();
		underTest.giveWater(); // void - just eats
		int result = underTest.getThirst();
		
		assertEquals(0, result);

	}

	@Test
	public void thirstShouldIncreaseBy1AfterPlay() {
		
		int beforePlay = underTest.getThirst();
		underTest.play();
		int result = underTest.getThirst();
		assertEquals(beforePlay + 1, result); // will not work if I use ++ instead of + 1 -> why?
	}

	@Test
	public void boredomShouldBe0AtStart() {
		
		int result = underTest.getBoredom(); // makes a method in VP2 class
		
		assertEquals(0, result);
	}

	@Test
	public void boredomShouldBe0AfterPlay() {
		
		int result = underTest.getBoredom();
			assertEquals(0, result);

	}

	@Test
	public void poopLevelShouldStartAt0() {
		int result = underTest.getPoop();
		assertEquals(0, result);
	}

	@Test
	public void poopLevelShouldBe0AfterCleanPoop() {
		underTest.goPoop();
		int result = underTest.getPoop();
		assertEquals(0, result);

	}

	@Test
	public void hungerShouldIncreaseBy1AfterTick() {
		
		int beforeTick = underTest.getHunger();
		underTest.tick();
		int result = underTest.getHunger();

		
		assertEquals(beforeTick + 1, result);
	}

	@Test
	public void thirstShouldIncreaseBy1AfterTick() {
		
		int beforeTick = underTest.getThirst();
		underTest.tick();
		int result = underTest.getThirst();
		assertEquals(beforeTick + 1, result);
	}

	@Test
	public void boredomShouldIncreaseBy1AfterTick() {
		
		int beforeTick = underTest.getBoredom();
		underTest.tick();
		int result = underTest.getBoredom();
		assertEquals(beforeTick + 1, result);
	}

	@Test
	public void poopShouldIncreaseBy1AfterTick() {
		
		int beforeTick = underTest.getPoop();
		underTest.tick();
		int result = underTest.getPoop();
		assertEquals(beforeTick + 1, result);
	}

	@Test
	public void poopShouldIncreaseBy1AfterFeed() {
		
		int beforeFeed = underTest.getPoop();
		underTest.feed();
		int result = underTest.getPoop();
		assertEquals(beforeFeed + 1, result);
	}

	@Test
	public void healthShouldIncreaseBy1AfterFeed() {
		
		int beforeFeed = underTest.getHealth();
		underTest.feed();
		int result = underTest.getHealth();
		assertEquals(beforeFeed + 1, result);
	}
	
	@Test
	public void healthShouldIncreaseBy1AfterWater() {
		
		int beforeWater = underTest.getHealth();
		underTest.giveWater();
		int result = underTest.getHealth();
		assertEquals(beforeWater + 1, result);
	}
	
	@Test
	public void healthShouldIncreaseBy1AfterPlay() {
		
		int beforePlay = underTest.getHealth();
		underTest.play();
		int result = underTest.getHealth();
		assertEquals(beforePlay + 1, result);
	}
}
