public class Main {
    public static void main(String[] args) {
        //Creating objects for Animal Class
        Animal lion = new Animal("Leo", 5, "Lion");
        Animal zebra = new Animal("Zara", 3, "Zebra");

        //Creating an object for Environment Class
        Environment savaana = new Environment("Summer", "Sunny");

        //Using Animal objects to display details and simulate movement
        lion.displayDetails();
        lion.move();

        System.out.println();   //Blank Line for readability

        zebra.displayDetails();
        zebra.move();

        System.out.println();   //Blank Line for readability

        //Using Environment object to display details and simulate season change
        savaana.displayEnvironment();
        savaana.changeSeason("Rainy");
    }
}
