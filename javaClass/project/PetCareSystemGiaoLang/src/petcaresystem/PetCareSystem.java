package petcaresystem;

import data.Cabinet;
import ui.Menu;

public class PetCareSystem {
	public static void main(String[] args) {
		Menu menu = new Menu("Happiness Pet Care System ");
		menu.addNewOption("1. Add a new dog Profile");
		menu.addNewOption("2. Add a new cat Profile");
		menu.addNewOption("3. Search the Pet Profile by id");
		menu.addNewOption("4. Update a pet profile by id");
		menu.addNewOption("5. Remove a pet");
		menu.addNewOption("6. Print the pet list asc by id");
		menu.addNewOption("7. Print the pet list asc by name");
		menu.addNewOption("8. Quit");
		Cabinet cage = new Cabinet();
		int choice;
		do {
			menu.printMenu();
			choice = menu.getChoice();
			switch(choice) {
				case 1:{
					System.out.println("You are preparing to input a new dog profile");
					cage.addNewDog();
					break;
				}
				case 2:{
					System.out.println("You are preparing to input a new cat profile");
					cage.addNewCat();
					break;
				}
				case 3:{
					System.out.println("You are required to input a pet id to search");
					cage.searchPetByID();
					break;
				}
				case 4:{
					System.out.println("You are required to input a pet id to update");
					cage.updatePet();
					break;
				}
				case 5:{
					System.out.println("You are required to input a pet id to remove");
					cage.RemovePet();
					break;
				}
				case 6:{
					System.out.println("You are preparing to asc by id");
					cage.printfPetListAscendingByID();
					break;
				}
				case 7:{
					System.out.println("You are preparing to asc by name");
					cage.printfPetListAscendingByName();
					break;
				}
				case 8:{
					System.out.println("See you later!!");
					break;
				}
			}
		}while(choice != 8);
	}
}
