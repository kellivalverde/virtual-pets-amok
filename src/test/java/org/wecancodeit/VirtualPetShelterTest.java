package org.wecancodeit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {

//arrange 

	private VirtualPetShelter underTest; // calling default constructor of VPS
	private Cat pet1;
	private Dog pet2;
	private Cat pet3;

	@Before
	public void setUp() { // method that sets up project so you can have objects for your test
		underTest = new VirtualPetShelter();
		pet1 = new Cat("MeiLing", "the big, fat, fluffy cat", 0, 0, 0, 2);
		pet2 = new Dog("Beau", "the stocky bulldog", 3, 0, 0, 0);
		pet3 = new Cat("Oliver", "the scruffy old gray cat", 0, 0, 1, 0);
	}

	// allow intakes (add pet)

	@SuppressWarnings("deprecation")
	@Test
	public void shouldBeAbleToAddAPet() {
		underTest.add(pet1);
		underTest.add(pet2);
		VirtualPet retrievedAccount = underTest.findPet("MeiLing");
		assertThat(retrievedAccount, is(pet1));
	}

	// allow adoption(remove pet)

	@SuppressWarnings("deprecation")
	@Test
	public void shouldBeAbleToRemoveAPet() {
		underTest.add(pet1);
		underTest.add(pet2);
		underTest.remove(pet2);
		VirtualPet retrievedAccount = underTest.findPet("Rigby");
		assertThat(retrievedAccount, is(nullValue()));

	}

	// should return a specific pet given it's name (pet descriptions?)

	@SuppressWarnings("deprecation")
	@Test
	public void shouldReturnAPetByName() {
		underTest.add(pet1);
		VirtualPet retrievedAccount = underTest.findPet("MeiLing");
		assertThat(retrievedAccount, is(pet1));
	}

	// play with one pet - takes a name

	@Test
	public void shouldBeAbleToPlayWith1Pet() {
		underTest.add(pet2);
		int beforePlay = underTest.getBoredomForPet(pet2.getPetName());
		underTest.playWithPet(pet2.getPetName());
		int afterPlay = underTest.getBoredomForPet(pet2.getPetName());
		assertTrue(afterPlay < beforePlay);
	}

	// should return a collection of all the pets in the shelter

	@Test
	public void shouldReturnCollectionOfAllPets() {
		underTest.add(pet1);
		underTest.add(pet2);
		underTest.add(pet3);

		Collection<VirtualPet> allPets = underTest.getAllPets();
		// assertThat(allAccounts, containsInAnyOrder(account1,account2));
		assertEquals(3, allPets.size());

	}

	// feed all pets
	@Test
	public void shouldFeedAllPets() {
		underTest.add(pet1);
		underTest.add(pet2);
		underTest.add(pet3);

		int beforeFeed1 = pet1.getHunger();
		int beforeFeed2 = pet2.getHunger();
		int beforeFeed3 = pet3.getHunger();

		underTest.feedAllPets();

		int afterFeed1 = pet1.getHunger();
		int afterFeed2 = pet2.getHunger();
		int afterFeed3 = pet3.getHunger();

		assertTrue(afterFeed1 <= beforeFeed1);
		assertTrue(afterFeed2 <= beforeFeed2);
		assertTrue(afterFeed3 <= beforeFeed3);
	}

	// water all pets
	@Test
	public void shouldWaterAllPets() {
		underTest.add(pet1);
		underTest.add(pet2);
		underTest.add(pet3);

		int beforeWater1 = pet1.getThirst();
		int beforeWater2 = pet2.getThirst();
		int beforeWater3 = pet3.getThirst();

		underTest.waterAllPets();

		int afterWater1 = pet1.getThirst();
		int afterWater2 = pet2.getThirst();
		int afterWater3 = pet3.getThirst();

		assertTrue(afterWater1 <= beforeWater1);
		assertTrue(afterWater2 <= beforeWater2);
		assertTrue(afterWater3 <= beforeWater3);
	}

	// clean up after all pets
	@Test
	public void shouldCleanUpAfterAllPets() {
		underTest.add(pet1);
		underTest.add(pet2);
		underTest.add(pet3);

		int beforeClean1 = pet1.getPoop();
		int beforeClean2 = pet2.getPoop();
		int beforeClean3 = pet3.getPoop();

		underTest.cleanAllPets();

		int afterClean1 = pet1.getPoop();
		int afterClean2 = pet2.getPoop();
		int afterClean3 = pet3.getPoop();

		assertTrue(afterClean1 <= beforeClean1);
		assertTrue(afterClean2 <= beforeClean2);
		assertTrue(afterClean3 <= beforeClean3);
	}

	// calls tick() method after each loop - all stats increase

	@Test
	public void shouldIncreaseStatsOfAllPetsBy1() {
		underTest.add(pet1);
		underTest.add(pet2);
		underTest.add(pet3);

		int beforeTick1 = pet1.getThirst();
		int beforeTick2 = pet2.getThirst();
		int beforeTick3 = pet3.getThirst();

		underTest.tickAllPets();

		int afterTick1 = pet1.getThirst();
		int afterTick2 = pet2.getThirst();
		int afterTick3 = pet3.getThirst();

		assertTrue(afterTick1 >= beforeTick1);
		assertTrue(afterTick2 >= beforeTick2);
		assertTrue(afterTick3 >= beforeTick3);
	}

}
