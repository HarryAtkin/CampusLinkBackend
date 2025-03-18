package com.asiansandharry.campuslinkbackend.Chatroom;

import com.asiansandharry.campuslinkbackend.dbTables.Account;
import com.asiansandharry.campuslinkbackend.dbTables.ChatRoom;
import com.asiansandharry.campuslinkbackend.dbTables.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;
import java.util.Optional;

public interface ChatRoomComment extends JpaRepository<Comment, Long> {


    //SELECT comment, commentDate FROM Comment INNER JOIN Chat_Room ON chat_room_chat_RoomID = chat_room.Chat_RoomID;
    //@Query("SELECT Comment.comment, Comment.commentDate FROM Comment INNER JOIN ChatRoom ON Comment.ChatRoom = ChatRoom")
    @Query("SELECT c.comment, c.Account.fName, c.Account.lName FROM Comment c INNER JOIN c.ChatRoom cr INNER JOIN cr.Module Module WHERE Module.ModuleName = :option")
    List<String> getComments(String option);

    //@Query("SELECT Account.AccountID FROM Account WHERE Account.Email = :email")
    //Account getAccount(String email);

    @Query("SELECT m.ModuleName FROM ModuleAccount ma JOIN ma.Module m WHERE ma.Account.Email = :email")
    Optional<List<String>> getModuleNames(String email);

    @Query("SELECT cr FROM ChatRoom cr WHERE cr.Module.ModuleName = :name")
    ChatRoom getChatRoomByName(String name);

    //WHERE c.ChatRoom.Module.ModuleName = :moduleName
    @Query("SELECT c.CommentID FROM Comment c ORDER BY c.CommentID DESC")
    List<Long> getLastId(String moduleName );

    @Query("SELECT a FROM Account a WHERE a.Email = :email")
    Account getIdbyEmail(String email);

}
