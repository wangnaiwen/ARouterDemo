package com.nkgame.logindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.nkgame.libs.JumpUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.demo_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转并且传递数据到LoginActivity
                ARouter.getInstance().build(JumpUtil.LOGIN_ACTIVITY).withString("uuid", "123456789").navigation();
            }
        });
    }
}