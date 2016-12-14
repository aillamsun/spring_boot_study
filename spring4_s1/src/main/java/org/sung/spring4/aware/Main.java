package org.sung.spring4.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by sungang on 2016/12/12.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AwareConfig.class);

        AwareService awareService = ctx.getBean(AwareService.class);
        awareService.outputResult();

        ctx.close();
    }
}
