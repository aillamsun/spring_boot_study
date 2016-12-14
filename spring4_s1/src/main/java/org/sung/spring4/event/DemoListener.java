package org.sung.spring4.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by sungang on 2016/12/12.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {


    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {

        String msg = demoEvent.getMsg();
        System.out.println("我(Bean-demoListener) 接收到了 bean-demoPublisher发布的消息: " + msg);
    }
}
