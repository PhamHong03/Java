package bai1;

import java.util.Scanner;

public class Student extends Person{
    private String rollNo;
    private float mark;
    private String email;

    public String getRollNo() {
        return rollNo;
    }

    public boolean setRollNo(String rollNo) {
        if(rollNo != null && rollNo.length() == 8){
            this.rollNo = rollNo;
            return true;
        }else{
            System.err.println("Nhap lai ma sinh vien: ");
            return false;
        }
    }

    public float getMark() {
        return mark;
    }

    public boolean setMark(float mark) {
        if(mark>=0 && mark<=10){
            this.mark = mark;
            return true;
        }else{
            System.err.println("Nhap sai diem!");
            return false;
        }

    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if(email != null && email.contains("@") && !email.contains(" ")){
            this.email = email;
            return true;
        }else{
            System.err.println("Nhap email loi , nhap lai! ");
            return false;
        }
    }

    public Student(){

    }

    public Student(String rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public void showInfor() {
        super.showInfor();
        System.out.print(";rollNo" +rollNo+";Mark "+mark+";Email "+email);
        System.out.println();
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien");
        while (true) {
            String rollNoInput = sc.nextLine();
            boolean check = setRollNo(rollNoInput);
            if (check) {
                break;
            }
        }
        System.out.println("Nhap diem sinh vien:");
        while (true){
            float markinput = Float.parseFloat(sc.nextLine());
            boolean check = setMark(markinput);
            if(check){
                break;
            }
        }
        System.out.println("Nhap email sinh vien: ");
        while(true){
            String emailInput = sc.nextLine();
            boolean check = setEmail(emailInput);
            if(check){
                break;
            }
        }
    }
    public boolean checkScholarship(){
        return mark>=8.0;
    }
}
