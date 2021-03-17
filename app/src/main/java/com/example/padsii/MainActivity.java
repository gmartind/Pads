package com.example.padsii;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainActivity extends AppCompatActivity implements Serializable {
    private PadBank pb;
    private FaderBank fb;
    private BankButton bb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    } //Launcher !!

    public void initViews(){
        pb = new PadBank(this);
        fb = new FaderBank(this, pb);
        //ImageButton b = findViewById(R.id.bankButton);
        //bb = new BankButton(b, pb, fb);
    }
}