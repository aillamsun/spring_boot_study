package org.sung.spring4.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sungang on 2016/12/12.
 */
@Controller
public class HelloController {

    @RequestMapping("index")
    public String index() {
        return "index";
    }
}
