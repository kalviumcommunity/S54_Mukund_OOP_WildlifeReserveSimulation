public class Zebra extends Animal {
    public Zebra(String name, int age) {
        super(name, age, "Zebra");
    }

    public Zebra() {
        super();
    }

    @Override
    public void move() {
        System.out.println(getName() + " the zebra is running.");
    }
}
