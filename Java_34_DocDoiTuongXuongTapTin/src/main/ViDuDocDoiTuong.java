package main;

import java.io.*;

public class ViDuDocDoiTuong {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\Data\\Java\\Java_34_DocDoiTuongXuongTapTin\\file.data");
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            SinhVien st = (SinhVien) ois.readObject();
            System.out.println(st.getdTB());
            System.out.println(st);
            ois.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
