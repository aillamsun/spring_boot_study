package org.sung.spring4.di;

/**
 * Created by sungang on 2016/12/12.
 */
public class UseFunctionService2 {

    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }


    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
