package com.example.padsii;

import android.app.Activity;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

import java.util.PriorityQueue;
import java.util.Queue;

public class Pad extends But{
    private int mySounds[][];
    private MainActivity ac;
    private Queue<MediaPlayer> pSoundQueue;
    private MediaPlayer del;
    private int bank;               //Enumerado?
    public Pad(Button but, MainActivity cont, Queue<MediaPlayer> q){
        super(but);
        this.getButton().setOnClickListener(this);
        ac = cont;
        pSoundQueue = q;
        bank = 0;
        mySounds = new int[2][3];
        mySounds[0][0] = R.raw.clap1;
        mySounds[0][1] = R.raw.cowbell1;
        mySounds[0][2] = R.raw.hihat1;
        mySounds[1][0] = R.raw.snare1;
        mySounds[1][1] = R.raw.cowbell1;
        mySounds[1][2] = R.raw.clap1;           ///!!!!!!!!!
    }

    @Override
    public void onClick(View v) {
        if(pSoundQueue.size() > 5){
            del = pSoundQueue.remove();
            del.stop();
            del.release();
            del = null;
        }
        MediaPlayer mp = MediaPlayer.create(ac, this.mySounds[bank][this.getStatus()]);
        mp.start();
        pSoundQueue.add(mp);
    }

    public void setBank(boolean b) {
        bank = b? 1 : 0;
    }
}
