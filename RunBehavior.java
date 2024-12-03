public class RunBehavior implements MovementBehavior {
    @Override
    public void move(String name) {
        System.out.println(name + " is running.");
    }
}
