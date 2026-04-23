package com.pratyay.controller;



import com.pratyay.model.Chat;
import com.pratyay.model.Message;
import com.pratyay.model.User;
import com.pratyay.request.CreateMessageRequest;
import com.pratyay.service.MessageService;
import com.pratyay.service.ProjectService;
import com.pratyay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {


    @Autowired
    private MessageService messageService;

    @Autowired
    private UserService userService;

    @Autowired
    private ProjectService projectService;

    @PostMapping("/send")
    public ResponseEntity<Message> sendMessage(
            @RequestBody CreateMessageRequest request
    ) throws Exception {

        User user = userService.findUserById(request.getSenderId());

        Chat chats = projectService.getProjectById(request.getProjectId()).getChat();

        if (chats == null) {
            throw new Exception("Chats not found");
        }

        Message sentMessage = messageService.sendMessage(
                request.getSenderId(),
                request.getProjectId(),
                request.getContent()
        );

        return ResponseEntity.ok(sentMessage);
    }





    @GetMapping("/chat/{projectId}")
    public ResponseEntity<List<Message>> getMessagesByChatId(
            @PathVariable Long projectId
    ) throws Exception {

        List<Message> messages = messageService.getMessageByProjectId(projectId);
        return ResponseEntity.ok(messages);
    }

    @DeleteMapping("/{messageId}")
    public ResponseEntity<Void> deleteMessage(
            @PathVariable Long messageId,
            @RequestHeader("Authorization") String jwt
    ) throws Exception {
        messageService.deleteMessage(messageId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }




}
