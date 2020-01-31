package org.wecancodeit;
//Mod 4: Virtual Pets Amok

public class Cat extends OrganicPet {

	private static final int POOP_THRESHOLD = 5;
	private LitterBox litterBox;

	public Cat(String petNameParameter, String petDescriptionParameter, int hungerPar, int thirstPar, int boredomPar,
			int poopPar) {
		super(petNameParameter, petDescriptionParameter, hungerPar, thirstPar, boredomPar, poopPar);
		// meow!

	}

	public void setLitterBox(LitterBox value) {
		this.litterBox = value;

	}

	public void useLitterBox() {

		litterBox.addPoop(getPoop()); // adds amount from each individual cat
		cleanPoop(); // sets it back to 0 (inside the cat)
	}

	@Override
	public void tick() {
		super.tick(); // calls to OG Pet and increase all

		if (this.getPoop() >= POOP_THRESHOLD) {
			useLitterBox();

		}

		//

	}

}
