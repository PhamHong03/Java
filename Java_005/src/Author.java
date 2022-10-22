import java.util.ArrayList;
import java.util.Scanner;

public class Author {
    private String name;
    private int old;
    private String nickname;
    private String birthday;
    private String address;

    public String getName() {
        return name;
    }

    public int getOld() {
        return old;
    }

    public String getNickname() {
        return nickname;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public Author(){

    }

    public Author(String nickname) {
        this.nickname = nickname;
    }

    public Author(String name, int old, String nickname, String birthday, String address) {
        this.name = name;
        this.old = old;
        this.nickname = nickname;
        this.birthday = birthday;
        this.address = address;
    }
    public void input(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Nhap ten tac gia: ");
        name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        old = Integer.parseInt(sc.nextLine());

        System.out.println("Nhap ngay sinh: ");
        birthday = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        address = sc.nextLine();
    }
    public void input(ArrayList<Author> authorsList) {
        input();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap nickname: ");
        while (true) {
            nickname = sc.nextLine();
            boolean isFind = false;
            for (int i = 0; i < authorsList.size(); i++) {
                if (authorsList.get(i).getNickname().equalsIgnoreCase(nickname)) {
                    isFind = true;
                }
            }
            if (!isFind) {
                break;
            } else {
                System.err.println("Nhap but danh khac! ");
            }
        }


    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", old=" + old +
                ", nickname='" + nickname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public void display(){
        System.out.println(toString());
    }
}
