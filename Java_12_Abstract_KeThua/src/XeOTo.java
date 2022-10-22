public class XeOTo extends PhuongTienDiChuyen{
    private String loaiNhienLieu;

    public XeOTo( HangSanXuat hangSanXuat,String loaiNhienLieu) {
        super("Xe O To",hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }


    @Override
    public double layVanToc() {
        return 60;
    }
}
