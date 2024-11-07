public class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age, "Lion");
    }

    public Lion() {
        super();
    }

    @Override
    public void move() {
        System.out.println(getName() + " the lion is moving.");
    }
}
