package com.example.datasource;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by sungang on 2016/12/15.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({DataSourceConfiguration.class})
public @interface EnableMyDynamicJdbc {
}
