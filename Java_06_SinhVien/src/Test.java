public class Test {
    public static void main(String[] args) {
        Day day1 = new Day(12,3,2003);
        Day day2 = new Day(3,3,2033);
        Day day3 = new Day(12,3,2003);

        Lop lop1  = new Lop("He Thong Thong Tin","Khoa CNTT_TT");
        Lop lop2  = new Lop("Ngon Ngu Anh","Khoa Ngon Ngu");
        Lop lop3  = new Lop("Kinh Te Chinh Tri","Khoa Luat");

        SinhVien sv1 = new SinhVien("001","Pham Hong",day1,9.0,lop1);
        SinhVien sv2 = new SinhVien("002","Hong Trung",day2,8.4,lop2);
        SinhVien sv3 = new SinhVien("003","Nguyen Pham",day3,3.8,lop3);


        System.out.println("SV 1: "+sv1.layTenKhoa());
        System.out.println("SV 2: "+sv2.layTenKhoa());
        System.out.println("SV 3: "+sv3.layTenKhoa());

        System.out.println("Kiem Tra Thi Dat");
        System.out.println("SV1: "+sv1.kiemTraThiDat());
        System.out.println("SV2: "+sv2.kiemTraThiDat());
        System.out.println("SV3: "+sv3.kiemTraThiDat());

        System.out.println("So Sanh ngay Sinh");
        System.out.println("Sv1 va Sv3: "+sv1.kiemTraCungNgaySinh(sv3));
        System.out.println("Sv2 va Sv3: "+sv2.kiemTraCungNgaySinh(sv3));
    }
}
