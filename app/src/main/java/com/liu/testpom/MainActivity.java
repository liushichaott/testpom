package com.liu.testpom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import testpom.liu.com.pomlibrary.CipherUtil;

public class MainActivity extends AppCompatActivity {
//1
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            CipherUtil.decrypt("oijiojoij","9999999999999999");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
