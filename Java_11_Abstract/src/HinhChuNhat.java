public class HinhChuNhat extends Shape{
    private double chieuRong,chieuCao;

    public HinhChuNhat(ToaDo toaDo, double chieuRong, double chieuCao) {
        super(toaDo);
        this.chieuRong = chieuRong;
        this.chieuCao = chieuCao;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }


    @Override
    public double Area() {
        return this.chieuCao*this.chieuRong;
    }
}
