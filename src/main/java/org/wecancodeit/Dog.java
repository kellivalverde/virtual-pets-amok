package org.wecancodeit;
//Mod 4 : Virtual Pets Amok

public class Dog extends OrganicPet implements Walkable {

	private static final int POOP_THRESHOLD = 5;
	private static final int HUNGER_THRESHOLD = 7;
	private Cage cage = new Cage(); // default each has their own cage

	public Dog(int petIdPar, String petNamePar, String petDescriptionPar, int healthPar, int hungerPar, int thirstPar, int boredomPar,
			int poopPar) {
		super(petIdPar, petNamePar, petDescriptionPar, healthPar, hungerPar, thirstPar, boredomPar, poopPar);

	}

	@Override
	public void tick() {
		super.tick(); // calls to OG Pet and increase all

		if (this.getPoop() >= POOP_THRESHOLD) {
			cage.addPoop(getPoop());
			goPoop(); // dog goes poop - cleans it out of itself
			lowerHealth();
		}
		if (this.getHunger() >= HUNGER_THRESHOLD) {
			lowerHealth();
		}
	}

	public void walk() {

		play();
		goPoop();

	}

	public void cleanCage() {
		cage.clean();
	}

}
