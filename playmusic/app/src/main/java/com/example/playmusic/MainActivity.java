package com.example.playmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer s1 = MediaPlayer.create(this, R.raw.cat);
        final MediaPlayer s2 = MediaPlayer.create(this, R.raw.dryflower);
        final MediaPlayer s3 = MediaPlayer.create(this, R.raw.levelline);
        final MediaPlayer s4 = MediaPlayer.create(this, R.raw.none);
        Button b1 = (Button) findViewById(R.id.button1);

        b1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                s2.stop();
                s3.stop();
                s4.stop();


                try {
                    s1.prepare();
                    s1.seekTo(0);
                    s1.start();
                } catch (IllegalStateException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        });

        Button b2 = (Button) findViewById(R.id.button2);

        b2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1.stop();
                s3.stop();
                s4.stop();

                try {
                    s2.prepare();
                    s2.seekTo(0);
                    s2.start();
                } catch (IllegalStateException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        });

        Button b3 = (Button) findViewById(R.id.button3);

        b3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                s2.stop();
                s1.stop();
                s4.stop();

                try {
                    s3.prepare();
                    s3.seekTo(0);
                    s3.start();
                } catch (IllegalStateException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        });
        Button b4 = (Button) findViewById(R.id.button);

        b4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                s2.stop();
                s1.stop();
                s3.stop();

                try {
                    s4.prepare();
                    s4.seekTo(0);
                    s4.start();
                } catch (IllegalStateException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        });

    }

}