package org.wecancodeit;
//Mod 4 : Virtual Pets Amok

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private LitterBox litterBox = new LitterBox();
	private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	public void add(VirtualPet petToAdd) {

		// add petId number? size of collection +1
		// int petIdNum = pets.size()+1;

		pets.put(petToAdd.getPetName(), petToAdd); // change name to petId- could be an integer add 1 to size of
													// collection
		// pets.set(petToAdd.getPetId(), petToAdd);

		if (petToAdd instanceof Cat) {
			((Cat) petToAdd).setLitterBox(litterBox); // casting -> sets litterBox to the one in my Cat class
		}

	}

	public VirtualPet findPet(String petName) {
		return pets.get(petName);
	}

	// allow adoption(remove pet)
	public void remove(VirtualPet petToRemove) {
		pets.remove(petToRemove.getPetName(), petToRemove); // mark as adopted and skip when getAllPets - boolean
															// adopted or not
	}

	// revised allow adoption - does not remove pet
//	public void markAdopted(VirtualPet petToMarkAdopted) {
//		pets.
//	}

	// play with one pet
	public int getBoredomForPet(String petToPlayWith) {
		OrganicPet playWithPet = (OrganicPet) pets.get(petToPlayWith); // calls to my VP class
		return playWithPet.getBoredom();
	}

	public void playWithPet(String petToPlayWith) {
		OrganicPet playWithPet = (OrganicPet) pets.get(petToPlayWith);
		playWithPet.play(); // calls play on VP

	}

	public Collection<VirtualPet> getAllPets() {
		return pets.values();
	}

	// return all pets that are !adopted
	public Collection<VirtualPet> getAllAdoptablePets() {
		// for pets !adopted - get values or get KEYS??? ... boolean
		return pets.values();
	}

	public Collection<OrganicPet> getAllOrganicPets() {
		Collection<OrganicPet> orgPets = new ArrayList<OrganicPet>();
		// holding bin for the organic pets -- subset

		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicPet) { // checks if they are organic
				orgPets.add((OrganicPet) pet); // throws it in that bin
			}
		}
		return orgPets; // spits that bin back out
	}

	// feed all Organic pets
	public void feedAllOrganicPets() {
		for (OrganicPet hungryPet : getAllOrganicPets()) {
			hungryPet.feed();
		}

	}

	// water all pets
	public void waterAllOrganicPets() {
		for (OrganicPet thirstyPet : getAllOrganicPets()) {
			thirstyPet.giveWater();
		}
	}

	public void emptyLitterBox() {
		litterBox.clean();
	}

	public LitterBox getLitterBox() {
		return litterBox;
	}
	
	
	public void cleanAllCages() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Dog) {
				((Dog) pet).cleanCage();
			}
		}
	}

	public Collection<Walkable> getAllWalkablePets() {
		Collection<Walkable> walkablePets = new ArrayList<Walkable>();

		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Walkable) { // checks if they are organic
				walkablePets.add((Walkable) pet); // throws it in that bin
			}
		}
		return walkablePets; // spits that bin back out
	}

	public void walkAllWalkablePets() {
		for (Walkable pet : getAllWalkablePets()) {
			pet.walk();

		}
	}

	public void playWithCats() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Cat) {
				((Cat) pet).playWithLaser();
			}
		}
	}

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
