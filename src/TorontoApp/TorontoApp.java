package TorontoApp;

import model.Town;
import model.Restaurant;
import model.Place;
import model.Location;


import java.util.ArrayList;
import java.util.Scanner;

public class TorontoApp {
    public static void main(String[] args) {
        // List to store different types of locations
        ArrayList<Location> locations = new ArrayList<>();

        // Adding some towns, restaurants, and places to the list
        locations.add(new Town("Paris"));
        locations.add(new Town("St. Jacobs Village"));
        locations.add(new Restaurant("Black + Blue"));
        locations.add(new Restaurant("Uk India Bistro"));
        locations.add(new Place("The Distillery District"));
        locations.add(new Place("High Park"));

        // Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Menu for user to choose options
        System.out.println("Welcome to the Toronto Visitor Guide!");
        System.out.println("Please choose an option:");
        System.out.println("1. Show beautiful towns in Toronto");
        System.out.println("2. Show popular restaurants in Toronto");
        System.out.println("3. Show interesting places in Toronto");

        // Get user input
        int choice = scanner.nextInt();

        // Show results based on user choice
        switch (choice) {
            case 1:
                System.out.println("\nBeautiful towns in Toronto:");
                showLocationsOfType(locations, Town.class);
                break;
            case 2:
                System.out.println("\nPopular restaurants in Toronto:");
                showLocationsOfType(locations, Restaurant.class);
                break;
            case 3:
                System.out.println("\nInteresting places in Toronto:");
                showLocationsOfType(locations, Place.class);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        // Close scanner
        scanner.close();
    }

    // Method to show locations of a specific type (Polymorphism)
    private static void showLocationsOfType(ArrayList<Location> locations, Class<?> locationType) {
        for (Location location : locations) {
            // Check if the location is of the specified type (Polymorphism)
            if (locationType.isInstance(location)) {
                location.showInfo();  // Polymorphism in action
            }
        }
    }
}
