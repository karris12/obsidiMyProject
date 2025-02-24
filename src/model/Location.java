package model;

//Base class for all location types
public class Location {
 private String name;  // Name of the location

 // Constructor to initialize the name
 public Location(String name) {
     this.name = name;
 }

 // Getter method to access the name
 public String getName() {
     return name;
 }

 // Abstract method to display information about the location
 public void showInfo() {
     System.out.println("- " + getName());
 }
}
