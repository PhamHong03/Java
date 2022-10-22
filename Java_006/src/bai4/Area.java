package bai4;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Area implements IsStatus{
    static enum STATUS{
        EMPTY, LESS,NORMAL, FULL;
    }

    private String currentTime;
    STATUS status;

    private String name;

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public void autoCurrentTime(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("H:m:s dd:mm:yyyy");

        Date time = new Date();
        currentTime = simpleDateFormat.format(time);

    }
    public Area(){
        currentTime = "";
        status = STATUS.EMPTY;
    }
    public Area(String name){
        this.name = name;
        currentTime = "";
        status = STATUS.EMPTY;
    }

    public Area(String currentTime, STATUS status, String name) {
        this.currentTime = currentTime;
        this.status = status;
        this.name = name;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("0. Empty");
        System.out.println("1. Less");
        System.out.println("2. Normal");
        System.out.println("3. Full");
        System.out.println("Choose:  ");

        int option = sc.nextInt();
        switch (option){
            case 0:
                setStatus(STATUS.EMPTY);
                break;
            case 1:
                setStatus(STATUS.LESS);
                break;
            case 2:
                setStatus(STATUS.NORMAL);
                break;
            case 3:
                setStatus(STATUS.FULL);
                break;
        }
    }
    @Override
    public void onStatus() {
        switch (status){
            case EMPTY:
                System.out.println(name+ " dang trong");
                break;
            case LESS:
                System.out.println(name +" it khach");
                break;
            case NORMAL:
                System.out.println(name+" co khach vua du phuc vu");
                break;
            case FULL:
                System.out.println(name+" dong khach");
                break;
        }
    }
}
