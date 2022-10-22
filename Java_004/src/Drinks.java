import java.util.Scanner;

public class Drinks implements IInputOutput{

    String name;
    int price;

    public Drinks(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter price: ");
        price = Integer.parseInt(sc.nextLine());

    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void display(){
        System.out.println(toString());
    }


}
