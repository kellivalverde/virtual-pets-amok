package org.wecancodeit;

public class RoboPet extends VirtualPet {

	private int rustLevel = 0;

	public RoboPet(String petNameParameter, String petDescriptionPar, int healthPar, int rustLevelPar) {
		super(petNameParameter, petDescriptionPar, healthPar);
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
