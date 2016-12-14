package org.sung.spring4.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 通过Scheduled 声明该方法是一个计划任务  使用fixedRate 属性每隔固定时间执行
 * 2,使用cron 属性可按照指定时间执行 本例是每天11点28分执行
 * Created by sungang on 2016/12/12.
 */
@Service
public class SchedulerTaskService {

    private static final SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔5秒执行一次..." + f.format(new Date()));
    }

    @Scheduled(cron = "0 28 11 ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定时间：" + f.format(new Date()) + ", 执行");
    }
}
