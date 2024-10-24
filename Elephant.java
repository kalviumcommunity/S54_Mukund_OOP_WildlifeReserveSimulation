public class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age, "Elephant");
    }

    @Override
    public void move() {
        System.out.println(getName() + " the elephant is walking slowly.");
    }
}
