package com.example.integration.service;

import com.example.integration.model.Message;

/**
 * Created by sungang on 2016/12/24.
 */
public interface PublishService {
    void send(Message message);
}
