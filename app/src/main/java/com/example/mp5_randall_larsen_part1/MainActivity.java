package com.example.mp5_randall_larsen_part1;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer media_sein ;
    MediaPlayer media_shrek;
    MediaPlayer media_sponge;
    ImageView imageView;
    boolean is_selected = false;
    String choose = "seinfeld";
    boolean set = false;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.seinfeld);
        media_sein = MediaPlayer.create(this,R.raw.seinfeld_song);
        media_shrek = MediaPlayer.create(this,R.raw.shrek_song);
        media_sponge = MediaPlayer.create(this,R.raw.spnonge_song );
    }


    public void onRadioButtonClicked_seinfeld(View view) {
        is_selected = true;

        imageView.setImageResource(R.drawable.seinfeld);
        choose = "seinfeld";
        set = false;

    }

    public void onRadioButtonClicked_shrek(View view) {
        is_selected = true;

        imageView.setImageResource(R.drawable.shrek);
        choose = "shrek";
        set = false;
    }

    public void onRadioButtonClicked_sponge(View view) {
        is_selected = true;

        imageView.setImageResource(R.drawable.spongebob);
        choose = "sponge";
        set = false;
    }

    public void startPlay(View view) {

        if(is_selected == true && set == false){
            set = true;
            if(choose == "seinfeld"){
                media_sein = MediaPlayer.create(this,R.raw.seinfeld_song);
                media_shrek.pause();
                media_sponge.pause();
                media_sein.start();
            }
            else if(choose == "shrek"){
                media_shrek = MediaPlayer.create(this,R.raw.shrek_song);
                media_sein.pause();
                media_sponge.pause();
                media_shrek.start();
            }
            else if(choose == "sponge"){
                media_sponge = MediaPlayer.create(this,R.raw.spnonge_song );
                media_sein.pause();
                media_shrek.pause();
                media_sponge.start();
            }
        }

    }

    public void stopPlay(View view) {
        if(is_selected == true){
                set = false;
                media_sein.pause();

                media_shrek.pause();

                media_sponge.pause();

        }
    }
}
