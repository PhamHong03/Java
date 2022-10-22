import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        try {
            PrintWriter pw = new PrintWriter("D:\\Data\\Java\\Java_31_GhiDuLieuDangText\\file.txt", "UTF-8");
            pw.println("Xin chao minh la Hong.com ne");
            pw.println("Hay song nhu nhung doa hoa, vi em la bong hoa dep nhat");
            Studnet st = new Studnet(100,"Nguyen Hong Trung");
            pw.println(st);
            pw.flush();//Day du lieu xuong file
            pw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
