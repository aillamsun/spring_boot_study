package org.sung.spring4.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sungang on 2016/12/12.
 */
@Service
public class UseFunctionService {

    @Autowired
    private FunctionService functionService;


    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
