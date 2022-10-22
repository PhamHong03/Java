import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void showMenu(){
        System.out.println("1. Nhap thong tin sach!");
        System.out.println("2. Hien thi tat ca sach ra man hinh");
        System.out.println("3. Nhap thong tin tac gia");
        System.out.println("4. Tim kiem sach theo but danh");
        System.out.println("5. Thoat!");
    }
    public static void main(String[] args) {

        ArrayList<Author> authorlist = new ArrayList<>();
        ArrayList<But> butList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int choose ;
        int n;
        do{
            showMenu();
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Nhap so sach can them!");
                    n = Integer.parseInt(sc.nextLine());
                    for(int i=0;i<n;i++){
                        But but = new But();
                        but.input();
                        boolean isFind = false;
                        for(int j=0;j<authorlist.size();j++){
                            if(authorlist.get(i).getNickname().equalsIgnoreCase(but.getNickName())){
                                isFind = true;
                                break;
                            }
                        }
                        if(!isFind){
                            Author author = new Author(but.getNickName());
                            author.input();
                            authorlist.add(author);
                        }
                        butList.add(but);
                    }
                    break;
                case 2:
                    for(But but: butList){
                        but.display();
                    }
                    break;
                case 3:
                    // nhap thong tin tac gia

                    System.out.println("Nhap so tac gia can them!");
                    n = Integer.parseInt(sc.nextLine());
                    for(int i=0;i<n;i++){
                        Author author = new Author();
                        author.input(authorlist);
                        authorlist.add(author);
                    }

                    break;
                case 4:
                    System.out.println("Nhap ten but danh can tim kiem");
                    String nickName = sc.nextLine();
                    for(int i=0;i<butList.size();i++){
                        if(butList.get(i).getNickName().equalsIgnoreCase(nickName)){
                            butList.get(i).display();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Nhap sai! ");
                    break;
            }
        }while(choose !=5);

    }
}
