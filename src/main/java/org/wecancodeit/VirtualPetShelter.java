package org.wecancodeit;
//Mod 4 : Virtual Pets Amok

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private LitterBox litterBox = new LitterBox();

	private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();
	private Map<String, OrganicPet> orgPets = new HashMap<String, OrganicPet>();

	private OrganicPet hungryPet;

	public void add(VirtualPet petToAdd) {
		pets.put(petToAdd.getPetName(), petToAdd);
		if (petToAdd instanceof Cat) {
			((Cat) petToAdd).setLitterBox(litterBox); // casting -> sets litterBox to the one in my Cat class
		}
	}

	public VirtualPet findPet(String petName) {
		return pets.get(petName);
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

	public Collection<OrganicPet> getAllOrganicPets() {
		return orgPets.values();
	}

	// feed all Organic pets
	public void feedAllOrganicPets() {
		if (hungryPet instanceof OrganicPet) {
			((OrganicPet) hungryPet).feed(); // casting -> sets litterBox to the one in my Cat class
		}

	}

	// water all Organic pets
	public void waterAllPets() {
		for (OrganicPet thirstyPet : getAllOrganicPets()) {
			thirstyPet.giveWater();
		}
	}

	// clean up after all Organic pets
	public void cleanAllPets() {
		for (OrganicPet poopyPet : getAllOrganicPets()) {
			poopyPet.cleanPoop();
		}
	}

	// ticks all pets
	public void tickAllPets() {
		for (VirtualPet shelterPet : getAllPets()) {
			shelterPet.tick();
		}

	}

}
