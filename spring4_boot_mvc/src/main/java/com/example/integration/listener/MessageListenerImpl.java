package com.example.integration.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by sungang on 2016/12/24.
 */
@Service
public class MessageListenerImpl implements MessageListener {


    private static final Logger logger = LoggerFactory.getLogger(MessageListenerImpl.class);

    @Override
    public void processMessage(String message) {

        logger.info("Received message: " + message);
        System.out.println("MessageListener::::::Received message: " + message);
    }
}
