package bai1;

import javax.crypto.Cipher;
import java.util.Scanner;

public class Program {
    public static void showMEnu(){
        System.out.println("1. Chuyen trang thai");
        System.out.println("2. Chuyen trang thai theo kenh");
        System.out.println("3. Bat TV");
        System.out.println("4. Tat TV");
        System.out.println("5. Next chanel");
        System.out.println("6. Previous chanel");
        System.out.println("7. Xem thong tin");
        System.out.println("8. Thoat");
        System.out.println("Choose: ");

    }
    public static void main(String[] args) {
        CTivi cTivi = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lua chon cach khoi tao TIVI");
        System.out.println("1.  Mac dinh");
        System.out.println("2.  Lua chon kenh");
        System.out.println("Choose: ");
        int choose= Integer.parseInt(sc.nextLine());

        if(choose == 1){
            CTivi cTivi1 = new CTivi();
        }else{
            System.out.println("Nhap so kenh");
            int n = Integer.parseInt(sc.nextLine());
            String[] chanelList = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Nhap ken thu "+(i+1));
                chanelList[i] = sc.nextLine();
            }
            cTivi = new CTivi(chanelList);
        }
        do {
            showMEnu();

            switch (choose){
                case 1:
                    cTivi.Switch();
                    break;
                case 2:
                    System.out.println("Nhap kenh can chuyen: ");
                    String setChanel = sc.nextLine();
                    cTivi.Switch(setChanel);
                    break;
                case 3:
                    cTivi.On();
                    break;
                case 4:
                    cTivi.Off();
                    break;
                case 5:
                    cTivi.nextChanel();
                    break;
                case 6:
                    cTivi.previous();
                    break;
                case 7:
                    cTivi.show();
                    break;
                case 8:
                    System.out.println("Thoat");
                    break;
                default:
                    System.out.println("Input fails");
                    break;
            }
        }while(choose!= 8);
    }
}
