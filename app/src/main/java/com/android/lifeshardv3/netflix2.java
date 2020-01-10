package com.android.lifeshardv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class netflix2 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.android.lifeshardv3.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_netflix2);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(netflix2.this, netflixmovie.class);
        startActivity(intent);
    }

    public void sendMessage2(View view) {
        Intent intent = new Intent(netflix2.this, tvseries2.class);
        startActivity(intent);
    }
}
