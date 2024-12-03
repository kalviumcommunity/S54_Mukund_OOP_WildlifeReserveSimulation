public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age, "Cat");
    }

    public Cat() {
        super("Default Cat", 2, "Cat");
    }

    @Override
    public void move() {
        System.out.println(getName() + " the cat is leaping gracefully.");
    }
}
