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
		RoboPet pet3 = new RoboPet(3, "Stanley", "the robo-bunny", 10, 0);

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
								+ ((OrganicPet) currentPet).getBoredom() + "\t |  "
								+ ((OrganicPet) currentPet).getPoop() + "\t |   -   ");
						// continue;
					} else if (currentPet instanceof RoboPet) {
						System.out.println(currentPet.getPetName() + "\t|  " + currentPet.getHealth()
								+ "\t |   -   |   -   |   -   |   -   |   "

								+ ((RoboPet) currentPet).getRustLevel());
					}

				}

			} else if (menuOption.contains("2")) {

				Collection<VirtualPet> petRoster = myPets.getAllPets();
				// Collection is a type like String or int, etc.

				for (VirtualPet currentPet : petRoster) {
					System.out.println(currentPet.getPetName() + " the " + currentPet.getPetDescription());
				}

			} else if (menuOption.contentEquals("3")) {
				System.out.println("Feeding time! Come and get it, pets!");
				myPets.feedAllOrganicPets();

			} else if (menuOption.contentEquals("4")) {
				System.out.println("Who's thirsty? You gave water to all pets.");
				myPets.waterAllOrganicPets();

			}

			else if (menuOption.contentEquals("5")) {

				System.out.println(
						"What would you like to do?: \n  A: Play with the cats \n  B: Take some pets for a walk");
				String selectedOption = input.nextLine();

				if (selectedOption.toUpperCase().contentEquals("A")) {
					myPets.playWithCats();
					System.out.println("The cats really loved playing with the laser! Me-ow!");

				} else if (selectedOption.toUpperCase().contentEquals("B")) {
					myPets.walkAllWalkablePets();
					System.out.println(
							"Wow! the dogs really loved going on a walk! \n...uh-oh! the robo-pets are looking a little rusty, though.");

				} else {
					System.out.println("Sorry, that is not an option.");
				}

			} else if (menuOption.contentEquals("6")) {

				System.out.println("What would you like to do?: \n  A: Clean the litter box \n  B: Check the dog cages");
				String selectedOption = input.nextLine();
					if (selectedOption.toUpperCase().contentEquals("A")) {
						if(myPets.getLitterBox().isDirty()) {
						myPets.emptyLitterBox();
						} else if (selectedOption.toUpperCase().contentEquals("B")) {
						myPets.cleanAllCages();
						}System.out.println("Sorry, that is not an option.");
					}
				
			} else if (menuOption.contentEquals("7")) {
				System.out.println("Which pet would you like to adopt?");

				String adoptedPet = input.nextLine();
				VirtualPet petToAdopt = myPets.findPet(adoptedPet);
				System.out.println("Thank you for adopting " + adoptedPet + ".");
				myPets.remove(petToAdopt);

			
			
			
			
			}else{

				System.out.println("What?! Say that again.");
				System.out.println("--- To see menu again, type \"help\". ---");

			}
		myPets.tickAllPets();

		input.close();
		}
		
		
	}

	private static void printMenu() {
		System.out.println("1: Check status for all pets. (Hint: 0 = satisfied)");
		System.out.println("2: See pet roster");
		System.out.println("3: Feed pets");
		System.out.println("4: Give water to pets");
		System.out.println("5: Play with pets");
		System.out.println("6: Clean up after the pets");
		System.out.println("7: Adopt a pet");
		System.out.println("8: Admit a new pet");
		System.out.println("9: Quit");
		System.out.println("--- To see menu again, type \"help\". ---");

	}

}
