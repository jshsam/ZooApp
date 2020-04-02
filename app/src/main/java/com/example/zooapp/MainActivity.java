package com.example.zooapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer lionPlayer;
    private MediaPlayer gorillaPlayer;
    private MediaPlayer marmotPlayer;
    private MediaPlayer humpbackPlayer;
    private MediaPlayer elephantPlayer;
    private ImageView lionImageView;
    private ImageView gorillaImageView;
    private ImageView marmotImageView;
    private ImageView humpbackImageView;
    private ImageView elephantImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lionPlayer = MediaPlayer.create(this, R.raw.lion);
        gorillaPlayer = MediaPlayer.create(this, R.raw.gorilla);
        marmotPlayer = MediaPlayer.create(this, R.raw.marmot);
        humpbackPlayer = MediaPlayer.create(this, R.raw.humpback);
        elephantPlayer = MediaPlayer.create(this, R.raw.elephant);
        lionImageView = findViewById(R.id.lion_imageview);
        gorillaImageView = findViewById(R.id.gorilla_imageview);
        marmotImageView = findViewById(R.id.marmot_imageview);
        humpbackImageView = findViewById(R.id.humpback_imageview);
        elephantImageView = findViewById(R.id.elephant_imageview);

        lionImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lionPlayer.start();
            }
        });

        gorillaImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gorillaPlayer.start();
            }
        });

        marmotImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marmotPlayer.start();
            }
        });

        humpbackImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                humpbackPlayer.start();
            }
        });

        elephantImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                elephantPlayer.start();
            }
        });
    }
}
