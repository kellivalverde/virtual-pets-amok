package org.wecancodeit;

public class LitterBox {

	private static final int DEFAULT_POOP_LEVEL = 0;

	private int poopLevel = DEFAULT_POOP_LEVEL;

	// accessors
	public int getPoopLevel() { // get in VPS class
		return poopLevel;
	}

	public void addPoop(int amount) { // use in Cat class
		poopLevel += amount;

	}
}
