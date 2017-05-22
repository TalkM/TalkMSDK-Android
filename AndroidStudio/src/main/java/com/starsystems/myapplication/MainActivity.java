package com.starsystems.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.starsystems.talkmsdklib.TalkMSDKConfig;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //talkm uat
        TalkMSDKConfig.initTalkM(MainActivity.this, "tenant1", "hrXXPdGknlGLYvbi", "SSfEsfil0CmKeDsyDJwRHVwXXCKAdpqY9pTuO0r6arF6QTSb2jbu8WOBNPk9rFcW");

    }
}
