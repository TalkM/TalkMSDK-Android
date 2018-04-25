package com.example.sample.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.starsystems.talkmsdklib.TalkMSDKConfig;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TalkMSDKConfig.initTalkM(this, "2cad7a38-ffb1-11e6-bfaa-080027e52f64", "im-app-id", "im-app-secret");
    }
}
