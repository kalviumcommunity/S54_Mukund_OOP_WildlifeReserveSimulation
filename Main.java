public class Main {
    public static void main(String[] args) {
        // Creating an array of Animal objects
        Animal[] animals = new Animal[6];

        // Adding various animals
        animals[0] = new Lion("Leo", 5, new RunBehavior());
        animals[1] = new Zebra("Zara", 3);
        animals[2] = new Elephant("Ella", 15);
        animals[3] = new Cat("Whiskers", 2);
        animals[4] = new Cat("Asteroid Destroyer", 1);
        animals[5] = new Rhinoceros("RhinoBob", 10);

        // Displaying animal details and movement
        for (Animal animal : animals) {
            animal.displayDetails();
            animal.move();
            System.out.println();
        }

        // Static tracking
        System.out.println("Total number of animals: " + AnimalStatistics.getAnimalCount());
        System.out.println("Total number of unique species: " + AnimalStatistics.getUniqueSpecies());

        System.out.println();

        // Environments
        Environment savanna = new Savanna("Dry", "Hot");
        Environment rainforest = new Rainforest("Rainy", "Humid");

        savanna.displayEnvironment();
        savanna.changeSeason("Rainy");

        System.out.println();

        rainforest.displayEnvironment();
        rainforest.changeSeason("Dry");

        System.out.println();

        System.out.println("Total season changes across all environments: " + Environment.getTotalSeasons());
    }
}
