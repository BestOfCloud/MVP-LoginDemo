package com.login.mvpdemo.presenter;

/**
 * Created by dance on 2017/5/13.
 */

public class BasePresenter {
    public void onViewResume(){

    }

    public void onViewPause(){

    }

    public void onViewStart(){

    }

    public void onViewStop(){

    }

    /**
     * 响应view层销毁的方法
     */
    public void onViewDestory(){
        //p层在此处去释放资源，关闭cursor，取消网络连接等待
    }
}
