package com.login.mvpdemo.model.db;

/**
 * Created by dance on 2017/5/13.
 * 数据库访问层
 */

public class DBHelper {
    private static DBHelper mInstance = new DBHelper();
    private DBHelper(){
    }
    public static DBHelper create(){
        return mInstance;
    }

}
