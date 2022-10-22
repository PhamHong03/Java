package main;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> stackChuoi = new Stack<String>();
//
//        stackChuoi.push("gia tri nao do");// dua gia tri vao stack
//        stackChuoi.pop();// lay gia tri ra
//        stackChuoi.peek();// lay gia tri ra nhung khong xoa khoi stacck
//        stackChuoi.clear();// xoa tat ca phan tu trong stack
//        stackChuoi.contains("gia tri");// xac dinh gia tri co ton tai trong stack hay khong
//        //VD dao nguoc chuoi
//        stackChuoi.zise(); : Do lon cua stack
        System.out.println("nhap vao chuoi");
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            stackChuoi.push(s.charAt(i)+"");

        }

        System.out.println("Chuoi dao nguoc la:");
        for(int i=0;i<s.length();i++){
            System.out.print(stackChuoi.pop());
        }

        // Chuyen tu he thap phan sang he nhi phan
        System.out.println("Nhap so nguyen duong tu ban phim");
        Stack<String> stackSoDu = new Stack<String>();
        int x = sc.nextInt();
        while(x>0){
            int r = x%2;
            stackSoDu.push(r+"");
            x = x/2;

        }
        int n = stackSoDu.size();
        for(int i=0;i<n;i++){
            System.out.print(stackSoDu.pop());
        }
    }

}
