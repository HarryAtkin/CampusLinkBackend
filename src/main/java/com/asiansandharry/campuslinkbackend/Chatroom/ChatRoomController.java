package com.asiansandharry.campuslinkbackend.Chatroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping(path = "api/v1/chatRoom")
@CrossOrigin(origins = "http://localhost:5500/")
public class ChatRoomController {
    private final ChatroomService chatroomService;

    @Autowired
    public ChatRoomController(ChatroomService chatroomService) {
        this.chatroomService = chatroomService;
    }


    @GetMapping
    public Optional<List<String>> GetChatroom(){
        return chatroomService.getChatRoom();
    }

    @PostMapping
    public void Authenticate(@RequestBody String data){
        chatroomService.Authenticate(data);
    }

    @GetMapping(path = "/Room")
    public Optional<List<String>> GetChatroomChats(){
        return chatroomService.getComments();
    }

    @PostMapping(path = "/Room")
    public void ChatRoomOption(@RequestBody String data){
        chatroomService.ChatRoomOption(data);
    }
}
