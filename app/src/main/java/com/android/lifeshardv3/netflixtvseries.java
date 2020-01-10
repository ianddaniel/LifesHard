package com.android.lifeshardv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class netflixtvseries extends tvseries2 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_netflixtvseries);
    }

    public void sendMessage(View view) {

        Intent intent = new Intent(netflixtvseries.this, actiontvseries.class);
        startActivity(intent);
    }

    public void sendMessage2(View view) {

        Intent intent = new Intent(netflixtvseries.this, comedytvseries.class);
        startActivity(intent);
    }

    public void sendMessage3(View view) {

        Intent intent = new Intent(netflixtvseries.this, docutvseries.class);
        startActivity(intent);
    }
}