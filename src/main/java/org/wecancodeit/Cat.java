package org.wecancodeit;

public class Cat extends OrganicPet {

	public Cat(String petNameParameter, String petDescriptionParameter, int hungerPar, int thirstPar, int boredomPar,
			int poopPar) {
		super(petNameParameter, petDescriptionParameter, hungerPar, thirstPar, boredomPar, poopPar);
		// meow!
	}

	
	
	
	public void useLitterBox(LitterBox litterBox) {
		// get poop from individual Cats?

		litterBox.addPoop(1);
		
		
	}

}
