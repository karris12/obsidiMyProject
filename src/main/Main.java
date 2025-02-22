package main;

import model.Town;
import model.Restaurant;
import model.Place;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create lists for towns, restaurants, and places
        ArrayList<Town> towns = new ArrayList<>();
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        ArrayList<Place> places = new ArrayList<>();

        // Add data to the lists
        towns.add(new Town("Paris"));
        towns.add(new Town("St. Jacobs Village"));
        towns.add(new Town("Collingwood"));
        towns.add(new Town("Picton"));
        towns.add(new Town("Unionville"));
        towns.add(new Town("Port Perry"));
        towns.add(new Town("Bracebridge"));
        towns.add(new Town("Creemore"));
        towns.add(new Town("Port Hope"));
        towns.add(new Town("Elora"));

        restaurants.add(new Restaurant("Black + Blue"));
        restaurants.add(new Restaurant("Uk India Bistro"));
        restaurants.add(new Restaurant("Casa Madera"));
        restaurants.add(new Restaurant("Harriet's Rooftop"));
        restaurants.add(new Restaurant("1 Kitchen"));
        restaurants.add(new Restaurant("New Orleans Seafood & Steakhouse"));
        restaurants.add(new Restaurant("Silent H"));
        restaurants.add(new Restaurant("Jacobs & Co. Steakhouse"));
        restaurants.add(new Restaurant("Pai Northern Thai Kitchen"));
        restaurants.add(new Restaurant("The Restaurant at the CN Tower"));

        places.add(new Place("The Distillery District"));
        places.add(new Place("High Park"));
        places.add(new Place("Toronto Islands"));
        places.add(new Place("Scarborough Bluffs"));
        places.add(new Place("Royal Ontario Museum"));
        places.add(new Place("Casa Loma"));
        places.add(new Place("Nathan Phillips Square"));
        places.add(new Place("St. Lawrence Market"));
        places.add(new Place("The Waterfront"));
        places.add(new Place("Art Gallery of Ontario"));

        // Implement the menu
        showMenu(towns, restaurants, places);
    }

    // Menu to display options
    public static void showMenu(ArrayList<Town> towns, ArrayList<Restaurant> restaurants, ArrayList<Place> places) {
        Scanner scanner = new Scanner(System.in);

        // Display the menu options with some visual enhancement
        System.out.println("***************************************");
        System.out.println("      Welcome to Toronto Visitor App!");
        System.out.println("***************************************");
        System.out.println("Select an option below by entering the corresponding number:");
        System.out.println("1. Show 10 beautiful towns in Toronto");
        System.out.println("2. Show 10 most visited restaurants in Toronto");
        System.out.println("3. Show 10 interesting places to visit in Toronto");
        System.out.println("***************************************");

        // Get the user's input
        int choice = 0;
        boolean validChoice = false;

        // Loop to handle invalid input and prompt user until a valid choice is made
        while (!validChoice) {
            try {
                System.out.print("Enter your choice (1, 2, or 3): ");
                choice = Integer.parseInt(scanner.nextLine());
                
                if (choice < 1 || choice > 3) {
                    System.out.println("Invalid choice! Please select 1, 2, or 3.");
                } else {
                    validChoice = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number (1, 2, or 3).");
            }
        }

        // Display corresponding list based on user's choice
        switch (choice) {
            case 1:
                showTowns(towns);
                break;
            case 2:
                showRestaurants(restaurants);
                break;
            case 3:
                showPlaces(places);
                break;
            default:
                System.out.println("Something went wrong. Please try again.");
        }
    }

    // Method to show towns
    public static void showTowns(ArrayList<Town> towns) {
        System.out.println("\n***************************************");
        System.out.println("10 Beautiful Towns in Toronto:");
        System.out.println("***************************************");
        for (Town town : towns) {
            System.out.println("- " + town.getName());
        }
        System.out.println("***************************************\n");
    }

    // Method to show restaurants
    public static void showRestaurants(ArrayList<Restaurant> restaurants) {
        System.out.println("\n***************************************");
        System.out.println("10 Most Visited Restaurants in Toronto:");
        System.out.println("***************************************");
        for (Restaurant restaurant : restaurants) {
            System.out.println("- " + restaurant.getName());
        }
        System.out.println("***************************************\n");
    }

    // Method to show places
    public static void showPlaces(ArrayList<Place> places) {
        System.out.println("\n***************************************");
        System.out.println("10 Interesting Places to Visit in Toronto:");
        System.out.println("***************************************");
        for (Place place : places) {
            System.out.println("- " + place.getName());
        }
        System.out.println("***************************************\n");
    }
}
