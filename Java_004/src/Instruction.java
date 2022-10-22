import java.util.Scanner;

public class Instruction implements IInputOutput{

    enum STATUS{
        NEW, OLD
    };

    enum TYPE{
        BYE, BORROW
    };


    String name;
    float weight, width, height, length;
    STATUS status;
    TYPE type;

    public Instruction(String name, float weight, float width, float height, float length, STATUS status, TYPE type) {
        this.name = name;
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.length = length;
        this.status = status;
        this.type = type;
    }

    public Instruction(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name =sc.nextLine();
        System.out.println("Enter weight: ");
        weight = Float.parseFloat(sc.nextLine());
        System.out.println("Enter width: ");
        width = Float.parseFloat(sc.nextLine());
        System.out.println("Enter height: ");
        height = Float.parseFloat(sc.nextLine());
        System.out.println("Enter length: ");
        length = Float.parseFloat(sc.nextLine());

        System.out.println("1. Status >> NEW");
        System.out.println("2. Status >> OLD");
        System.out.println("Enter your choose: ");
        int choose = Integer.parseInt(sc.nextLine());
        if(choose == 1){
            status = STATUS.NEW;
        }else{
            status = STATUS.OLD;
        }

        System.out.println("1. Type >> BUY");
        System.out.println("2. Type >> BORROW");
        System.out.println("Enter your chose: ");
        int chose = Integer.parseInt(sc.nextLine());
        if(chose == 1){
            type = TYPE.BYE;
        }else{
            type = TYPE.BORROW;
        }
    }
    @Override
    public void display() {
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", weight=" + weight +
                ", width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", status=" + getStatusString() +
                ", type=" + getTypeString() +
                '}';
    }
    public String getStatusString(){
        if(status == STATUS.NEW){
            return "new";
        }else{
            return "old";
        }
    }

    public String getTypeString(){
        if(type == TYPE.BYE){
            return "buy";
        }else{
            return "borrow";
        }
    }
}
