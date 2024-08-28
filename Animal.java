public class Animal {
    //Attributes
    private final String name;
    private final int age;
    private final String species;

    //Constructor
    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
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
}
