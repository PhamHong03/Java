package main;

import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>{
    private String maSinhVien;
    private String hoVaTen;
    private int namSinh;
    private double dTB;

    public SinhVien(String maSinhVien, String hoVaTen, int namSinh, double dTB) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.dTB = dTB;
    }
    public SinhVien(String maSinhVien){
        this.maSinhVien = maSinhVien;
    }
    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getdTB() {
        return dTB;
    }

    public void setdTB(double dTB) {
        this.dTB = dTB;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", namSinh=" + namSinh +
                ", dTB=" + dTB +
                '}';
    }


    @Override
    public int compareTo(SinhVien o) {
        return this.maSinhVien.compareTo(o.maSinhVien);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinhVien sinhVien = (SinhVien) o;
        return Objects.equals(maSinhVien, sinhVien.maSinhVien);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maSinhVien, hoVaTen, namSinh, dTB);
    }
}
