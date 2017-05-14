package com.login.mvpdemo.model.sp;

/**
 * Created by dance on 2017/5/13.
 * sp数据访问层
 */

public class SharePrefHelper {
    private static SharePrefHelper mInstance = new SharePrefHelper();
    private SharePrefHelper(){
    }
    public static SharePrefHelper create(){
        return mInstance;
    }

}
