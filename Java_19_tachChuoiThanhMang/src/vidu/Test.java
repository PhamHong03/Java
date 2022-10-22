package vidu;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s = "Xin chao cac ban, tui la Hong nha";
        String[] a = s.split(" ");//tach chuoi
        System.out.println(Arrays.toString(a));

        String[] b = s.split(",");
        System.out.println(Arrays.toString(b));

        String s2 = "Xin chao, minh la Hong ne,minh la mot lap trinh vien. Minh con la mot dev ";
        String[] c = s2.split("\\.|\\,");//lay cham va phay de ngan cach
        System.out.println(Arrays.toString(c));

        String s3 = "Nguyen Van A";
        String[] d = s3.split(" ");
        System.out.println(Arrays.toString(d));
        System.out.println("Ten: "+d[d.length-1]);
    }
}
