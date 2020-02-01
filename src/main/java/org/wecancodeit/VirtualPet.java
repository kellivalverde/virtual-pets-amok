package org.wecancodeit;

//Mod 4: Virtual Pets Amok

public abstract class VirtualPet {

	private String petName;
	private String petDescription;
	private int health = 10;

	public VirtualPet(String petNamePar, String petDescriptionPar, int healthPar) {
		this.petName = petNamePar;
		this.petDescription = petDescriptionPar;

	}

	public String getPetName() {
		return this.petName;
	}

	public String getPetDescription() {
		return this.petDescription;
	}

	public int getHealth() {
		return health;
	}

	protected void addHealth() { // only able to modify within hierarchy
		health++;
	}

	// tick() method for all? --> defined within classes
	// details defined by subclasses because they need different things
	public abstract void tick();
}
