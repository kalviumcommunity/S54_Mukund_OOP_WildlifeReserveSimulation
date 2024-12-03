public class Zebra extends Animal {
    public Zebra(String name, int age) {
        super(name, age, "Zebra");
    }

    public Zebra() {
        super("Default Zebra", 3, "Zebra");
    }

    @Override
    public void move() {
        System.out.println(getName() + " the zebra is galloping across the savanna.");
    }
}
