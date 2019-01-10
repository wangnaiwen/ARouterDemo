package com.nkgame.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.nkgame.libs.JumpUtil;

@Route(path = JumpUtil.LOGIN_ACTIVITY)
public class LoginActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String uuid = intent.getStringExtra("uuid");
        Log.d("TAG=========", uuid);
        setContentView(R.layout.activity_login);
        findViewById(R.id.btn_share).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build(JumpUtil.SHARE_ACTIVITY).navigation();
            }
        });
    }
}
