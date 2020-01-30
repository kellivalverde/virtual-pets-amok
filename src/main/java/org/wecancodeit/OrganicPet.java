package org.wecancodeit;

public abstract class OrganicPet extends VirtualPet {

	private int hunger = 0; // baby bear
	private int thirst = 0;
	private int boredom = 0;
	private int poop = 0;

	public OrganicPet(String petNameParameter, String petDescriptionParameter, int hungerPar, int thirstPar, int boredomPar, int poopPar) {
		super(petNameParameter, petDescriptionParameter);
		this.hunger = hungerPar;
		this.thirst = thirstPar;
		this.boredom = boredomPar;
		this.poop = poopPar;
	}
	
	
	
	
	
	@Override
	public void tick() {
		hunger++;
		thirst++;
		poop++;
		boredom++;
	}
}
