package org.wecancodeit;

import java.util.Collection;
//Mod 4 : Virtual Pets Amok
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private LitterBox litterBox = new LitterBox();

	private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	public void add(VirtualPet petToAdd) {
		pets.put(petToAdd.getPetName(), petToAdd);

		if (petToAdd instanceof Cat) {
			((Cat) petToAdd).setLitterBox(litterBox); // casting -> sets litterBox to the one in my Cat class
		}
	}

	public VirtualPet findPet(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	// allow adoption(remove pet)
	public void remove(VirtualPet petToRemove) {
		pets.remove(petToRemove.getPetName(), petToRemove);
	}

	// play with one pet
	public int getBoredomForPet(String petToPlayWith) {
		OrganicPet playWithPet = (OrganicPet) pets.get(petToPlayWith); // calls to my VP class
		return playWithPet.getBoredom();
	}

	public void playWithPet(String petToPlayWith) {
		OrganicPet playWithPet = (OrganicPet) pets.get(petToPlayWith);
		playWithPet.play(); // calls play on VP

	}

	// get all pets - return a collection of all the pets in the shelter
	public Collection<VirtualPet> getAllPets() {
		return pets.values();

	}

	// get all pets - return a collection of all the pets in the shelter
	public Collection<OrganicPet> getAllOrganicPets() {
		return pets.values();

	}

	// feed all pets
	public void feedAllOrganicPets() {
		for (OrganicPet hungryPet : getAllOrganicPets()) {
			hungryPet.feed();
		}
	}

	// water all pets
	public void waterAllPets() {
		for (OrganicPet thirstyPet : getAllOrganicPets()) {
			thirstyPet.giveWater();
		}
	}

	// clean up after all pets
	public void cleanAllPets() {
		for (OrganicPet poopyPet : getAllPets()) {
			poopyPet.cleanPoop();
		}
	}

}
