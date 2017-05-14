package com.login.mvpdemo.model;


import com.login.mvpdemo.model.http.OkHttpHelper;

/**
 * Created by dance on 2017/5/13.
 */

public interface ILoginModel {
    void execLoginRequest(String url, String usernaem, String psw, OkHttpHelper.HttpCallback cb);
}
