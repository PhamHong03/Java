import java.util.Scanner;

public class CongNhan extends CanBo{

    public static final int BAC_MAX  = 7;
    private int bac;

    public CongNhan() {

    }
    public CongNhan(String fullName, String birthday, String gender, String address, int bac) {
        super(fullName, birthday, gender, address);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return super.toString() + "bac " + bac;
    }
    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap bac nhan vien: ");
        bac = Integer.parseInt(sc.nextLine());
    }
}
