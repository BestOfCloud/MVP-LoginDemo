package com.login.mvpdemo.model;


import com.login.mvpdemo.model.http.OkHttpHelper;

/**
 * Created by dance on 2017/5/13.
 */

public class LoginModel implements ILoginModel {
    @Override
    public void execLoginRequest(String url, String usernaem, String psw, OkHttpHelper.HttpCallback cb) {
        //处理参数，和拼接参数，检查参数
        OkHttpHelper.create().execGet("url", cb);
    }
}
