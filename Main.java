public class Main {
    public static void main(String[] args) {
        //Creating an array of Animal objects
        Animal[] animals = new Animal[5];   //Array to store 5 Animal objects

        //Instantiating Animal objects and storing them in an array
        animals[0] = new Animal("Leo", 5, "Lion");
        animals[1] = new Animal("Zara", 3, "Zebra");
        animals[2] = new Animal("Ella", 2, "Elephant");
        animals[3] = new Animal("Asteroid Destroyer", 1, "Cat");
        animals[4] = new Animal("Bob", 2, "Rhinoceros");

        //Creating an object for Environment Class
        Environment savaana = new Environment("Summer", "Sunny");

        // Looping through the array to display details and simulate movement
        for (int i = 0; i < animals.length; i++) {
            System.out.println("Animal " + (i + 1) + ":");
            animals[i].displayDetails();
            animals[i].move();
            System.out.println();  // Blank line for better readability
        }

        //Using Environment object to display details and simulate season change
        savaana.displayEnvironment();
        savaana.changeSeason("Rainy");
    }
}
