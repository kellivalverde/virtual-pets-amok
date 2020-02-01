package org.wecancodeit;
//Mod 4: Virtual Pets Amok

import java.util.Collection;

public abstract class OrganicPet extends VirtualPet {

	private int hunger = 0;
	private int thirst = 0;
	private int boredom = 0;
	private int poop = 0;

	public OrganicPet(String petNameParameter, String petDescriptionParameter, int healthPar, int hungerPar,
			int thirstPar, int boredomPar, int poopPar) {
		super(petNameParameter, petDescriptionParameter, healthPar);
		this.hunger = hungerPar;
		this.thirst = thirstPar;
		this.boredom = boredomPar;
		this.poop = poopPar;
	}

	// food
	public int getHunger() {
		return hunger;
	}

	public void feed() {
		hunger = 0;
		poop++;
	}

	// thirst
	public int getThirst() {
		return thirst;
	}

	public void giveWater() {
		thirst = 0;
	}

	// poop level
	public int getPoop() {
		return poop;
	}

	public void cleanPoop() {
		poop = 0;
	}

	// boredom
	public int getBoredom() {
		return boredom;
	}

	public void play() {
		boredom = 0;
		thirst++;
	}

	@Override
	public void tick() {
		hunger++;
		thirst++;
		poop++;
		boredom++;
	}

	public Collection<OrganicPet> getAllOrganicPets() {

		return null;
	}
}
