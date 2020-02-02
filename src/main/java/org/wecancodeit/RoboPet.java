package org.wecancodeit;
//Mod 4 : Virtual Pets Amok

public class RoboPet extends VirtualPet {

	private int rustLevel = 0;

	public RoboPet(int petIdPar, String petNamePar, String petDescriptionPar, int healthPar, int rustLevelPar) {
		super(petIdPar, petNamePar, petDescriptionPar, healthPar);
		this.rustLevel = rustLevelPar;

	}

	@Override
	public void tick() {
		rustLevel++;
	}

	public int getRustLevel() {
		return rustLevel;
	}

	public void giveOil() {
		rustLevel = 0;
		addHealth();
	}

}
