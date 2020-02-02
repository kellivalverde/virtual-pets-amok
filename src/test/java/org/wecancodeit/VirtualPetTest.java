package org.wecancodeit;

import static org.junit.Assert.*;

import org.junit.Test;

public class VirtualPetTest {
	// Mod 4: Virtual Pets Amok

	VirtualPet underTest = new Cat(1, "Name", "description", 10, 0, 0, 0, 0);

	@Test
	public void healthShouldStartAt10() {
		int result = underTest.getHealth();
		assertEquals(10, result);
	}

	@Test
	public void shouldReturnPetName() {
		String check = underTest.getPetName();
		assertEquals(check, "Name");

	}

	@Test
	public void shouldReturnPetDescription() {
		String check = underTest.getPetDescription();
		assertEquals(check, "description");

	}
	@Test
	public void shouldReturnPetIdNum() {
		int check = underTest.getPetId();
		assertEquals(check, 1);

	}
}
