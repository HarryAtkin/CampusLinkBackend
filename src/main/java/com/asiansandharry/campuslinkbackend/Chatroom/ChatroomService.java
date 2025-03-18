package com.asiansandharry.campuslinkbackend.Chatroom;

import com.asiansandharry.campuslinkbackend.dbTables.Account;
import com.asiansandharry.campuslinkbackend.dbTables.Comment;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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

    public List<String> getComments(){

        return chatRoomComment.getComments(this.Option);

    }

    public void ChatRoomOption(String data){
        this.Option = data;
    }

    @Transactional
    public void send(String data) {
        //long CommentID, ChatRoom ChatRoom, Account Account, String comment, Date commentDate
        Long id;
        try{
            id = chatRoomComment.getLastId(this.Option).getFirst() + 1;
        }
        catch(Exception e){
            id = 1l;
        }

        Account a = chatRoomComment.getIdbyEmail(this.UID);
        Comment comment = new Comment(id, chatRoomComment.getChatRoomByName(this.Option), a, data, new Date());
        chatRoomComment.save(comment);

    }

    public String getUser() {

        Account a = chatRoomComment.getIdbyEmail(this.UID);

        return a.getfName() + " " + a.getlName();
    }

}
