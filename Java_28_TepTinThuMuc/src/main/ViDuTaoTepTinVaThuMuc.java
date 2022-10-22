package main;

import java.io.File;
import java.io.IOException;

public class ViDuTaoTepTinVaThuMuc {
    public static void main(String[] args) {
        // Luu y:
        // Windown: \ ==> go 2 lan'\\'| vd: C:\\Thu muc 1\\Thu muc 2.txt;
        //Linux,MacOs: / ==> | Vd: /Thu muc1/thu muc 2/ten tap tin.txt;

        //Kiem tra thu muc co ton tai hay khong?
        File folder1 = new File("D:\\Data\\Java\\Java_28_TepTinThuMuc");

        System.out.println("Kiem tra folder1 co ton tai hay khong: "+folder1.exists());//Kiem tra ton tai;

        File folder2 = new File("D:\\Data\\Java\\Java_29_TepTinThuMuc");
        System.out.println("Kiem tra folder2 co ton tai hay khong: "+folder2.exists());

        //Tao thu muc
        //Phuong thuc "mkdir()": tao ra mot thu muc;
        File d1 = new File("D:\\Data\\Java\\Java_28_TepTinThuMuc\\Directory_1");
        d1.mkdir();

        // Phuong thuc "mkdis()": tao ra nhieu thu muc cung luc
        File d2 = new File("D:\\Data\\Java\\Java_28_TepTinThuMuc\\Directory_1\\Directory_2\\Directory_3");
        d2.mkdirs();

        // Tao ra mot tep tin (co phan mo rong: .exe, .txt, .doc):
        File file1 = new File("D:\\Data\\Java\\Java_28_TepTinThuMuc\\Directory_1\\ViDu1.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            // khong co quyen tao tep tin
            // O cung bi day
            //Duong dan bi sai
            throw new RuntimeException(e);
        }
    }
}
