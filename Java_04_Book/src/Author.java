public class Author {
    private String tenTacGia;
    private Day ngaySinh;

    public Author(String tenTacGia, Day ngaySinh) {
        this.tenTacGia = tenTacGia;
        this.ngaySinh = ngaySinh;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public Day getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Day ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}
