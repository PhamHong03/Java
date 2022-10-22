public class Test {
    public static void main(String[] args) {
        System.out.println("Test Dog");
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.makeSound();

        System.out.println("Test Cat");
        Cat cat = new Cat();
        cat.eat();
        cat.makeSound();
        cat.sleep();

        System.out.println("Test Bird");
        Bird bird = new Bird();
        bird.eat();
        bird.makeSound();
        bird.sleep();
    }
    // Overiding : thuc hien lai nhung hanh dong/hoat dong nhu lop cha nhung ma khong can phai code lai
    // chi  can overiding lai la OK
}
