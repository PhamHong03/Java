import java.util.Scanner;

public class CanBo {
    private String fullName;
    private String birthday;
    private String gender;
    private String address;

    public CanBo(){

    }

    public CanBo(String fullName, String birthday, String gender, String address) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.gender = gender;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "fullName='" + fullName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public void display(){
        System.out.println(this);
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        fullName = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        birthday = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gender = sc.nextLine();
        System.out.println("Nhap dia chi:  ");
        address = sc.nextLine();
    }
}
