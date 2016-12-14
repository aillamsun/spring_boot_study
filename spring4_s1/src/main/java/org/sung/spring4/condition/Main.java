package org.sung.spring4.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by sungang on 2016/12/12.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = ctx.getBean(ListService.class);

        System.out.println(ctx.getEnvironment().getProperty("os.name") + ",系统下的列表命令为：" + listService.showListCmd());
    }
}
