package bai3;

import java.util.Scanner;

public class Product {
    private String maHH;
    private String tenHH;
    private int soLuong;

    private float gia;

    public Product(String maHH, String tenHH, int soLuong, float gia) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.soLuong = soLuong;
        this.gia = gia;
    }
    public Product(){

    }

    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }
    public void display(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return  "maHH='" + maHH + '\'' +
                ", tenHH='" + tenHH + '\'' +
                ", soLuong=" + soLuong +
                ", gia=" + gia +
                '}';
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma: ");
        maHH = sc.nextLine();
        System.out.println("Nhap ten: ");
        tenHH = sc.nextLine();
        System.out.println("Nhap so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gia: ");
        gia = Float.parseFloat(sc.nextLine());

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = Integer.parseInt(sc.nextLine());
        Product[] products = new Product[n];

        for(int i=0;i<n;i++){
            products[i] = new Product();
            products[i].input();
        }
        int indexMax = 0;
        for(int i=1;i<n;i++){
            if(products[i].getGia() > products[indexMax].getGia()){
                indexMax = i;
            }
        }
        products[indexMax].display();
    }
}
