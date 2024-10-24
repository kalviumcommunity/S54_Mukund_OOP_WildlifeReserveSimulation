import java.util.HashSet;

public abstract class Animal {
    //Attributes - encapsulated as private
    private String name;
    private int age;
    private String species;

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

    //Getter methods (Accessors)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    //Setter methods (Mutators)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    //Member function to display animal's details
    public void displayDetails() {
        System.out.println("Animal Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Species: " + getSpecies());
    }

    //Member function to simulate animal movement
    public abstract void move();

    //Static method to get the total number of animals created
    public static int getAnimalCount() {
        return animalCount;
    }

    //Static method to get the total unique species count
    public static int getUniqueSpecies() {
        return uniqueSpecies.size();
    }
}
