public class Lion extends Animal {
    private final MovementBehavior movementBehavior;

    public Lion(String name, int age, MovementBehavior movementBehavior) {
        super(name, age, "Lion");
        this.movementBehavior = movementBehavior;
    }

    public Lion() {
        this("Unknown", 0, new WalkBehavior());
    }

    @Override
    public void move() {
        movementBehavior.move(getName());
    }
}
