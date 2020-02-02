package org.wecancodeit;

public class Cage implements PetToilet { // shouldn't be a toilet, but sometimes is...

	private static final int DEFAULT_POOP_LEVEL = 0;
	private int poopLevel = DEFAULT_POOP_LEVEL;

	@Override
	public int getPoopLevel() {
		return poopLevel;
	}

	
	@Override
	public void addPoop(int amount) {
		poopLevel += amount;
	}
	
	
	@Override
	public boolean isDirty() {
		if(poopLevel >= 1) {
			return true;
		}
		return false;
	}

	

	@Override
	public void clean() {
		poopLevel = DEFAULT_POOP_LEVEL;
	}

}
