package com.login.mvpdemo.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.login.mvpdemo.presenter.LoginPresenter;

/**
 * Created by dance on 2017/5/13.
 */

public class RegisterActivity extends AppCompatActivity implements ILoginView{
    LoginPresenter loginPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginPresenter = new LoginPresenter(this);
    }

    @Override
    public void showLoginFail() {

    }

    @Override
    public void showInputNotNull() {

    }
}
