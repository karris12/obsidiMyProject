package model;

//Restaurant class inherits from Location
public class Restaurant extends Location {
 // Constructor for Restaurant, calls the parent class constructor
 public Restaurant(String name) {
     super(name);  // Call the superclass (Location) constructor
 }

 // Override the showInfo method to customize the display for restaurants
 @Override
 public void showInfo() {
     System.out.println("Restaurant: " + getName());  // Polymorphism: Behavior specific to Restaurant
 }
}
