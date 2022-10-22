import java.util.Scanner;

public class NhanVienPhucVu extends CanBo{
    private String congViec;

    public NhanVienPhucVu(){

    }
    public NhanVienPhucVu(String fullName, String birthday, String gender, String address, String congViec) {
        super(fullName, birthday, gender, address);
        this.congViec = congViec;
    }



    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return super.toString()+", cong viec "+congViec;
    }
    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cong viec: ");
        congViec = sc.nextLine();
    }
}
