package main;

import java.util.*;

public class TuDien {
    private Map<String,String> data = new TreeMap<String ,String>();// sap xep trat tu tu mang thu tu
//    private Map<String,String> data = new HashMap<String,String>();// khong co sap xep mang tinh lon xon ghia luon a


    public String themTu(String tuKhoa,String yNghia){
        return this.data.put(tuKhoa,yNghia);
    }

    public String xoaTu(String tuKhoa){
        return this.data.remove(tuKhoa);
    }

    public String traTu(String tuKhoa){
        String yNghia = this.data.get(tuKhoa);
        return yNghia;
    }
    public void inDS(){
        Set<String> tapHopTuKhoa = this.data.keySet();
        System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
    }
    public int laySoLuong(){
        return this.data.size();
    }
    public void xoaALl(){
        this.data.clear();
    }

    public static void main(String[] args) {
        TuDien tuDien = new TuDien();
        int luaChon =0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("---------------------------------------");
            System.out.println("----------------MENU-------------------");
            System.out.println("Tra tu dien Anh - Viet: \n"
                + " 1. Them tu (tu khoa , y nghia)\n"
                + " 2. Xoa tu\n"
                + " 3. Tim y nghia tu khoa\n"
                + " 4. In danh sach tu khoa\n"
                + " 5. lay so luong tu\n"
                + " 6. Xoa tat ca cac tu\n"
                + " 0. Thoat khoi truong trinh\n"
                + "");
             luaChon = sc.nextInt();
             sc.nextLine();
            if(luaChon == 1){
                System.out.println("Nhap vao tu khoa: ");
                String tuKhoa = sc.nextLine();
                System.out.println("Nhap vao y nghia: ");
                String yNghia = sc.nextLine();
                tuDien.themTu(tuKhoa,yNghia);

            }else if(luaChon ==2 || luaChon ==3){
                System.out.println("Nhap vao tu khoa: ");
                String tuKhoa = sc.nextLine();
                if(luaChon ==2){
                    tuDien.xoaTu(tuKhoa);
                }else {
                    System.out.println("Y nghia la: "+tuDien.traTu(tuKhoa));
                }
            }else if(luaChon == 4){
                tuDien.inDS();
            }else if(luaChon == 5){
                System.out.println("So luong tu khoa la: "+tuDien.laySoLuong());
            }else if(luaChon == 6){
                tuDien.xoaALl();
            }
        }while(luaChon != 0);
    }
}
