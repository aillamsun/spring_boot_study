package com.example.integration.service;

import org.springframework.stereotype.Service;

/**
 * Created by sungang on 2016/12/24.
 */
@Service
public class RetrievePayloadServiceImpl implements RetrievePayloadService {

    @Override
    public String getPayload(String id) {
        return "Payload for " + id;
    }
}
