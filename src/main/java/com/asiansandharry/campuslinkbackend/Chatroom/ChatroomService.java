package com.asiansandharry.campuslinkbackend.Chatroom;

import com.asiansandharry.campuslinkbackend.dbTables.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChatroomService {

    private final ChatRoomComment chatRoomComment;
    private String UID;
    private String Option;

    @Autowired
    public ChatroomService(ChatRoomComment chatRoomComment) {
        this.chatRoomComment = chatRoomComment;
    }

    public void Authenticate(String data){
        this.UID = data;
    }

    public Optional<List<String>> getChatRoom(){
        return chatRoomComment.getModuleNames(UID);
    }

    public Optional<List<String>> getComments(){

        return chatRoomComment.getComments(this.Option);
    }

    public void ChatRoomOption(String data){
        this.Option = data;
        System.out.println(data);
    }
}
