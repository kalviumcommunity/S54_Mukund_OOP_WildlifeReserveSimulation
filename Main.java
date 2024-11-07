public class Main {
    public static void main(String[] args) {
        //Creating an array of Animal objects
        Animal[] animals = new Animal[8];   //Array to store 7 Animal objects

        //Instantiating Animal objects and storing them in an array
        animals[0] = new Lion("Leo", 5);
        animals[1] = new Zebra("Zara", 3);
        animals[2] = new Elephant("Ella", 2);
        animals[3] = new Cat("Asteroid Destroyer", 1);
        animals[4] = new Rhinoceros("Bob", 2);
        animals[5] = new Rhinoceros("Mike", 1);
        animals[6] = new Cat("Tero", 8);
        animals[7] = new Zebra();

        //Creating environment objects for different details
        Environment savanna = new Savanna("Summer", "Sunny");
        Environment rainforest = new Rainforest("Monsoon", "Humid");
        Environment defaultRainforest = new Rainforest();

        // Looping through the array to display details and simulate movement
        for (int i = 0; i < animals.length; i++) {
            System.out.println("Animal " + (i + 1) + ":");
            animals[i].displayDetails();
            animals[i].move();
            System.out.println();  // Blank line for better readability
        }

        //Using setter methods to update an animal's details
        animals[0].setName("Simba");
        animals[0].setAge(6);
        animals[0].setSpecies("Panther");

        System.out.println("After updating first animal:");
        animals[0].displayDetails();
        animals[0].move();
        System.out.println();  // Blank line for better readability

        //Using Environment object to display details and simulate season change
        savanna.displayEnvironment();
        savanna.changeSeason("Rainy");
        savanna.changeSeason("Winter");

        System.out.println();  // Blank line for better readability

        rainforest.displayEnvironment();
        rainforest.changeSeason("Dry");
        rainforest.changeSeason("Monsoon");

        System.out.println();  // Blank line for better readability

        defaultRainforest.displayEnvironment();
        System.out.println();  // Blank line for better readability

        //Display static variable animalCount after creating all the animals
        System.out.println("Total number of animals: " + Animal.getAnimalCount());

        //Display unique species count
        System.out.println("Total number of unique species: " + Animal.getUniqueSpecies());

        //Display the static variable totalSeasons
        System.out.println("Total season changes across all environments: " + Environment.getTotalSeasons());
    }
}
