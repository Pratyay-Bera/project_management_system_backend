package com.pratyay.service;

import com.pratyay.model.Message;

import java.util.List;

public interface MessageService {

    Message sendMessage(Long senderId, Long chatId, String content) throws Exception;

    List<Message> getMessageByProjectId(Long projectId) throws Exception;

    void deleteMessage(Long messageId) throws Exception;
}
