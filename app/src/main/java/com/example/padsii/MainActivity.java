package com.example.padsii;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainActivity extends AppCompatActivity{
    private Pad p1,p2,p3,p4;
    private Fader f1, f2, f3, f4;
    private Queue<MediaPlayer> mSoundQueue = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1 = new Pad(findViewById(R.id.button1), this, mSoundQueue);
        f1 = new Fader(findViewById(R.id.fader1), p1);


        p2 = new Pad(findViewById(R.id.button2), this, mSoundQueue);
        f2 = new Fader(findViewById(R.id.fader2), p2);

        p3 = new Pad(findViewById(R.id.button3), this, mSoundQueue);
        f3 = new Fader(findViewById(R.id.fader3), p3);

        p4 = new Pad(findViewById(R.id.button4), this, mSoundQueue);
        f4 = new Fader(findViewById(R.id.fader4), p4);

    }

}