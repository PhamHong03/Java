public class Film {
    private String tenPhim;
    private int namSanXuat;
    private HangSanXuat hangSanXuat;
    private double giaVe;
    private Day ngayChieu;

    public Film(String tenPhim, int namSanXuat, HangSanXuat hangSanXuat, double giaVe, Day ngayChieu) {
        this.tenPhim = tenPhim;
        this.namSanXuat = namSanXuat;
        this.hangSanXuat = hangSanXuat;
        this.giaVe = giaVe;
        this.ngayChieu = ngayChieu;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public Day getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(Day ngayChieu) {
        this.ngayChieu = ngayChieu;
    }
    public boolean kiemTraGiaVeReHon(Film phimKhac){
        return this.giaVe < phimKhac.giaVe;
    }
    public String layTenHangSanXuat(){
        return this.hangSanXuat.getTenHangSanXuat();
    }
    public double giaSauKhiKhuyenMai(double x){
        return this.giaVe - this.giaVe*(x/100);
    }
}
