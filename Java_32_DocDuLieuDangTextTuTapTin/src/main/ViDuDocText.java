package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ViDuDocText {
    public static void main(String[] args) {
        /* Cach 1
         File f = new File("D:\\Data\\Java\\Java_32_DocDuLieuDangTextTuTapTin\\file.txt");


        try {
            BufferedReader brd = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
            String line = null;
            while(true){
                line = brd.readLine();
                if(line == null)break;
                else{
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        */

        /* Cach 2*/
        File f2 = new File("D:\\Data\\Java\\Java_32_DocDuLieuDangTextTuTapTin\\file.txx");
        try {
            List<String> allText = Files.readAllLines(f2.toPath(),StandardCharsets.UTF_8);
            for(String line: allText){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
