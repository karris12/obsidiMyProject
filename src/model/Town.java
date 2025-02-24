package model;

//Town class inherits from Location
public class Town extends Location {
 // Constructor for Town, calls the parent class constructor
 public Town(String name) {
     super(name);  // Call the superclass (Location) constructor
 }

 // Override the showInfo method to customize the display for towns
 @Override
 public void showInfo() {
     System.out.println("Town: " + getName());  // Polymorphism: Behavior specific to Town
 }
}
