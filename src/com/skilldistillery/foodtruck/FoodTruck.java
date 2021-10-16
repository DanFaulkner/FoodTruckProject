package com.skilldistillery.foodtruck;

public class FoodTruck {
	private String name;
	private String foodType;
	private int rating;
	private static int truckID = 0;
	private static int numFoodTrucks = 0;
	private int truckIDCopy;
	
	public FoodTruck() {
		
	}
	
	public FoodTruck(String name, String foodtype, int rating, int id) {
		this.name = name;
		this.foodType = foodtype;
		this.rating = rating;
		this.truckIDCopy = truckID;
	}
	
	
	public int getNumFoodTrucks() {
		return numFoodTrucks;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		
		return rating;
	}
	
	
	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getTruckID() {
		return truckID;
	}

	public String toString() {
		String output = "Name: " + name + " Food: " + foodType + " Rating: " + rating + " Truck ID: " + truckIDCopy;
		return output;
	}
		
	public void addFoodTruck(FoodTruck[] ftArr, FoodTruck ft, int i) {
		ftArr[i] = ft;
		truckID++;
		
	}

	
	
	
}
