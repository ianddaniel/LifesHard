package com.android.lifeshardv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class shouldeat1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shouldeat1);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(shouldeat1.this, fastfood.class);
        startActivity(intent);
    }

    public void sendMessage2(View view) {
        Intent intent = new Intent(shouldeat1.this, chinesefood.class);
        startActivity(intent);
    }

    public void sendMessage3(View view) {
        Intent intent = new Intent(shouldeat1.this, italianfood.class);
        startActivity(intent);
    }

    public void sendMessage4(View view) {
        Intent intent = new Intent(shouldeat1.this, americancontemp.class);
        startActivity(intent);
    }

    public void sendMessage5(View view) {
        Intent intent = new Intent(shouldeat1.this, mexicanfood.class);
        startActivity(intent);
    }
}
