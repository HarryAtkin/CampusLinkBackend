package com.asiansandharry.campuslinkbackend.Chatroom;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

/*
public interface ChatRoom extends JpaRepository<ChatRoom, Long> {

    //@Query("SELECT c.comment, c.commentDate FROM Comment c INNER JOIN c.ChatRoom cr WHERE cr.ModuleID = 0")
    /*
    @Query("SELECT Module.ModuleName FROM Module Module INNER JOIN Module.ModuleId ModuleAccount WHERE ModuleAccount.AccountID = 0")
    Optional<List<String>> getChatroomName();

     */
//}
