package org.sung.spring4.test;

/**
 * Created by sungang on 2016/12/12.
 */
public class TestBean {

    private String content;

    public TestBean(String content){
        this.content  = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
