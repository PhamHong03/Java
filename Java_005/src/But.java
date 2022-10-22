import java.util.Scanner;

public class But {
    private String bookName;
    private String createdAt;
    private String nickName;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public But(){

    }


    public But(String bookName, String createdAt, String nickName) {
        this.bookName = bookName;
        this.createdAt = createdAt;
        this.nickName = nickName;
    }


    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sach: ");
        bookName = sc.nextLine();
        System.out.println("Ngay xuat ban: ");
        createdAt = sc.nextLine();
        System.out.println("Nhap nickname: ");
        nickName = sc.nextLine();
    }

    @Override
    public String toString() {
        return "bookName='" + bookName + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public void display(){
        System.out.println(toString());
    }
}
