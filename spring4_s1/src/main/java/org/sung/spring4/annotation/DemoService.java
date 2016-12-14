package org.sung.spring4.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by sungang on 2016/12/12.
 */
@Service
public class DemoService {

    public void outputResult(){
        System.out.println("从组合注解配置照样获得bean");
    }
}
