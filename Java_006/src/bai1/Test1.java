package bai1;

import java.util.*;

public class Test1 {
    public static void showMenu(){
        System.out.println("1. Nhap vao n sinh vien!");
        System.out.println("2. Hien thi tat ca sinh vien!");
        System.out.println("3. Hien thi max va min theo diem trung binh!");
        System.out.println("4. Tim kiem theo ma sinh vien");
        System.out.println("5. Sort A->Z theo ten sinh vien va hien thi");
        System.out.println("6. Hien thi sinh vien duoc hoc bong va sort mark giam dan");
        System.out.println("7. Thoat!");
        System.out.println(" Choose: ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentArrayList = new ArrayList<>();
        int choose;
        do{
            showMenu();
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Nhap so sin vien can them");
                    int n = Integer.parseInt(sc.nextLine());
                    for(int i=0;i<n;i++){
                        Student std = new Student();
                        std.input();
                        studentArrayList.add(std);
                    }
                    break;
                case 2:
                    for(int i=0;i<studentArrayList.size();i++){
                        studentArrayList.get(i).showInfor();
                    }
                    break;
                case 3:
                    int minindex =0;
                    int maxindex =0;
                    float minMarks ,maxMarks;
                    minMarks = studentArrayList.get(0).getMark();
                    maxMarks = studentArrayList.get(0).getMark();

                    for(int i=1;i<studentArrayList.size();i++){
                        if(studentArrayList.get(i).getMark() < minMarks){
                            minindex = i;
                            minMarks = studentArrayList.get(i).getMark();
                        }
                        if(studentArrayList.get(i).getMark() > maxMarks){
                            maxindex = i;
                            maxMarks = studentArrayList.get(i).getMark();
                        }
                    }
                    System.out.println("Sinh vien co diem trung binh cao nhat");
                    studentArrayList.get(maxindex).showInfor();

                    System.out.println("Sinh vien co diem trung binh thap nhat ");
                    studentArrayList.get(minindex).showInfor();

                    break;
                case 4:
                    System.out.println("Nhap rollNo can tim kiem");
                    String rollNoSearch = sc.nextLine();
                    int cnt =0;
                    for(Student student: studentArrayList){
                        if(student.getRollNo().equalsIgnoreCase(rollNoSearch)){
                            student.showInfor();
                            cnt++;
                        }
                    }
                    if(cnt ==0){
                        System.out.println("Khong tim thay sinh vien nao het!");
                    }
                    break;
                case 5:
                    Collections.sort(studentArrayList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            int cmp = o1.getFullName().compareTo(o2.getFullName());
                            if(cmp >=0){
                                return  1;
                            }
                            return -1;
                        }
                    });
                    for(int i=0;i<studentArrayList.size();i++){
                        studentArrayList.get(i).showInfor();
                    }

                    break;
                case 6:
                    Collections.sort(studentArrayList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return o1.getMark() >= o2.getMark()?-1:1;
                        }
                    });
                    for(int i=0;i<studentArrayList.size();i++){
                        if(studentArrayList.get(i).checkScholarship()){
                            studentArrayList.get(i).showInfor();
                        }
                    }


                    break;
                case 7:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.err.println("Nhap sai");
                    break;
            }
        }while (choose != 7);
    }
}
