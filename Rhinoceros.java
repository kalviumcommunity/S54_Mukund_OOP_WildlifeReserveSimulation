public class Rhinoceros extends Animal {
    public Rhinoceros(String name, int age) {
        super(name, age, "Rhinoceros");
    }

    @Override
    public void move() {
        System.out.println(getName() + " the rhinoceros is galloping.");
    }
}
