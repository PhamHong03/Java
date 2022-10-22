package test;

import main.DanhSachSinhVien;
import main.SinhVien;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();

        int luaChon = 0;
        do{
            System.out.println("MENU -----------");
            System.out.println("Lua chon chuc nang");

            System.out.println(
                    "1. Thêm sinh vien vao danh sach.\n"
                    +"2. In danh sach sinh vien ra man hinh\n"
                    +"3. Kiem tra danh sach co rong hay khong\n"
                    +"4. Lay ra so luong sinh vien trong danh sach\n"
                    +"5. Lam rong danh sach sinh vien\n"
                    +"6. Kiem tra sinh vien co ton tai trong danh sach hay khong, dua tren ma sinh vien\n"
                    +"7. Xoa mot sinh vien khoi danh sach sinh vien dua tren ma sinh vien\n"
                    +"8. Tim kiem tat ca sinh vien dua tren ten da nhap tu ban phim\n"
                    +"9. Xuat ra man hinh sinh vien co diem tu cao toi thap\n"
                    +"10. Luu danh sach sinh vien xuong tap tin\n"
                     +"11. Doc danh sach sinh vien tu tap tin\n"
                    +"0 Thoat khoi chuong trinh");
                   luaChon = sc.nextInt();
                   sc.nextLine();
                   if(luaChon == 1){
                       System.out.println("Nhap maSinhVien: ");String maSinhVien  = sc.nextLine();
                       System.out.println("Nhap hoVaTen: ");String hoVaTen  = sc.nextLine();
                       System.out.println("Nhap namSinh: ");int namSinh  = sc.nextInt();
                       System.out.println("Nhap diemTB: ");float  diemTB  = sc.nextFloat();
                       SinhVien sv = new SinhVien(maSinhVien,hoVaTen,namSinh,diemTB);
                       dssv.themSinhVien(sv);
                   }else if(luaChon == 2){
                       dssv.inDanhSach();
                   }else if(luaChon == 3){
                       System.out.println("Kiem tra danh sach rong: "+dssv.kiemTraDSRong());
                   }else if(luaChon == 4){
                        System.out.println("So luong sinh vien: "+dssv.soLuong());
                   }else if(luaChon == 5){
                       dssv.lamRongDanhSach();
                   }else if(luaChon == 6){
                       System.out.println("Nhap maSinhVien: ");String maSinhVien  = sc.nextLine();
                       SinhVien sv = new SinhVien(maSinhVien);
                       System.out.println("Kiem tra Sinh vien co trong danh sach: "+dssv.kiemTraTonTai(sv));
                   }else if(luaChon == 7){
                       System.out.println("Nhap maSinhVien: ");String maSinhVien  = sc.nextLine();
                       SinhVien sv = new SinhVien(maSinhVien);
                       System.out.println("Xoa Sinh vien ra khoi danh sach: "+dssv.xoaSinhVien(sv));

                   }else if(luaChon == 8){
                       System.out.println("Nhap hoVaTen: ");String hoVaTen  = sc.nextLine();
                       System.out.println("Ket qua tim kiem: ");
                       dssv.timKiemSinhVien(hoVaTen);
                   }else if(luaChon == 9){
                        dssv.sapXepSinhVienGiamDan();
                        dssv.inDanhSach();
                   }else if(luaChon == 10){
                       System.out.println("Nhap ten file: ");
                       String tenFile = sc.nextLine();
                       File f = new File(tenFile);
                       dssv.ghiDuLieuXuongFile(f);
                   }else if(luaChon == 11){
                       System.out.println("Nhap ten file: ");
                       String tenFile = sc.nextLine();
                       File f = new File(tenFile);
                       dssv.docDuLieuTuFile(f);
                   }

        }while(luaChon != 0);
    }
}
