package main;

import java.util.*;

public class RutThamTrungThuong_HashSet {
    Set<String> thungPhieuTrungThuong = new HashSet<String>();

    public RutThamTrungThuong_HashSet() {
    }

    public boolean themPhieuDuTHuong(String giaTri){
        return this.thungPhieuTrungThuong.add(giaTri);
    }

    public boolean xoaMaSoDuTHuong(String giaTri){
        return this.thungPhieuTrungThuong.remove(giaTri);
    }

    public boolean kiemTraTonTai(String giaTri){
        return this.thungPhieuTrungThuong.contains(giaTri);
    }
    public void xoaALLPhieuDuThuong(){
        this.thungPhieuTrungThuong.clear();
    }

    public int laySoLuong(){
        return this.thungPhieuTrungThuong.size();
    }

    public String rutMotPhieu(){
        String kq = "";
        Random rd = new Random();
        int viTri = rd.nextInt(this.thungPhieuTrungThuong.size()-1);
        kq = (String) this.thungPhieuTrungThuong.toArray()[viTri];
        return kq;
    }
    public void inTatCa(){
        System.out.println(Arrays.toString(this.thungPhieuTrungThuong.toArray()));
    }


    public static void main(String[] args) {

        int luaChon =0;
        Scanner sc = new Scanner(System.in);
        RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();
        do{
            System.out.println("-------------------------------");
            System.out.println("-------------MENU--------------");
            System.out.println("1. Them ma so du thuong");
            System.out.println("2. Xoa ma so du thuong");
            System.out.println("3. Kiem tra phieu co ton tai hay khong");
            System.out.println("4. Xoa tat ca cac phieu du thuong");
            System.out.println("5. So luong phieu du thuong");
            System.out.println("6. Rut tham trung thuong");
            System.out.println("7. In tat ca phieu du thuong");
            System.out.println("0. Thoat khoi truong trinh");

            luaChon = sc.nextInt();
            sc.nextLine();
            if(luaChon ==1 || luaChon ==2 || luaChon ==3 ){
                System.out.println("Nhap vao ma phieu du thuong:");
                String giaTri = sc.nextLine();
                if(luaChon ==1){
                    rt.themPhieuDuTHuong(giaTri);
                }else if(luaChon == 2){
                    rt.xoaMaSoDuTHuong(giaTri);
                }else {
                    System.out.println("Kiem tra ton tai: "+rt.kiemTraTonTai(giaTri));
                }

            }else if(luaChon ==4){
                rt.xoaALLPhieuDuThuong();
            }else if(luaChon ==5){
                System.out.println("So luong phieu la: "+rt.laySoLuong());
            }else if(luaChon ==6){
                System.out.println("Ma so trung thuong la: "+rt.rutMotPhieu());
            }else if(luaChon == 7){
                System.out.println("Cac ma phieu du thuong la: ");
                rt.inTatCa();
            }

        }while(luaChon != 0);
    }
}
