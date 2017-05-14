package com.login.mvpdemo.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.login.mvpdemo.R;
import com.login.mvpdemo.presenter.LoginPresenter;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements ILoginView{

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

        presenter = new LoginPresenter(this);
    }

    @OnClick(R.id.btn_login)
    public void onViewClicked() {
        //1.取出用户名和密码
        String user = etUsername.getText().toString();
        String psw = etPsw.getText().toString();

        //2.执行登录
        ( (LoginPresenter)presenter).execLogin(user,psw);

    }

    //显示登录失败
    public void showLoginFail() {
        Toast.makeText(this, "登录失败!", Toast.LENGTH_SHORT).show();
    }


    //显示用户名和密码不能为空
    public void showInputNotNull() {
        Toast.makeText(this, "用户名和密码不能为空！", Toast.LENGTH_SHORT).show();
    }


}
