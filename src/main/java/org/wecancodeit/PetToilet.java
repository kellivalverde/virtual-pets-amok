package org.wecancodeit;

public interface PetToilet {

	int getPoopLevel();

	boolean isDirty(); 
	
	void addPoop(int amount);
		
	void clean();
	
	
	
}
