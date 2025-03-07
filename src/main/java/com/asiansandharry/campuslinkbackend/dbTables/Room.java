package com.asiansandharry.campuslinkbackend.dbTables;

import jakarta.persistence.*;

@Entity
@Table
public class Room {
    @Id
    private String RoomNo;
    private int Capacity;

    public Room() {}

    public Room(String RoomNo, int Capacity) {
        this.RoomNo = RoomNo;
        this.Capacity = Capacity;
    }

    public String getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(String roomNo) {
        RoomNo = roomNo;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    @Override
    public String toString() {
        return "Room{" +
                "RoomNo=" + RoomNo +
                ", Capacity='" + Capacity + '\'' +
                '}';
    }
}
