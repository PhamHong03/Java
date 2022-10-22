package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class ViDuXoaFile {
    public static void xoaFile(File fx){
        if(fx.isFile()){
            // xoa neu la tep tin
            System.out.println("Da xoa: "+fx.getAbsolutePath());
            fx.delete();
        }else if(fx.isDirectory()){
            //lay cac file con
            File[] mangCon = fx.listFiles();
            for(File f : mangCon){
                //xoa cac file con
                xoaFile(f);
            }
            //xoa ban than thu muc sau khi da xoa cac file con
            System.out.println("Da xoa: "+fx.getAbsolutePath());
            fx.delete();
        }
    }

    public static void main(String[] args) {
        // Su dung class File xoa tap tin hoac thu muc
        File f0 = new File("D:\\Data\\Java\\Java_29_XoaTepTinThuMuc\\F0");
        File f0_1 = new File("D:\\Data\\Java\\Java_29_XoaTepTinThuMuc\\F0_1");
        File f_vidu = new File("D:\\Data\\Java\\Java_29_XoaTepTinThuMuc\\Vidu.txt");


        // deleteOnExit: chi xoa nhung thu muc rong
//        f0.deleteOnExit();//khong xoa duoc vi co chua thu muc tep tin con
//        f0_1.deleteOnExit();//xoa duoc vi la thu muc rong
//
//        f_vidu.deleteOnExit();//xoa duoc vi la thu muc rong
//        //Neu file bi open boi moht chuong trinh khac thi khong xoa duoc
//        System.out.println(f0_1.delete());//vi da xoa roi(false)
//
//        ViDuXoaFile.xoaFile(f0);

        // Su dung class Files xoa tap tin va thu muc
        Path p0 = f0.toPath();
        Path p0_1 = f0_1.toPath();
        Path p_vidu = f_vidu.toPath();


        try {
           //Files.deleteIfExists(p0);// vi thu muc co noi dung ben trong
            Files.deleteIfExists(p0_1);
            Files.deleteIfExists(p_vidu);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
