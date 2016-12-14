package org.sung.spring4.enable;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 直接导入配置类
 * Created by sungang on 2016/12/12.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(SchedulingConfiguration.class)
public @interface EnableScheduling {
}
