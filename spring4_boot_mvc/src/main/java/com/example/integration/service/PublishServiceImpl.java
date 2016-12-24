package com.example.integration.service;

import com.example.integration.model.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * Created by sungang on 2016/12/24.
 */
@Service
public class PublishServiceImpl implements PublishService {


    private static final Logger logger = LoggerFactory.getLogger(PublishServiceImpl.class);

    @Autowired
    private MessageChannel topicChannel;

    @Override
    public void send(Message message) {
        logger.info("Sending message to message channel: " + message);
        topicChannel.send(MessageBuilder.withPayload(message.toString()).build());
    }
}
