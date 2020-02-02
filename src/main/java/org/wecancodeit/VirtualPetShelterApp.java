package org.wecancodeit;
// Mod 4: Virtual Pets Amok

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		VirtualPetShelter myPets = new VirtualPetShelter();
		Scanner input = new Scanner(System.in);

		// starter pets
		Cat pet1 = new Cat(1, "Cleo", "big fluffy cat", 10, 0, 0, 0, 2);
		Dog pet2 = new Dog(2, "Beau", "stocky bulldog", 10, 3, 0, 0, 0);
		RoboPet pet3 = new RoboPet(3, "Stanley", "the robunny", 10, 0);

		myPets.add(pet1);
		myPets.add(pet2);
		myPets.add(pet3);

		System.out.println("Welcome to the WCCI Pet Shelter!");
		System.out.println("\n********************************************** \n");

		printMenu();

		while (true) {

			System.out.println("\nWhat would you like to do?");
			String menuOption = input.nextLine();

			if (menuOption.toLowerCase().contentEquals("help")) {
				printMenu();
				continue;
			}

			else if (menuOption.contentEquals("1")) {

				System.out.println("\nStatus for all pets: ");

				System.out.println("Name \t | Hunger| Thirst|Boredom| Poop");
				System.out.println("-----------------------------------------");

				Collection<VirtualPet> petStats = myPets.getAllPets();
				Collection<OrganicPet> orgPetStats = myPets.getAllOrganicPets();
				Collection<RoboPet> roboPetStats = myPets.getAllRoboPets();


				for (OrganicPet currentPet : orgPetStats) {

					if (currentPet instanceof OrganicPet) { // checks if they are organic
						System.out.println(currentPet.getPetName() + "\t | " + currentPet.getHunger() + "\t | "
								+ currentPet.getThirst() + "\t | " + currentPet.getBoredom() + "\t | "
								+ currentPet.getPoop());
					}
					
				for (RoboPet currentPet : orgPetStats) {

					if (currentPet instanceof OrganicPet) { // checks if they are organic
						System.out.println(currentPet.getPetName() + "\t | " + currentPet.getHunger() + "\t | "
								+ currentPet.getThirst() + "\t | " + currentPet.getBoredom() + "\t | "
								+ currentPet.getPoop());
						}	
					
					
					
					
					
					
				}

			}

		}

	}

	private static void printMenu() {
		System.out.println("1: Check status for all pets. (Hint: 0 = satisfied)");
		System.out.println("2: Print a pet roster");
		System.out.println("3: Feed all the pets");
		System.out.println("4: Give all the pets water");
		System.out.println("5: Play with a pet");
		System.out.println("6: Clean up after the pets");
		System.out.println("7: Adopt a pet");
		System.out.println("8: Admit a new pet");
		System.out.println("9: Quit");

		System.out.println("--- To see menu again, type \"help\". ---");

	}

}
