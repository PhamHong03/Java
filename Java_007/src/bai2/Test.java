package bai2;

public class Test {
    public static void main(String[] args) {
        LuxuryCar myLuxuryCar = new LuxuryCar();

        myLuxuryCar.input();
        myLuxuryCar.getinfor();
        float totalprice = myLuxuryCar.calculatePrice(20000);
        System.out.println("\nTong gia: "+totalprice);
    }
}
