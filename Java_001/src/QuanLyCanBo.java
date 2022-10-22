import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyCanBo {
    public static List<CanBo> canBoList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void showMenu(){
        System.out.println("1. Nhap thong tin moi cho can bo. ");
        System.out.println("2. Tim kiem ho ten. ");
        System.out.println("3. Hien thi thong tin. ");
        System.out.println("4. Thoat. ");
        System.out.println("Choose:   ");
    }

    public static void main(String[] args) {
        int choose;
        do{
            showMenu();
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    inputData();
                    break;
                case 2:
                    searchByName();
                    break;
                case 3:
                    showDaTa();
                    break;
                case 4:
                    System.out.println("Thoat!!!");
                    break;
                default:
                    System.out.println("Nhap sai! ");
                    break;
            }
        }while(choose!= 4);
    }

    private static void showDaTa() {
        for(CanBo canBo : canBoList){
            canBo.display();
        }

    }

    private static void searchByName() {
        System.out.println("Nhap vao ten can bo can tim kiem!");
        String fullname = sc.nextLine();
        for(CanBo canBo : canBoList){
            if(canBo.getFullName().equalsIgnoreCase(fullname)){
                canBo.display();
            }
        }
    }

    private static void inputData() {
        System.out.println("Nhap so cann bo can them");
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            CanBo canBo = creatCanBo();
            canBoList.add(canBo);
        }

    }
    public static CanBo creatCanBo(){
        CanBo canbo = null;
        System.out.println("1. Nhap thong tin cong nhan. ");
        System.out.println("2. Nhap thong tin ky su. ");
        System.out.println("3. Nhap thong tin nhan vien phuc vu. ");
        System.out.println("Choose:   ");
        int choose = Integer.parseInt(sc.nextLine());

        switch (choose){
            case 1:
                canbo = new CongNhan();
                break;
            case 2:
                canbo = new KySu();
                break;
            case 3:
                canbo = new NhanVienPhucVu();
                break;
        }
        canbo.input();
        return canbo;
    }

}
