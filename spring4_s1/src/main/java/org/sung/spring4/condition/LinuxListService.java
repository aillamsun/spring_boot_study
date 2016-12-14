package org.sung.spring4.condition;

/**
 * Created by sungang on 2016/12/12.
 */
public class LinuxListService implements ListService {

    @Override
    public String showListCmd() {
        return "ls";
    }
}
