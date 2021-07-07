package com.example.c_happy_mirror;
//https://cloud.hpplay.cn:9889/dev/#https://statistics.hpplay.cn:81/statistics-platform/main.html
//https://doc.hpplay.com.cn/web/#/1/26
/*
* 1.
* maven { url 'https://jitpack.io' }
flatDir {
   dirs 'libs'
}
implementation(name: 'sdk-lecast-release', ext: 'aar')
* */
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hpplay.sdk.sink.api.LelinkCast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}