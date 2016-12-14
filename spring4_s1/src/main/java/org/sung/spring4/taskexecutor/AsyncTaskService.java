package org.sung.spring4.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 通过@Async 表明该方法是个 异步方法，如果注解在类级别 则表明该类所有方法都是异步
 * Created by sungang on 2016/12/12.
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(Integer i){


        System.out.println("执行异步任务..." + i);


    }

    @Async
    public void  executeAsyncTaskPuls(Integer i){
        System.out.println("执行异步任务+1..." + i);
    }
}
