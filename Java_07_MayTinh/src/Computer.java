public class Computer {
    private HangSanXuat hangSanXuat;
    private Day daySanXuat;
    private double giaBan;
    private double thoiGianBaoHanh;

    public Computer(HangSanXuat hangSanXuat, Day daySanXuat, double giaBan, double thoiGianBaoHanh) {
        this.hangSanXuat = hangSanXuat;
        this.daySanXuat = daySanXuat;
        this.giaBan = giaBan;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }


    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public Day getDaySanXuat() {
        return daySanXuat;
    }

    public void setDaySanXuat(Day daySanXuat) {
        this.daySanXuat = daySanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public double getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(double thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public boolean kiemTraGiaThapHon(Computer mtKhac){
        return this.giaBan < mtKhac.giaBan;
    }

    public String layTenQuocGia(){
        return this.hangSanXuat.layTenQuocGia();

    }
}
