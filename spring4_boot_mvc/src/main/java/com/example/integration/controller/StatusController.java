package com.example.integration.controller;

import com.example.integration.model.ServiceStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sungang on 2016/12/24.
 */
@RestController
public class StatusController {

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public ServiceStatus getStatus() {
        return new ServiceStatus(ServiceStatus.StatusType.OK, "1.0-SNAPSHOT");
    }

}
