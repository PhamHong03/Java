package lesson1;
import java.util.Date;
import java.util.Scanner;

import static lesson1.Ticket.autoGenerateCode;

public class MonthTicket {
    private String customerName,address,avatar;
    private Date expireDate;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public MonthTicket(){

    }

    public MonthTicket(String customerName, String address, String avatar, Date expireDate) {
        this.customerName = customerName;
        this.address = address;
        this.avatar = avatar;
        this.expireDate = expireDate;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        autoGenerateCode();

        System.out.println("Enter customer name: ");
        customerName = sc.nextLine();
        System.out.println("Enter address: ");
        address = sc.nextLine();
        System.out.println("Enter avatar: ");
        avatar = sc.nextLine();
        System.out.println("Enter price: ");


    }
}
