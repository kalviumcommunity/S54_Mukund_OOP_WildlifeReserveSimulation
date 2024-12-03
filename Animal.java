public abstract class Animal {
    private String name;
    private int age;
    private String species;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
        AnimalStatistics.incrementCount(species); // Delegate static tracking to AnimalStatistics
    }

    public Animal() {
        this("Unknown", 0, "Unknown");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void displayDetails() {
        System.out.println("Animal Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Species: " + getSpecies());
    }

    public abstract void move(); // Abstract method to be implemented by subclasses
}
