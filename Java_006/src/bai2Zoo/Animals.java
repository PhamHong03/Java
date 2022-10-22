package bai2Zoo;

import java.util.Scanner;

public  abstract class Animals {
    private String name, description;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animals(){

    }

    public Animals(String name, String description, int age) {
        this.name = name;
        this.description = description;
        this.age = age;
    }


    public void display(){
        System.out.println(toString());
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap name: ");
        name = sc.nextLine();
        System.out.println("Nhap mo ta");
        description = sc.nextLine();
        System.out.println("Nhap tuoi");
        age = Integer.parseInt(sc.nextLine());
    }
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", age=" + age ;
    }

    public abstract void showSound();

}
