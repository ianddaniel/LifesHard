package com.android.lifeshardv3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class netflixmovie extends netflix2 {
    public static final String EXTRA_MESSAGE = "com.android.lifeshardv3.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_netflixmovie);

    }
    public void sendMessage(View view) {

        Intent intent = new Intent(netflixmovie.this, actionmovies.class);
        startActivity(intent);
    }
    public void sendMessage2(View view) {

        Intent intent = new Intent(netflixmovie.this, comedymovies.class);
        startActivity(intent);
    }
    public void sendMessage3(View view) {

        Intent intent = new Intent(netflixmovie.this, documentaries.class);
        startActivity(intent);
    }
    public void sendMessage4 (View view) {

        Intent intent = new Intent(netflixmovie.this, dramamovies.class);
        startActivity(intent);
    }
    public void sendMessage5(View view) {

        Intent intent = new Intent(netflixmovie.this, horrormovies.class);
        startActivity(intent);
    }
}
