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
    private PadBank pb;
    private FaderBank fb;
    private BankButton bb;
    private Queue<MediaPlayer> mSoundQueue = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pb = new PadBank(this, mSoundQueue);
        fb = new FaderBank(this, pb);
        Button b = findViewById(R.id.bankButton);
        bb = new BankButton(b, pb, fb);

    }

}