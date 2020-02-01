package org.wecancodeit;

public class Dog extends OrganicPet implements Walkable {

	public Dog(String petNameParameter, String petDescriptionParameter, int hungerPar, int thirstPar, int boredomPar,
			int poopPar) {
		super(petNameParameter, petDescriptionParameter, hungerPar, thirstPar, boredomPar, poopPar);

	}

	public void walk() {

		play();
		cleanPoop();
		addHealth();

	}

}
