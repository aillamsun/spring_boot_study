package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by sungang on 2016/12/15.
 */
@Controller
@RequestMapping("websocket")
public class WebScoketController {

    /**
     * @return
     * @throws InterruptedException
     */
    @RequestMapping(value = "")
    public String websocketHtml() throws InterruptedException {
        return "webscoket/index";
    }


    /**
     * @return
     * @throws InterruptedException
     */
    @RequestMapping(value = "/message", produces = "text/event-stream")
    @ResponseBody
    public String message() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(new Date().toLocaleString());
        return "data: " + new Date().toLocaleString() + "\n\n";
    }
}
