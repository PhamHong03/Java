package bai2;

import java.util.List;
import java.util.Scanner;

public class LuxuryCar extends Car{

    private float specialRate;

    public LuxuryCar(){

    }
    public LuxuryCar(String name, String producer, String year, int seat, float rootPrice, float specialRate) {
        super(name, producer, year, seat, rootPrice);
        this.specialRate = specialRate;
    }

    public float getSpecialRate() {
        return specialRate;
    }

    public void setSpecialRate(float specialRate) {
        this.specialRate = specialRate;
    }

    @Override
    public float calculatePrice() {
        return getRootPrice() + calculateTax()+getRootPrice()*specialRate;
    }

    public float calculatePrice(float transportCost){
        return calculatePrice()+transportCost;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap specialRate: ");
        try{
            specialRate = Float.parseFloat(sc.nextLine());
        }catch (NumberFormatException e){
            specialRate =0;
        }finally {

        }
    }
}
