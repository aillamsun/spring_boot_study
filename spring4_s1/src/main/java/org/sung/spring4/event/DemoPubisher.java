package org.sung.spring4.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by sungang on 2016/12/12.
 */
@Component
public class DemoPubisher {

    @Autowired
    ApplicationContext context ;

    public void pubisher(String msg){
        context.publishEvent(new DemoEvent(this,msg));
    }
}
