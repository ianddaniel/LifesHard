package com.android.lifeshardv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tvseries2 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.android.lifeshardv3.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tvseries2);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(tvseries2.this, actiontvseries.class);
        startActivity(intent);
    }

    public void sendMessage2(View view) {
        Intent intent = new Intent(tvseries2.this, comedytvseries.class);
        startActivity(intent);
    }

    public void sendMessage3(View view) {
        Intent intent = new Intent(tvseries2.this, docutvseries.class);
        startActivity(intent);
    }

    public void sendMessage4(View view) {
        Intent intent = new Intent(tvseries2.this, dramatvseries.class);
        startActivity(intent);
    }

    public void sendMessage5(View view) {
        Intent intent = new Intent(tvseries2.this, scifitvseries.class);
        startActivity(intent);
    }
}