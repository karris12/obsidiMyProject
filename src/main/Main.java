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
        // Add more towns...

        restaurants.add(new Restaurant("Black + Blue"));
        restaurants.add(new Restaurant("Uk India Bistro"));
        restaurants.add(new Restaurant("Casa Madera"));
        // Add more restaurants...

        places.add(new Place("The Distillery District"));
        places.add(new Place("High Park"));
        places.add(new Place("Toronto Islands"));
        // Add more places...

        // Implement the menu
        showMenu(towns, restaurants, places);
    }

    // Menu to display options
    public static void showMenu(ArrayList<Town> towns, ArrayList<Restaurant> restaurants, ArrayList<Place> places) {
        // Display the menu options
        System.out.println("Welcome to Toronto Visitor App!");
        System.out.println("Select an option:");
        System.out.println("1. Show 10 beautiful towns in Toronto");
        System.out.println("2. Show 10 most visited restaurants in Toronto");
        System.out.println("3. Show 10 interesting places to visit in Toronto");

        // Get the user's input
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        // Validate input (step for input validation)
        if (choice < 1 || choice > 3) {
            System.out.println("Invalid option, please select 1, 2, or 3.");
            return; // Exit if invalid
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
                System.out.println("Invalid selection!");
        }
    }

    // Method to show towns
    public static void showTowns(ArrayList<Town> towns) {
        System.out.println("Here are 10 beautiful towns in Toronto:");
        for (Town town : towns) {
            System.out.println(town.getName());
        }
    }

    // Method to show restaurants
    public static void showRestaurants(ArrayList<Restaurant> restaurants) {
        System.out.println("Here are 10 most visited restaurants in Toronto:");
        for (Restaurant restaurant : restaurants) {
            System.out.println(restaurant.getName());
        }
    }

    // Method to show places
    public static void showPlaces(ArrayList<Place> places) {
        System.out.println("Here are 10 interesting places to visit in Toronto:");
        for (Place place : places) {
            System.out.println(place.getName());
        }
    }
}
