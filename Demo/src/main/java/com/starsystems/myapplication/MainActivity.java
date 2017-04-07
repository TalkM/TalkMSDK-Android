package com.starsystems.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.starsystems.talkmsdklib.TalkMSDKConfig;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TalkMSDKConfig.initTalkM(MainActivity.this, "tenant1", "ax7KcAbAvfgXxzeA", "PS3Y5YlOpdSsFsoEydq7ahTYRxOYvicgKnGF23cZgf5HimmMQXTUhW4djx0IwQ5v");

    }
}
