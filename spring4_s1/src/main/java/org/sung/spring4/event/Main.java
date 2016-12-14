package org.sung.spring4.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.sung.spring4.di.DiConfig;

/**
 * Created by sungang on 2016/12/12.
 */
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DemoConfig.class);

        DemoPubisher pubisher = ctx.getBean(DemoPubisher.class);
        pubisher.pubisher("hello application event");
        ctx.close();

    }
}
