public class Test {
    public static void main(String[] args) {
        HoaDonCaFe hd = new HoaDonCaFe("Trung Nguyen",290,2.8);
        System.out.println("Tinh tong tien = "+hd.tinhTongTien());
        System.out.println("Kiem tra lon hon khoi luong: "+hd.kiemTraKhoiLuongLonHon(1.5));
        System.out.println("Kiem tra tong tien lon hon 500 "+hd.kiemTraTongTienLonHon500());
        System.out.println("Giam  Gia "+hd.giamGia(30));
    }
}
