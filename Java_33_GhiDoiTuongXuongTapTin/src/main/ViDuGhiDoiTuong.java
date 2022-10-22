package main;

import java.io.*;

public class ViDuGhiDoiTuong {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\Data\\Java\\Java_33_GhiDoiTuongXuongTapTin\\file.data");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            SinhVien st = new SinhVien("001","Pham THi CAm Hong",2003,10.0);
            oos.writeObject(st);
            oos.flush();
            oos.close();

        } catch (Exception e) {

        }
    }
}
