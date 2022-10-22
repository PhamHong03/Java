public class Bird extends Animals{

    public Bird() {
        super("Bird");
    }

    @Override
    public void eat() {
        System.out.println("Toi an sau bo");
    }

    @Override
    public void makeSound() {
        System.out.println("Chip Chip");
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
