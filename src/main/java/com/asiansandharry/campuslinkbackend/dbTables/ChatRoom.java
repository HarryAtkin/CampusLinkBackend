package com.asiansandharry.campuslinkbackend.dbTables;

import jakarta.persistence.*;

@Entity
@Table
public class ChatRoom {
    @Id
    private long ChatRoomID;
    /* Foreign Key from Module table */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(columnDefinition = "ModuleID")
    private Module Module;

    public ChatRoom() {}

    public ChatRoom(long ChatRoomID, Module Module) {
        this.ChatRoomID = ChatRoomID;
        this.Module = Module;
    }

    public long getChatRoomID() {
        return ChatRoomID;
    }

    public void setChatRoomID(long chatRoomID) {
        ChatRoomID = chatRoomID;
    }

    public Module getModule() {return Module;}

    public void setModuleID(Module module) {
        Module = module;
    }

    @Override
    public String toString() {
        return "ChatRoom{" +
                "ChatRoomID=" + ChatRoomID +
                ", Module='" + Module + '\'' +
                '}';
    }
}
