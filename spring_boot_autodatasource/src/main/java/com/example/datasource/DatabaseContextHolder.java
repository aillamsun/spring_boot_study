package com.example.datasource;

/**
 * Created by sungang on 2016/12/15.
 */
public class DatabaseContextHolder {

    public enum Database {
        datasource1, datasource2
    }

    private static final ThreadLocal<Database> contextHolder = new ThreadLocal<>();

    public static void setDatabaseType(Database type) {
        contextHolder.set(type);
    }

    public static Database getDatabaseType() {
        return contextHolder.get();
    }
}
