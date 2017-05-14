package com.login.mvpdemo.presenter;

import android.text.TextUtils;

import com.login.mvpdemo.model.LoginModel;
import com.login.mvpdemo.model.http.OkHttpHelper;
import com.login.mvpdemo.view.ILoginView;

/**
 * Created by dance on 2017/5/13.
 * 负责从View层抽离login界面的业务逻辑
 */

public class LoginPresenter extends BasePresenter {
    //面向View接口来接收对象
    private ILoginView loginView;
    LoginModel loginModel = new LoginModel();
    public LoginPresenter(ILoginView loginView){
        this.loginView = loginView;
    }

    /**
     * 封装登录业务逻辑
     * @param user
     * @param psw
     */
    public void execLogin(String user, String psw){
        if(checkInput(user, psw)){
            //请求网络,执行登录
//            OkHttpHelper.create().execGet("url", new OkHttpHelper.HttpCallback() {
//                @Override
//                public void onFaile(Exception e) {
//                    loginView.showLoginFail();
//                }
//                @Override
//                public void onSuccess(String data) {
//                    //1.跳转其他界面
//                    jumpOtherPage();
//
//                    //2.保存用户登录数据
//                    saveUserData();
//                }
//            });

            loginModel.execLoginRequest("url", user, psw, new OkHttpHelper.HttpCallback() {
                @Override
                public void onFaile(Exception e) {
                    loginView.showLoginFail();
                }

                @Override
                public void onSuccess(String data) {
                    //1.跳转其他界面
                    jumpOtherPage();
                   //2.保存用户登录数据
                    saveUserData();
                }
            });

        }
    }

    //保存用户登录数据
    private void saveUserData() {
        //将数据保存到sp中
//        SharePrefHelper.create()...
    }

    //跳转到其他的activity界面..
    private void jumpOtherPage() {
    }

    //检查输入的合法性
    private boolean checkInput(String user, String psw) {
        boolean result = true;
        if(TextUtils.isEmpty(user) || TextUtils.isEmpty(psw)){
            loginView.showInputNotNull();
            return false;
        }

        //...其他的判断

        return true;
    }



}
