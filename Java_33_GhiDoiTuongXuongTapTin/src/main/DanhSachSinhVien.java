package main;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien>danhSach;

    public DanhSachSinhVien(){
        this.danhSach = new ArrayList<SinhVien>();
    }
    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }
    //1.Them sinh vien vao danh sach
    public void themSinhVien(SinhVien sv){
        this.danhSach.add(sv);
    }

    //2.In danh sach sinh vien
    public void inDanhSach(){
        for (SinhVien sinhVien: danhSach) {
            System.out.println(sinhVien);

        }
    }
    //3.Kiem tra danh sach sinh vien co rong hay khong
    public boolean kiemTraDSRong(){
        return this.danhSach.isEmpty();
    }
    //4.Lay ra so luong sinh vien trong danh sach
    public int soLuong(){
        return this.danhSach.size();
    }
    //5.Lam rong danh sach sinh vien
    public void lamRongDanhSach(){
        this.danhSach.removeAll(danhSach);
    }
    //6.Kiem tra ton tai
    public boolean kiemTraTonTai(SinhVien sv){
        return this.danhSach.contains(sv);

    }
    //7. Xoa sinh vien ra khoi danh sach
    public boolean xoaSinhVien(SinhVien sv){
        return this.danhSach.remove(sv);
    }
    //8 Tim kiem sinh vien dua tren ma sinh vien
    public boolean timKiemSinhVien(String ten){
        for(SinhVien sinhVien : danhSach){
            if(sinhVien.getHoVaTen().indexOf(ten)>=0){
                System.out.println(sinhVien);
            }
        }
        return false;
    }
    //9 Sap Xep danh sach giam dan
    public void sapXepSinhVienGiamDan(){
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if(sv1.getdTB()>sv2.getdTB()){
                    return -1;
                }else if(sv1.getdTB()<sv2.getdTB()){
                    return 1;
                }else return 0;
            }
        });
    }
    //10. Ghi xuong file
    public void ghiDuLieuXuongFile(File file){
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oss = new ObjectOutputStream(os);

            for(SinhVien sv : danhSach){
                oss.writeObject(sv);
            }
            oss.flush();
            oss.close();
        } catch (Exception e) {

        }

    }

}
