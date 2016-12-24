package com.example.integration.controller;

import com.example.integration.model.Message;
import com.example.integration.service.PublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by sungang on 2016/12/24.
 */
@RestController
public class MessageController {

    @Autowired
    private PublishService publishService;

    @RequestMapping(value = "/message", method = RequestMethod.POST)
    public void postMessage(Message message, HttpServletResponse response) {
        // Publish the message
        publishService.send(message);
        // Set the status to 201 because we created a new message
        response.setStatus(HttpStatus.CREATED.value());
    }

}
