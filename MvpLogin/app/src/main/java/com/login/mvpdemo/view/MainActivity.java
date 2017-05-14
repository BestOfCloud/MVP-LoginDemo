package com.login.mvpdemo.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.login.mvpdemo.R;
import com.login.mvpdemo.model.http.OkHttpHelper;
import com.login.mvpdemo.model.sp.SharePrefHelper;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.et_username)
    EditText etUsername;
    @BindView(R.id.et_psw)
    EditText etPsw;
    @BindView(R.id.btn_login)
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_login)
    public void onViewClicked() {
        //1.取出用户名和密码
        String user = etUsername.getText().toString();
        String psw = etPsw.getText().toString();

        //2.检查输入
        if(checkInput(user, psw)){
            //请求网络,执行登录
            OkHttpHelper.create().execGet("url", new OkHttpHelper.HttpCallback() {
                @Override
                public void onFaile(Exception e) {
                    showLoginFail();
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

    //显示登录失败
    private void showLoginFail() {
        Toast.makeText(this, "登录失败!", Toast.LENGTH_SHORT).show();
    }

    //检查输入的合法性
    private boolean checkInput(String user, String psw) {
        boolean result = true;
        if(TextUtils.isEmpty(user) || TextUtils.isEmpty(psw)){
            showInputNotNull();
            return false;
        }

        //...其他的判断

        return true;
    }
    //显示用户名和密码不能为空
    private void showInputNotNull() {
        Toast.makeText(this, "用户名和密码不能为空！", Toast.LENGTH_SHORT).show();
    }
}
