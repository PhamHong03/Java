package main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class VIDuDeque {
    public static void main(String[] args) {

        Deque<String> danhSachSV = new ArrayDeque<String>();

        danhSachSV.offer("TITE 1");
        danhSachSV.offer("Nguyen Hong Trung");
        danhSachSV.offer("Pham Thi Cam Hong");
        danhSachSV.offer("TITV 2");
        danhSachSV.offerFirst("Nguyen Van A");
        danhSachSV.offerLast("Nguyen Pham Quynh Nhu");

        while(true){
            String ten = danhSachSV.poll();
            if(ten == null){
                break;
            }
            System.out.println(ten);
        }
    }
}
