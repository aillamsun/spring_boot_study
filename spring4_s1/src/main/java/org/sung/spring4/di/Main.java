package org.sung.spring4.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by sungang on 2016/12/12.
 */
public class Main {

    public static void main(String[] args) {
        //AnnotationConfigApplicationContext 接受一个配置类作为参数
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = ctx.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("DI"));

        ctx.close();
    }
}
