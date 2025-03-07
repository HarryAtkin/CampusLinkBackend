package com.asiansandharry.campuslinkbackend.dbTables;

import jakarta.persistence.*;

@Entity
@Table
public class ChatRoom {
    @Id
    private long ChatRoomID;
    /* Foreign Key from Module table */
    private long ModuleID;

    public ChatRoom() {}

    public ChatRoom(long ChatRoomID, long ModuleID) {
        this.ChatRoomID = ChatRoomID;
        this.ModuleID = ModuleID;
    }

    public long getChatRoomID() {
        return ChatRoomID;
    }

    public void setChatRoomID(long chatRoomID) {
        ChatRoomID = chatRoomID;
    }

    public long getModuleID() {
        return ModuleID;
    }

    public void setModuleID(long moduleID) {
        ModuleID = moduleID;
    }

    @Override
    public String toString() {
        return "ChatRoom{" +
                "ChatRoomID=" + ChatRoomID +
                ", ModuleID='" + ModuleID + '\'' +
                '}';
    }
}
