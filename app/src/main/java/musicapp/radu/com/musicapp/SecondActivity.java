package musicapp.radu.com.musicapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private MediaPlayer mPlayer;
    private int currentSong = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();
        int number = intent.getIntExtra("BUTTON NUMBER", 1);
        TextView tv = (TextView) findViewById(R.id.textView);
        if (number==1){
        tv.setText(String.valueOf("Axel Thesleff-Bad Karma"));}
        if (number==2){
            tv.setText(String.valueOf("Pharrell Wiliams-Freedom"));}
        if (number==3){
            tv.setText(String.valueOf("Tom B.-Secrets"));}
        if (number==4){
            tv.setText(String.valueOf("Awolonation-Sail"));}
        if (number == 1) {
            mPlayer = MediaPlayer.create(SecondActivity.this, R.raw.song1);
            currentSong = R.raw.song1;
        } else if (number == 2) {
            mPlayer = MediaPlayer.create(SecondActivity.this, R.raw.song2);
            currentSong = R.raw.song2;

        } else if (number == 3) {
            mPlayer = MediaPlayer.create(SecondActivity.this, R.raw.song3);
            currentSong = R.raw.song3;

        } else if (number == 4) {
            mPlayer = MediaPlayer.create(SecondActivity.this, R.raw.song4);
            currentSong = R.raw.song4;


        } else {
            mPlayer = MediaPlayer.create(SecondActivity.this, R.raw.song1);
            currentSong = R.raw.song1;

        }

        mPlayer.start();




    }
    @Override
    protected void onPause() {
        super.onPause();
        if (mPlayer.isPlaying()) {
            mPlayer.pause();
        }
    }
    @Override
    protected void onResume() {
        super.onResume();
        if (mPlayer == null) {
            mPlayer = MediaPlayer.create(SecondActivity.this, currentSong);
        }

        mPlayer.start();
    }
    @Override
    protected void onStop() {
        super.onStop();

        if (mPlayer.isPlaying()) {
            mPlayer.stop();
        }
    }
}
