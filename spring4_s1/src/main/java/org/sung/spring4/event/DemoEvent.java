package org.sung.spring4.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by sungang on 2016/12/12.
 */
public class DemoEvent extends ApplicationEvent {

    private String msg;

    public DemoEvent(Object source,String msg){
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
