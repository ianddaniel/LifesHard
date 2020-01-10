package com.android.lifeshardv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class shouldvacay1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shouldvacay1);
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(shouldvacay1.this, cheapvacay.class);
        startActivity(intent);
    }

    public void sendMessage2(View view) {
        Intent intent = new Intent(shouldvacay1.this, decentvacay.class);
        startActivity(intent);
    }

    public void sendMessage3(View view) {
        Intent intent = new Intent(shouldvacay1.this, expensivevacay.class);
        startActivity(intent);
    }
}
