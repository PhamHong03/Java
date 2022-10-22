package bai1;

import java.util.Scanner;

public class Person {
    private String fullName;
    private String gender;
    private String birthday;
    private String address;

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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person(){

    }

    public Person(String fullName, String gender, String birthday, String address) {
        this.fullName = fullName;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten: ");
        fullName = sc.nextLine();
        System.out.println("Nhap vao gioi tinh: ");
        gender = sc.nextLine();
        System.out.println("Nhap vao ngay sinh: ");
        birthday = sc.nextLine();
        System.out.println("Nhap vao dia chi: ");
        address = sc.nextLine();
    }

    @Override
    public String toString() {
        return "fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'';
    }

    public void showInfor(){
        System.out.println(toString());
    }
}
