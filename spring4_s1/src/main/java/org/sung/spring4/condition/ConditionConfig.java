package org.sung.spring4.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 *
 * 1.通过@Conditional 注解 符合Windows/Linux 实例化相应的ListService
 * Created by sungang on 2016/12/12.
 */
@Configuration
@ComponentScan("org.sung.spring4.condition")
public class ConditionConfig {


    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService() {
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService() {
        return new LinuxListService();
    }
}
