package bai2Zoo;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Room> roomArrayList;

    public ArrayList<Room> getRoomArrayList() {
        return roomArrayList;
    }

    public void setRoomArrayList(ArrayList<Room> roomArrayList) {
        this.roomArrayList = roomArrayList;
    }

    public Zoo(){
        roomArrayList = new ArrayList<>();
    }

    public void addRoom(Room room){
        roomArrayList.add(room);

    }

    public void removeRoom(int codeRoom){
        for(Room room: roomArrayList){
            if(room.getRoomCode() == codeRoom){
                roomArrayList.remove(room);
                break;
            }
        }
    }

    public void display(){
        for(Room room: roomArrayList){
            room.display();
        }
    }
}
