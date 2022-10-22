package vidu;

public class Test {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(100,"Pham Thi Cam Hong","DI",9);
        SinhVien sv2 = new SinhVien(150,"Nguyen Hong Trung","PM",9);
        SinhVien sv3 = new SinhVien(150,"Nguyen Pham Huynh Nhu","DM",9);


        System.out.println(sv1.compareTo(sv2));

        System.out.println(sv1.compareTo(sv3));

    }
}
