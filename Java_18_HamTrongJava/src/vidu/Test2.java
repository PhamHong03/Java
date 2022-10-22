package vidu;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(123,"Nguyen Van N","DH",9);
        SinhVien sv2 = new SinhVien(456,"Nguyen Van B","DF",7);
        SinhVien sv3 = new SinhVien(789,"Nguyen Van Q","AS",5);
        SinhVien sv4 = new SinhVien(1234,"Nguyen Van Z","AS",5);

        SinhVien[] a_sv = {sv1,sv2,sv3};
        System.out.println("Mang ban dau: "+ Arrays.toString(a_sv));
        //Ham sapXep;
        Arrays.sort(a_sv);
        System.out.println("Mang sau khi sap xep: "+Arrays.toString(a_sv));

        //Tim kiem
        System.out.println("Tim kiem sv3: "+Arrays.binarySearch(a_sv,sv3));
        System.out.println("Tim kiem sv4: "+Arrays.binarySearch(a_sv,sv4));

    }
}
