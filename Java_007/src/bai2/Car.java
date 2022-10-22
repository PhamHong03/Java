package bai2;

import java.util.Scanner;

public class Car implements ICar {

    private String name;
    private String producer;
    private String year;
    private int seat;
    private float rootPrice;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public float getRootPrice() {
        return rootPrice;
    }

    public void setRootPrice(float rootPrice) {
        this.rootPrice = rootPrice;
    }

    public Car(){

    }

    public Car(String name, String producer, String year, int seat, float rootPrice) {
        this.name = name;
        this.producer = producer;
        this.year = year;
        this.seat = seat;
        this.rootPrice = rootPrice;
    }

    @Override
    public float calculateTax() {
        if(seat<7){
            return (float) (rootPrice*0.6);
        }
        return (float) (rootPrice*0.7);
    }

    @Override
    public float calculatePrice() {
        return rootPrice + calculateTax();
    }

    @Override
    public void getinfor() {
        System.out.printf("%s car produced by %s in %s has %d seats with the total price is %f$"
                ,name,producer,year,seat, calculatePrice());
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap name: ");
        name = sc.nextLine();
        System.out.println("Nhap producer: ");
        producer = sc.nextLine();
        System.out.println("Nhap nam: ");
        year = sc.nextLine();
        System.out.println("Nhap so ghe: ");
        try{
            seat = Integer.parseInt(sc.nextLine());
        }catch (Exception e){
            seat =0;
        }finally {

        }
        System.out.println("Nhap gia: ");
        try{
            rootPrice =Float.parseFloat(sc.nextLine());
        }catch (NumberFormatException e){
            rootPrice = 0;
        }finally {

        }
    }
}
