package main;

import java.io.File;
import java.util.Scanner;

public class ViDuFile {
    File file;

    public ViDuFile(String tenFile) {
        this.file = new File(tenFile);
    }
    public boolean kiemTraThucThi(){
        return this.file.canExecute();
    }
    public boolean kiemTraDocFile(){
        return this.file.canRead();
    }
    public boolean kiemTraGhiFile(){
        return this.file.canWrite();
    }
    public void inDuongDan(){
        System.out.println(this.file.getAbsolutePath());
    }
    public void inTenFile(){
        System.out.println(this.file.getName());
    }
    public void kiemTraLaThuMucCuaTepTin(){
        if(this.file.isDirectory()){
            System.out.println("Day la thu muc.");

        }else if(this.file.isFile()){
            System.out.println("Day la file.");
        }
    }
    public void inDSFileCon(){
        if(this.file.isDirectory()){
            System.out.println("Cac tep tin con la: ");
            File[] mangCon = this.file.listFiles();
            for(File file: mangCon){
                System.out.println(file.getAbsolutePath());
            }

        }else if(this.file.isFile()){
            System.out.println("Khong co du lieu ben trong!");
        }
    }
    public void inCayThuMuc(){
        this.inChiTiet(this.file,1);
    }
    public void inChiTiet(File f, int bac){
        for(int i=0;i<bac;i++){
            System.out.print("\t");

            }
        System.out.print("|__");
        System.out.println(f.getName());

        if(f.canRead() && f.isDirectory()){
            File[] mangCon = f.listFiles();
            for(File fx : mangCon){
                inChiTiet(fx,bac+1);
            }
        }
    }
    public static void main(String[] args) {
        int luaChon =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten file: ");
        String tenFile = sc.nextLine();

        ViDuFile pdf = new ViDuFile(tenFile);

        do{
            System.out.println("------MENU------");
            System.out.println("1. Kiem tra file co the thuc thi: ");
            System.out.println("2. Kiem tra file co the doc: ");
            System.out.println("3. Kiem tra file co the ghi: ");
            System.out.println("4. In ra duong dan: ");
            System.out.println("5. In ten file: ");
            System.out.println("6. Kiem tra file co la thu muc hay tep tin: ");
            System.out.println("7. In ra danh sach cac file con: ");
            System.out.println("8. In ra cay thu muc: ");
            System.out.println("0. Thoat khoi truong trinh");
            luaChon = sc.nextInt();
            switch (luaChon){
                case 1:
                    System.out.println("Kiem tra thuc thi: "+pdf.kiemTraThucThi());
                    break;
                case 2:
                    System.out.println("Kiem tra doc: "+pdf.kiemTraDocFile());
                    break;
                case 3:
                    System.out.println("Kiem tra ghi: "+pdf.kiemTraGhiFile());
                    break;

                case 4:
                    pdf.inDuongDan();
                    break;
                case 5:
                    pdf.inTenFile();
                    break;
                case 6:
                    pdf.kiemTraLaThuMucCuaTepTin();
                    break;
                case 7:
                    pdf.inDSFileCon();
                    break;
                case 8:
                    pdf.inCayThuMuc();
                    break;
            }
            sc.nextLine();

        }while(luaChon !=0);
    }
}
