package org.sung.spring4.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * 组合@Configuration 和 @ComponentScan元注解  覆盖value参数
 * Created by sungang on 2016/12/12.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@ComponentScan
public @interface SungConfiguration {

    String[] value() default {};
}
