import java.util.Scanner;

public class Ticket implements IInputOutput{

    String customerName, byteDate, expireDate;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getByteDate() {
        return byteDate;
    }

    public void setByteDate(String byteDate) {
        this.byteDate = byteDate;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public Ticket(){

    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer name: ");
        customerName = sc.nextLine();
        System.out.println("Enter buy date: ");
        byteDate = sc.nextLine();
        System.out.println("Enter expire date: ");
        expireDate = sc.nextLine();

    }

    @Override
    public String toString() {
        return "customerName='" + customerName + '\'' + ", byteDate='" + byteDate + '\'' +
                ", expireDate='" + expireDate + '\'' +
                '}';
    }

    @Override
    public void display() {
        System.out.println(toString());
    }
}
