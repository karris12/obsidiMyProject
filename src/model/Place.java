package model;

//Place class inherits from Location
public class Place extends Location {
 // Constructor for Place, calls the parent class constructor
 public Place(String name) {
     super(name);  // Call the superclass (Location) constructor
 }

 // Override the showInfo method to customize the display for places
 @Override
 public void showInfo() {
     System.out.println("Place: " + getName());  // Polymorphism: Behavior specific to Place
 }
}
