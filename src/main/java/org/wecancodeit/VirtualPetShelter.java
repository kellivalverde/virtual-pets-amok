package org.wecancodeit;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private LitterBox litterBox = new LitterBox();

	private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	public void add(VirtualPet petToAdd) {
		pets.put(petToAdd.getPetName(), petToAdd);

		if (petToAdd instanceof Cat) {
			((Cat) petToAdd).setLitterBox(litterBox); // casting -> sets litterBox to the one in my Cat class
		}

	}

}
