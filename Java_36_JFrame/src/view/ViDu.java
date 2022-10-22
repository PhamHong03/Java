package view;

import javax.swing.*;

public class ViDu {
    public static void main(String[] args) {
        JFrame jf = new JFrame();

        jf.setTitle("Vi Du JFrame");// gan ten
        jf.setSize(600,400);// gan kich thuoc

//        while (true){
//            System.out.println("Chuong trinh dang chay");
//        }
        jf.setLocation(300,300);// gan vi tri hien thi
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Thaot ra khoi chuong trinh khi dong cua so


        jf.setVisible(true);// cho phep hien thi ( luon de cuoi cung)

    }
}
