public class Main {
    public static void main(String[] args) {
        //Creating an array of Animal objects
        Animal[] animals = new Animal[7];   //Array to store 7 Animal objects

        //Instantiating Animal objects and storing them in an array
        animals[0] = new Animal("Leo", 5, "Lion");
        animals[1] = new Animal("Zara", 3, "Zebra");
        animals[2] = new Animal("Ella", 2, "Elephant");
        animals[3] = new Animal("Asteroid Destroyer", 1, "Cat");
        animals[4] = new Animal("Bob", 2, "Rhinoceros");
        animals[5] = new Animal("Mike", 1, "Rhinoceros");
        animals[6] = new Animal("Tero", 8, "Cat");

        //Creating an object for Environment Class
        Environment savaana = new Environment("Summer", "Sunny");

        // Looping through the array to display details and simulate movement
        for (int i = 0; i < animals.length; i++) {
            System.out.println("Animal " + (i + 1) + ":");
            animals[i].displayDetails();
            animals[i].move();
            System.out.println();  // Blank line for better readability
        }

        //Display static variable animalCount after creating all the animals
        System.out.println("Total number of animals: " + Animal.getAnimalCount());

        //Display unique species count
        System.out.println("Total number of unique species: " + Animal.getUniqueSpecies());

        System.out.println();  // Blank line for better readability

        //Using Environment object to display details and simulate season change
        savaana.displayEnvironment();
        savaana.changeSeason("Rainy");
        savaana.changeSeason("Winter");

        System.out.println();  // Blank line for better readability

        //Display the static variable totalSeasons
        System.out.println("Total season changes across all the environment: " + Environment.getTotalSeasons());
    }
}
