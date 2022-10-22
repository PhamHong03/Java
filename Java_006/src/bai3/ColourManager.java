package bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class ColourManager {
    ArrayList<String> colorList = new ArrayList<>();
    public ColourManager(){

    }
    public void input(){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Nhap ma mau can them");
            String color = sc.nextLine();
            colorList.add(color);

            System.out.println("Tiep hay dung lai!");
            String option = sc.nextLine();
            if(option.equalsIgnoreCase("n")){
                break;
            }
        }
    }
    public void display(){
        System.out.println("Danh sach ma mau: ");
        for (int i = 0; i <colorList.size() ; i++) {
            System.out.println(" "+colorList.get(i));
        }
        System.out.println("");
    }
    public int checkColor(String color){
//        return colorList.contains(color);
        for (int i = 0; i < colorList.size(); i++) {
            if(colorList.get(i).equalsIgnoreCase(color)){
                return i;
            }
        }
        return -1;
    }
}
