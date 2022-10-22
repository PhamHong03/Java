package bai3;

import java.util.Scanner;

public class UsingManegerCat {
    public static void showMenu(){
//        System.out.println("0. Nhap danh sach ma mau:" );
        System.out.println("1. Nhap thong  tin n con meo");
        System.out.println("2. Hien thi");
        System.out.println("3. Sap xep theo mau");
        System.out.println("4. Tim kiem thong tin theo loai");
        System.out.println("5. Sap xep theo  bang mau");
        System.out.println("6. Thoat");
        System.out.println("Choose: ");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerCat managerCat = new ManagerCat();
        ColourManager colourManager = new ColourManager();
        int choose;
        do{
            showMenu();
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 0:
                    colourManager.input();
                    break;
                case 1:
                    managerCat.input(colourManager);
                    break;
                case 2:
                    managerCat.display();
                    break;
                case 3:
                    managerCat.sort();
                    break;
                case 4:
                    managerCat.find();
                    break;
                case 5:
                    managerCat.sortByColor();
                    break;
                case 6:
                    System.out.println("Thoat nhe!");
                    break;
                default:
                    System.err.println("Nhap sai, nhap lai!");
                    break;

            }
        }while(choose != 6);
    }
}
