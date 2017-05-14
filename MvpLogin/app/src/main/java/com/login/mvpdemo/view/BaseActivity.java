package com.login.mvpdemo.view;

import android.support.v7.app.AppCompatActivity;

import com.login.mvpdemo.presenter.BasePresenter;

/**
 * Created by dance on 2017/5/13.
 */

public class BaseActivity extends AppCompatActivity {
    BasePresenter  presenter;
    @Override
    protected void onPause() {
        super.onPause();
        presenter.onViewPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onViewResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.onViewStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.onViewStart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onViewDestory();
    }
}
