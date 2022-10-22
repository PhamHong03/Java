public class Cat extends Animals{
    public Cat() {
        super("Cat");
    }

    @Override
    public void eat() {
        System.out.println("Toi an ca");
    }

    @Override
    public void makeSound() {
        System.out.println("Meo Meo");
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
