package main;

public class TestBox_2 {
    public static void main(String[] args) {
        Box_2 b1 = new Box_2<Integer>(15);
        System.out.println("Gia tri: "+b1.getValue());

        Box_2 b2 = new Box_2<String>("Hello TITV");
        System.out.println("Gia Tri: "+b2.getValue());

        Box_2 b3 = new Box_2<Double>(15.5);
        System.out.println("Giatri: "+b3.getValue());



    }
}
