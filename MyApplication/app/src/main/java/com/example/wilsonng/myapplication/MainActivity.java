package com.example.wilsonng.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.starsystems.talkmsdklib.TalkMSDKConfig;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TalkMSDKConfig.initTalkM(this, "00b4666d-ed43-4f44-9cdb-96dde81adc20", "f8a70a37-82be-4720-a810-ddef5bffacd2", "rNAsV72WMLdihanJBMdxZkxYwfbXudyyJvUMk1b8BA64o2z5caFn34AiiTralh31");
    }
}
