package main;

import java.util.LinkedList;
import java.util.Queue;

public class ViDuQueue {
    public static void main(String[] args) {
        Queue<String> danhSachSV = new LinkedList<String>();

        danhSachSV.offer("TITV 1");
        danhSachSV.offer("Nguyen Van A");
        danhSachSV.offer("Nguyen Van B");
        danhSachSV.offer("TITV 2");

        while(true){
            String ten  = danhSachSV.poll();
            //poll lay ra roi xoa luon
            //peek: lay ra khong xoa
            if(ten == null){
                break;
            }
            System.out.println(ten);
        }
    }
}
