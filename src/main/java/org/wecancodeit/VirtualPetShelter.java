package org.wecancodeit;
//Mod 4 : Virtual Pets Amok

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private LitterBox litterBox = new LitterBox();

	private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();
	// private Map<String, OrganicPet> orgPets = new HashMap<String, OrganicPet>();

	private OrganicPet thirstyPet;

	private OrganicPet poopyPet;

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
		Collection<OrganicPet> orgPets = new ArrayList<OrganicPet>();
		// holding bin for the organic pets -- subset

		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				// checks if they are organic
				orgPets.add((OrganicPet) pet);
				// throws it in that bin
			}
		}
		return orgPets; // chucks that bin out
	}

	// feed all Organic pets
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

	
	// clean litter box
	
	public void cleanLitterBox() {
	
		//getAllOrganicPets - find the ones that use the litterBos
		
		if(petToClean instanceof Cat);
		((Cat))
	
	
		
		
		}
		
	}
	
	
		
	// clean cages
	
	public void cleanAllCages() {
		for
		
	}
	
	
	
	
	
// clean up after all Organic pets
//	public void cleanAllPets() {
//		if (poopyPet instanceof OrganicPet) {
//			((OrganicPet) poopyPet).cleanPoop();
//		}
//	}
	

	public Collection<RoboPet> getAllRoboPets() {

		Collection<RoboPet> roboPets = new ArrayList<RoboPet>();

		// holding bin for the organic pets -- subset

		for (VirtualPet pet : pets.values()) {
			if (pet instanceof RoboPet) {
				// checks if they are organic
				roboPets.add((RoboPet) pet);
				// throws it in that bin
			}
		}
		return roboPets; // chucks that bin out
	}

	// oil all RoboPets
	public void oilAllRoboPets() {
		for (RoboPet rustyPet : getAllRoboPets()) {
			rustyPet.giveOil();
		}
	}

	// ticks all pets
	public void tickAllPets() {
		for (VirtualPet shelterPet : getAllPets()) {
			shelterPet.tick();
		}

	}
}
