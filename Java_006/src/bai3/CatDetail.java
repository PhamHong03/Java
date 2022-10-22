package bai3;

import java.util.Scanner;

public class CatDetail implements Cat{
    private String loai;
    private String mau;
    private String noiSong;

    private int idColor;

    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getNoiSong() {
        return noiSong;
    }

    public void setNoiSong(String noiSong) {
        this.noiSong = noiSong;
    }

    public CatDetail(){

    }

    public CatDetail(String loai, String mau, String noiSong) {
        this.loai = loai;
        this.mau = mau;
        this.noiSong = noiSong;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap loai: ");
        loai = sc.nextLine();

        System.out.println("Nhap noi song: ");
        noiSong = sc.nextLine();

    }

    public void nhap(ColourManager colourManager){
        nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mau: ");
        while (true){
            mau = sc.nextLine();
            idColor = colourManager.checkColor(mau);
            if(idColor != -1){
                break;
            }else{
                colourManager.display();
                System.err.println("Nhap lai ma mau: ");
            }
        }

    }
    @Override
    public String toString() {
        return "Ten: "+ten+"loai='" + loai + '\'' +
                ", mau='" + mau + '\'' +
                ", noiSong='" + noiSong + '\'';
    }

    @Override
    public void hienthi() {
        System.out.println(toString());
    }
}
