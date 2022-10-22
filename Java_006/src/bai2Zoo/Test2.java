package bai2Zoo;

import java.util.Scanner;

public class Test2 {
    public static void showMenu(){
        System.out.println("1. Them chuong");
        System.out.println("2. Xoa chuong");
        System.out.println("3. Them con vat");
        System.out.println("4. Xoa con vat");
        System.out.println("5. Xem tat ca cac con vat");
        System.out.println("6. Thoat");
        System.out.println("Your choose: ");

    }
    public static void remove(Zoo zoo){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is animals's name you wnat to remove");
        String roomName = sc.nextLine();

        for(Room room: zoo.getRoomArrayList()){
            room.removeAnimal(roomName);
        }
    }
    public  static void addAnimals(Zoo zoo){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of animals");
        int n = Integer.parseInt(sc.nextLine());
        int choose;
        for(int i=0;i<n;i++){
            System.out.println("1. Create Tiger");
            System.out.println("2. Create Dog");
            System.out.println("3. Creat Cat");
            choose  = Integer.parseInt(sc.nextLine());
            Animals animals;
            switch (choose){
                case 1:
                    animals = new Tiger();
                    break;
                case 2:
                    animals = new Dog();
                    break;
                default:
                    animals = new Cat();
                    break;
            }
            animals.input();
            System.out.println("========  Room List ========== ");
            Room room = null;
            for(int j=0;j<zoo.getRoomArrayList().size();i++){
                room = zoo.getRoomArrayList().get(j);
                System.out.format("\n%d  - %s",room.getRoomCode(),room.getRoomnName());
            }
            System.out.println("Choose room Code");
            int roomCode = Integer.parseInt(sc.nextLine());
            for(int j=0;j<zoo.getRoomArrayList().size();j++){
                room = zoo.getRoomArrayList().get(j);
                if(room.getRoomCode() == roomCode){
                    break;
                }else{
                    room = null;
                }
            }
            if(room != null){
                room.addAnimals(animals);
            }
        }
    }
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Scanner sc = new Scanner(System.in);
        int choose;
        do{
            showMenu();
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Enter n room");
                    int n = Integer.parseInt(sc.nextLine());
                    for(int i=0;i<n;i++){
                        Room room = new Room();
                        room.input();

                        zoo.addRoom(room);
                    }
                    break;
                case 2:
                    System.out.println("Enter room's name is delete");
                    int roomCode = Integer.parseInt(sc.nextLine());
                    zoo.removeRoom(roomCode);
                    break;
                case 3:
                    addAnimals(zoo);
                    break;
                case 4:
                    remove(zoo);
                    break;
                case 5:
                    zoo.display();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.err.println("Input failed!");
                    break;
            }

        }while(choose != 6);
    }
}
