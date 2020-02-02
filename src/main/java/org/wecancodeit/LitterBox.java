package org.wecancodeit;
//Mod 4 : Virtual Pets Amok

public class LitterBox implements PetToilet {

	private static final int DEFAULT_POOP_LEVEL = 0;
	private int poopLevel = DEFAULT_POOP_LEVEL;

	// accessors
	public int getPoopLevel() { // get in VPS class
		return poopLevel;
	}

	public void addPoop(int amount) { // use in Cat class
		poopLevel += amount;

	}

	@Override
	public boolean isDirty() {
		if(poopLevel >= 20) {
			return true;
		}
		return false;
	}

	@Override
	public void clean() {
		poopLevel = DEFAULT_POOP_LEVEL;
	}
}
