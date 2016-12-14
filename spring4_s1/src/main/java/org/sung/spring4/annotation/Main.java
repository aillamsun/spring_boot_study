package org.sung.spring4.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by sungang on 2016/12/12.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService = ctx.getBean(DemoService.class);

        demoService.outputResult();

        ctx.close();
    }
}
