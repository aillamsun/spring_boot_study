package org.sung.spring4.di;

import org.springframework.stereotype.Service;

/**
 * Created by sungang on 2016/12/12.
 */
@Service
public class FunctionService {

    public String sayHello(String word) {
        return "Hello " + word + " !";
    }
}
