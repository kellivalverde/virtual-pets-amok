package org.wecancodeit;

public class Dog extends OrganicPet implements Walkable {

	public Dog(String petNamePar, String petDescriptionPar, int healthPar, int hungerPar, int thirstPar, int boredomPar,
			int poopPar) {
		super(petNamePar, petDescriptionPar, healthPar, hungerPar, thirstPar, boredomPar, poopPar);

	}

	public void walk() {

		play();
		cleanPoop();
		addHealth();

	}

}
