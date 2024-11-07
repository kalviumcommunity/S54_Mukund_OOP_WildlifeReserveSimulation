public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age, "Cat");
    }

    public Cat() {
        super();
    }

    @Override
    public void move() {
        System.out.println(getName() + " the cat is sneaking around.");
    }
}
