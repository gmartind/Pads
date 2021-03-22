package com.example.padsii;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Pad extends But{
    private int mySounds[][];
    private final MainActivity ac;
    private boolean bank;

    public Pad(Button but, MainActivity cont){
        super(but);
        this.getButton().setOnClickListener(this);
        ac = cont;
        bank = false;
        mySounds = new int[2][3];
        mySounds[0][0] = R.raw.clap1;
        mySounds[0][1] = R.raw.cowbell1;
        mySounds[0][2] = R.raw.hihat1;
        mySounds[1][0] = R.raw.snare1;
        mySounds[1][1] = R.raw.cowbell1;
        mySounds[1][2] = R.raw.clap1;           ///!!!!!!!!!
    } //Constructor

    public void setBank(boolean b) {
        bank = b;
    } //Mutator

    @Override
    public void onClick(View v) {
        MediaPlayer mp = MediaPlayer.create(ac, this.mySounds[bank ? 1 : 0][this.getStatus()]);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }
}
