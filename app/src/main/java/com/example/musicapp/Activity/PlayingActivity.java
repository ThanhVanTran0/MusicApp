package com.example.musicapp.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.musicapp.R;

public class PlayingActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        initToolbar("Now Playing");
    }

}
