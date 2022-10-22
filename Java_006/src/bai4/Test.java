package bai4;

import java.util.ArrayList;
import java.util.List;

public class Test {
    static void followStatus(List<IsStatus> statusList){
        for(IsStatus isStatus: statusList){
            isStatus.onStatus();
        }

    }
    public static void main(String[] args) {
        List<IsStatus> isStatusList = new ArrayList<>();
        System.out.println("Nhap 3 quay ban ve: ");
        for (int i = 0; i < 3; i++) {
            TicketCounter ticketCounter = new TicketCounter();
            ticketCounter.input();

            isStatusList.add(ticketCounter);
        }
        System.out.println("Nhap 2 quay ban do an");
        for (int i = 0; i < 2; i++) {
            Food food = new Food();
            food.input();

            isStatusList.add(food);
        }
        System.out.println("Nhap 2 bai gui xe");
        for (int i = 0; i < 2; i++) {
            Parking parking = new Parking();
            parking.input();

            isStatusList.add(parking);
        }
        System.out.println("Nhap 5 phong chieu phim");
        for (int i = 0; i < 5; i++) {
            Room room = new Room();
            room.input();

            isStatusList.add(room);
        }
        System.out.println("Hien thi thong tin");
        followStatus(isStatusList);
    }
}
