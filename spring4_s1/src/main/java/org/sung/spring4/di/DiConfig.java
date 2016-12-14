package org.sung.spring4.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sungang on 2016/12/12.
 */
//生命一个java 配置类
@Configuration
//自动扫面指定包 下面的@Service @Compoment @Repositoy 和 @Controller
@ComponentScan("org.sung.spring4.di")
public class DiConfig {


    @Bean
    public FunctionService functionService() {
        FunctionService functionService = new FunctionService();
        return functionService;
    }

    @Bean
    public UseFunctionService2 useFunctionService2() {
        UseFunctionService2 useFunctionService2 = new UseFunctionService2();
        return useFunctionService2;
    }
}
