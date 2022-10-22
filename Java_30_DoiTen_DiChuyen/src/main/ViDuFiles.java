package main;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ViDuFiles {
    public static void copyAll(File f1, File f2){
        try {
            //copy ban than no
            Files.copy(f1.toPath(),f2.toPath(),StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(f1.isDirectory()){
            //Cop cac tap tin va thu muc con
            File[] mangCon = f1.listFiles();
            for(File file : mangCon){
                File file_new = new File(f2.getAbsolutePath()+"/"+file.getName());
                copyAll(file, file_new);
            }
        }
    }
    public static void main(String[] args) {
        File f0 = new File("D:\\Data\\Java\\Java_30_DoiTen_DiChuyen\\File_1.txt");
        File f1 = new File("D:\\Data\\Java\\Java_30_DoiTen_DiChuyen\\File_2.txt");
        File f2 =new File("D:\\Data\\Java\\Java_30_DoiTen_DiChuyen\\File_2xyz.txt");

        //1. Thay doi ten File


        //Su dung File de doi ten
//        f0.renameTo(f1);

        // Su dung Files de doi ten
//        try {
//            Files.move(f1.toPath(),f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
//
//        }catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //2. Di chuyen File
//        File f_2new = new File("D:\\Data\\Java\\Java_30_DoiTen_DiChuyen\\F0\\File_2xyz.txt");
//        try{
//            Files.move(f2.toPath(),f_2new.toPath(),StandardCopyOption.REPLACE_EXISTING);
//        //move: di chuyen duoc noi dung ben trong
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //3. Copy File
        File f_0 = new File("D:\\Data\\Java\\Java_30_DoiTen_DiChuyen\\F0");
        File f_0_copy = new File("D:\\Data\\Java\\Java_30_DoiTen_DiChuyen\\F0_copy");
//        try{
//            Files.copy(f_0.toPath(),f_0_copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
//            //Copy: khong copy duoc noi dung ben trong
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        ViDuFiles.copyAll(f_0,f_0_copy);// copy toan bo du lieu ben trong
    }

}
