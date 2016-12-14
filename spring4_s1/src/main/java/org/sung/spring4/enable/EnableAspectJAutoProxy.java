package org.sung.spring4.enable;

import java.lang.annotation.*;

/**
 * 动态注册Bean
 * Created by sungang on 2016/12/12.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnableAspectJAutoProxy {

    boolean proxyTargetClass() default false;
}
