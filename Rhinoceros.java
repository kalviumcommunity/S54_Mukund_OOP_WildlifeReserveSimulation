public class Rhinoceros extends Animal {
    public Rhinoceros(String name, int age) {
        super(name, age, "Rhinoceros");
    }

    public Rhinoceros() {
        super();
    }

    @Override
    public void move() {
        System.out.println(getName() + " the rhinoceros is galloping.");
    }
}
