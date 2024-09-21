import java.util.*;

public class Animal {
    //Attributes
    private final String name;
    private final int age;
    private final String species;

    //Static HashSet to track unique species
    private static final HashSet<String> uniqueSpecies = new HashSet<>();
    //Static Variable to keep track of total number of animals created
    private static int animalCount = 0;

    //Constructor
    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
        animalCount++;                  //Incrementing animal count when a new animal is created
        uniqueSpecies.add(species);     //Adding species to the HashSet, only unique species will be added
    }

    //Member function to display animal's details
    public void displayDetails() {
        System.out.println("Animal Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Species: " + species);
    }

    //Member function to simulate animal movement
    public void move() {
        System.out.println(name + " the " + species + " is moving.");
    }

    //Static method to get the total number of animals created
    public static int getAnimalCount() {
        return animalCount;
    }

    //Static method to get the total unique species count
    public static int getUniqueSpecies() {
        return uniqueSpecies.size();
    }
}
