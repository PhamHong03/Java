package bai4;

import java.util.Scanner;

public class Room extends Area {
    int total;
    int num;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Room() {
        super("Phong xem phim");
    }

    public Room(int total, int num) {
        this.total = total;
        this.num = num;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tong so ghe: ");
        total = sc.nextInt();
        System.out.println("Nhap so ghe da ngoi");
        num = sc.nextInt();

        setupStatus();
    }

    public void setupStatus() {
        if (num == 0) {
            status = STATUS.EMPTY;
        } else {
            int percent = (num * 100) / total;
            if (percent >= 70) {
                status = STATUS.FULL;
            } else if (percent >= 25) {
                status = STATUS.NORMAL;
            } else {
                status = STATUS.LESS;
            }
//  float percent = ((float)num)/total);

        }
        autoCurrentTime();
    }
}