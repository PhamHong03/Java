import java.util.Scanner;

public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu(){

    }
    public KySu(String fullName, String birthday, String gender, String address, String nganhDaoTao) {
        super(fullName, birthday, gender, address);
        this.nganhDaoTao = nganhDaoTao;
    }


    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return super.toString() + ", nganh: "+ nganhDaoTao;
    }
    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nganh dao tao: ");
        nganhDaoTao = sc.nextLine();
    }
}
