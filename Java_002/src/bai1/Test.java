package bai1;

public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.input();

        Employee employee2 = new Employee("A","nam","HA noi","CEO",1);
        employee1.display();
        employee2.display();
    }
}
