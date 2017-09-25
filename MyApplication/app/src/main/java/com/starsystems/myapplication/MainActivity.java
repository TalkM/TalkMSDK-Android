package com.starsystems.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.starsystems.talkmsdklib.TalkMSDKConfig;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Talkm DEV
//        TalkMSDKConfig.initTalkM(MainActivity.this, "tenant1", "ax7KcAbAvfgXxzeA", "PS3Y5YlOpdSsFsoEydq7ahTYRxOYvicgKnGF23cZgf5HimmMQXTUhW4djx0IwQ5v");

        //talkm uat
//        TalkMSDKConfig.initTalkM(MainActivity.this, "starsystems", "de201968-ccc6-4e95-a14f-e1e470b1f610", "vvLvRcm2eKF9A8ILTEPVnLl2k3DtXJKe7HQlXGQT49HGYbtul1kZWdoVFj4g3olk");

        TalkMSDKConfig.initTalkM(MainActivity.this, "tenant1", "hrXXPdGknlGLYvbi", "SSfEsfil0CmKeDsyDJwRHVwXXCKAdpqY9pTuO0r6arF6QTSb2jbu8WOBNPk9rFcW");

    }
}
