public class HoaDonCaFe {
    private String tenLoaiCafe;
    private double giaTien;
    private double khoiLuong;

    public HoaDonCaFe(String ten, double gia, double kl){
        this.tenLoaiCafe = ten;
        this.giaTien = gia;
        this.khoiLuong  = kl;
    }
    public double tinhTongTien(){
        return this.giaTien * this.khoiLuong;
    }
    public boolean kiemTraKhoiLuongLonHon(double x){
//        if(this.khoiLuong>x)return true;
//        else return false;
        return this.khoiLuong>x;
    }
    public boolean kiemTraTongTienLonHon500(){
        return this.tinhTongTien()>500;
    }
    public double giamGia(double y){
        if(this.kiemTraTongTienLonHon500()){
            return this.tinhTongTien()-this.tinhTongTien()*(y/100);
        }else return 0;
    }
}