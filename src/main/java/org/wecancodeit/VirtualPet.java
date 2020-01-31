package org.wecancodeit;

//Mod 4: Virtual Pets Amok

public abstract class VirtualPet {

	private String petName;
	private String petDescription;
	private int health = 10;

	public VirtualPet(String petNameParameter, String petDescriptionParameter) {
		this.petName = petNameParameter;
		this.petDescription = petDescriptionParameter;

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

	protected void addHealth() {  //only able to modify within hierarchy
		health++;
	}

	// tick() method for all? --> defined within classes
	// details defined by subclasses because they need different things
	public abstract void tick();
}
