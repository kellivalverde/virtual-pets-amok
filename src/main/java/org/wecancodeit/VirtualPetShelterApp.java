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
		Cat pet1 = new Cat(1, "Cleo", "big fluffy cat", 10, 0, 0, 0, 0);
		Dog pet2 = new Dog(2, "Beau", "stocky bulldog", 10, 0, 0, 0, 0);
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

				System.out.println("Name \t| Health | Hunger| Thirst|Boredom| Poop  | Rust Level");
				System.out.println("---------------------------------------------------------------");

				Collection<VirtualPet> petStats = myPets.getAllPets();
		
				
				for (VirtualPet currentPet : petStats) {
				
					if (currentPet instanceof OrganicPet) {
						System.out.println(currentPet.getPetName() + "\t|  " + currentPet.getHealth() + "\t | "
								+ ((OrganicPet) currentPet).getHunger() + "\t |  "
								+ ((OrganicPet) currentPet).getThirst() + "\t |  "
								+ ((OrganicPet) currentPet).getBoredom() + "\t |  " + ((OrganicPet) currentPet).getPoop()
								+ "\t |   -   ");
						//continue;
					} else if (currentPet instanceof RoboPet) {
						System.out.println(currentPet.getPetName()+ "\t|  " 
								+ currentPet.getHealth() 
								+ "\t |   -   |   -   |   -   |   -   |   "
								
								+ ((RoboPet) currentPet).getRustLevel());
					}

				}
				
			} else if (menuOption.contains("2")) {
				
				Collection<VirtualPet> petRoster = myPets.getAllPets();
				// Collection is a type like String or int, etc.

				for (VirtualPet currentPet : petRoster) {
					System.out.println(currentPet.getPetName()); // add description
				}
				
			} else if (menuOption.contentEquals("3")) {
				System.out.println("Feeding time! Come and get it, pets!");
				
				myPets.feedAllOrganicPets();
					
				}
			else if (menuOption.contentEquals("4")) {
				System.out.println("Who's thirsty? You gave water to all pets.");
				
				myPets.waterAllOrganicPets();
					
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
