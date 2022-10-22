package bai1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Employee {
    private String fullName;
    private String gender;
    private String address;
    private String position;
    private double salary;


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(){

    }

    public Employee(String fullName, String gender, String address, String position, double salary) {
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
        this.position = position;
        this.salary = salary;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        fullName = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gender = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        address = sc.nextLine();
        System.out.println("Nhap chuc vu: ");
        position = sc.nextLine();
        System.out.println("Nhap luong: ");
        salary = Float.parseFloat(sc.nextLine());
    }
    public void display(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return  "fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }



}
