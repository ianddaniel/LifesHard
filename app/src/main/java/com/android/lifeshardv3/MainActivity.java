package com.android.lifeshardv3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.android.lifeshardv3.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(MainActivity.this, netflix2.class);
        startActivity(intent);
    }

    public void sendMessage2(View view) {
        Intent intent = new Intent(MainActivity.this, tvseries2.class);
        startActivity(intent);
    }

    public void sendMessage3(View view) {
        Intent intent = new Intent(MainActivity.this, shouldeat1.class);
        startActivity(intent);
    }

    public void sendMessage4(View view) {
        Intent intent = new Intent(MainActivity.this, shouldvacay1.class);
        startActivity(intent);
    }
}