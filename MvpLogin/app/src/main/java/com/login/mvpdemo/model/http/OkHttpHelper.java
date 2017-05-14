package com.login.mvpdemo.model.http;

/**
 * Created by dance on 2017/5/13.
 * 网络数据访问层
 */

public class OkHttpHelper {
    private static OkHttpHelper mInstance = new OkHttpHelper();
    private OkHttpHelper(){
    }
    public static OkHttpHelper create(){
        return mInstance;
    }

    public void execGet(String url, HttpCallback cb ){
        //使用okhttp请求网络，回调接口...
    }

    public interface HttpCallback{
        void onFaile(Exception e);
        void onSuccess(String data);
    }
}
