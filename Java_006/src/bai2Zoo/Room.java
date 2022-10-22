package bai2Zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Room {
    private int roomCode;
    private String roomnName;
    ArrayList<Animals> animalsArrayList;

    public String getRoomnName() {
        return roomnName;
    }

    public void setRoomnName(String roomnName) {
        this.roomnName = roomnName;
    }

    public int getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(int roomCode) {
        this.roomCode = roomCode;
    }

    public ArrayList<Animals> getAnimalsArrayList() {
        return animalsArrayList;
    }

    public void setAnimalsArrayList(ArrayList<Animals> animalsArrayList) {
        this.animalsArrayList = animalsArrayList;
    }

    public Room(){
        animalsArrayList = new ArrayList<>();
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap roomCode: ");
        roomCode = Integer.parseInt(sc.nextLine());

        System.out.println("Nhap roomName: ");
        roomnName = sc.nextLine();
    }
    public void addAnimals(Animals animals){
        animalsArrayList.add(animals);
    }

    public void removeAnimal(String name){
        ArrayList<Animals> animals2 = new ArrayList<>();
        for(Animals animals: animalsArrayList){
            if(animals.getName().equalsIgnoreCase(name)){
                animals2.add(animals);
            }
        }
    }
    public void display(){
        for(Animals animals: animalsArrayList){
            animals.display();
            animals.showSound();
        }
    }
}
