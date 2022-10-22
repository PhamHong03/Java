package bai2;

import java.util.Scanner;

public class StudentMark {
    private String rollNo;
    private String fullName;
    private String classname;
    private String subject;
    private float mark;


    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public StudentMark(){

    }

    public StudentMark(String rollNo, String fullName, String classname, String subject, float mark) {
        this.rollNo = rollNo;
        this.fullName = fullName;
        this.classname = classname;
        this.subject = subject;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "rollNo='" + rollNo + '\'' +
                ", fullName='" + fullName + '\'' +
                ", classname='" + classname + '\'' +
                ", subject='" + subject + '\'' +
                ", mark=" + mark +
                '}';
    }
    public void display(){
        System.out.println(toString());
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap rollNo: ");
        rollNo = sc.nextLine();
        System.out.println("Nhap ten: ");
        fullName = sc.nextLine();
        System.out.println("Nhap lop: ");
        classname = sc.nextLine();
        System.out.println("Nhap mon hoc:  ");
        subject = sc.nextLine();
        System.out.println("Nhap diem: ");
        mark = sc.nextFloat();
    }


    public static void main(String[] args) {
        StudentMark st1 = new StudentMark();
        st1.input();
        StudentMark st2 = new StudentMark("001","Hong","system information","java",9);

        st1.display();
        st2.display();
        System.out.println("Thong tin sinh vien co diem cao nhat");
        if(st1.getMark() > st2.getMark()){
            st1.display();
        }else if(st1.getMark() < st2.getMark()){
            st2.display();
        }else{
            System.out.println("2 sinh vien bang nhau");
        }
    }
}
