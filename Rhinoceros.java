public class Rhinoceros extends Animal {
    public Rhinoceros(String name, int age) {
        super(name, age, "Rhinoceros");
    }

    public Rhinoceros() {
        super("Default Rhino", 8, "Rhinoceros");
    }

    @Override
    public void move() {
        System.out.println(getName() + " the rhinoceros is charging mightily.");
    }
}
