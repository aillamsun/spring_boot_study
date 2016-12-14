package org.sung.spring4.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by sungang on 2016/12/13.
 */
@Controller //1
@RequestMapping("/anno") //2
public class DemoAnnoController {

    @RequestMapping(produces = "text/plain;charset=UTF-8")//3
    @ResponseBody
    public String index(HttpServletRequest request){
        return "url:" + request.getRequestURL() + " can access";
    }

    @RequestMapping(value = "/pathvar/{str}",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String demoPathVar(@PathVariable String str,HttpServletRequest request){

        return "";
    }
}
