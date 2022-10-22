public class Dog extends Animals{

    public Dog() {
        super("Dog");
    }

    @Override
    public void eat() {
        System.out.println("Toi an xuong");
    }

    @Override
    public void makeSound() {
        System.out.println("Gau Gau");
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
