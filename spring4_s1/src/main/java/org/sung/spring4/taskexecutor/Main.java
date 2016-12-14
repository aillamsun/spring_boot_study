package org.sung.spring4.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 此处为并发执行  并非顺序执行
 * Created by sungang on 2016/12/12.
 */
public class Main {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);

        AsyncTaskService asyncTaskService = ctx.getBean(AsyncTaskService.class);

        for (int i = 0 ; i < 10; i++){
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPuls(i);
        }

        ctx.close();

    }
}
