package org.sung.spring4.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by sungang on 2016/12/12.
 */
@Configuration
@ComponentScan("org.sung.spring4.taskscheduler")
//配置 @EnableScheduling 开启对计划任务支持
@EnableScheduling
public class TaskSchedulerConfig {


}
