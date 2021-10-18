package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		boolean keepGoing = true;
		Scanner sc = new Scanner(System.in);
		String ftname = "";
		String fdType = "";
		int rating = 0;
		int i = 0;
		int numOfTrucks = 0;
		int truckID;
		FoodTruck[] foodTrucks = new FoodTruck[5];
		FoodTruck truck = new FoodTruck();
		truckID = truck.getTruckID();
		System.out.println("Welcome to your food truck directory!");
		System.out.println("Please enter information on your favorite or least favorite food trucks!");

		while (keepGoing == true) {
			System.out.print("Enter the name of your food truck or type quit to go to the next menu: ");
			ftname = sc.nextLine();
			if (ftname.equalsIgnoreCase("quit")) {
				keepGoing = false;
				break;
			} else {
				System.out.print("Enter the type of food served there: ");
				fdType = sc.nextLine();

				System.out.print("On a scale of 1 to 5 what would you rate this food truck?");
				rating = sc.nextInt();

				sc.nextLine();
				truck = new FoodTruck(ftname, fdType, rating, truckID);

				truck.addFoodTruck(foodTrucks, truck, i);
				truckID = truck.getTruckID();
				i++;
				numOfTrucks++;
			}
			if(numOfTrucks >= 5) {
				System.out.println("You have entered the max number of trucks.");
				keepGoing = false;
				break;
			}

		}

		int menuChoice = 0;
		do {
			System.out.println();
			System.out.println();
			System.out.println("Please choose a a number of the menu for options.");
			System.out.println();
			System.out.println("====================================");
			System.out.println("| 1. List the food trucks          |");
			System.out.println("|                                  |");
			System.out.println("| 2. Display the average rating    |");
			System.out.println("|      of the food trucks          |");
			System.out.println("|                                  |");
			System.out.println("| 3. Display the highest rated     |");
			System.out.println("|          food truck              |");
			System.out.println("|                                  |");
			System.out.println("| 4. Quit the program              |");
			System.out.println("====================================");
			menuChoice = sc.nextInt();
			sc.nextLine();

			switch (menuChoice) {
			case 1:
				for (FoodTruck each : foodTrucks) {
					if (each != null) {
						System.out.println(each.toString());
					}
				}
				break;

			case 2:
				double average = 0;
				for (int idx = 0; idx < numOfTrucks; idx++) {
					if (foodTrucks[idx] != null) {
						FoodTruck truck1 = foodTrucks[idx];
						average += truck1.getRating();
					} else {
						continue;
					}
				}
				average = average / numOfTrucks;
				System.out.println(average);
				break;

			case 3:
				FoodTruck highestRated = foodTrucks[0];
				int highRate = highestRated.getRating();
				for (int j = 1; j < numOfTrucks; j++) {
					FoodTruck highestRated2 = foodTrucks[j];
					int highRate1 = highestRated2.getRating();
					if (highRate1 > highRate) {
						highRate = highRate1;
						highestRated = highestRated2;
					}
				}
				System.out.println(highestRated.toString());
				break;
			case 4:
				System.out.println("GoodBye");
				break;

			default:
				System.out.println("Invlaid entry please enter the number to corresponding option.");
			}
		} while (menuChoice != 4);

	}
}
