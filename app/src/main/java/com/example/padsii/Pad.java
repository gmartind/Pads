package com.example.padsii;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Pad extends But implements View.OnLongClickListener{
    private int oneShot;
    private int loop;
    private final MainActivity ac;
    private boolean looping;
    private boolean bank;
    private MediaPlayer loopMp;
    private static final int[] STATE_LOOPING = {R.attr.state_looping};

    public Pad(Button but, MainActivity cont){
        super(but);
        this.getButton().setOnClickListener(this);
        this.getButton().setOnLongClickListener(this);
        looping = false;
        ac = cont;
        bank = false;
        oneShot = R.raw.clap1;
        loop = R.raw.kick_loop;
        loopMp = MediaPlayer.create(ac, this.loop);
    } //Constructor

    public void setBank(boolean b) {
        bank = b;
    } //Mutator

    @Override
    public void onClick(View v) {
        MediaPlayer mp = MediaPlayer.create(ac, this.oneShot);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
        if(looping){
            loopMp.pause();
            looping = false;
            this.getButton().setBackgroundResource(R.drawable.but_skin);
        }
    }

    @Override
    public boolean onLongClick(View v) {
        if(!looping){
            loopMp.start();
            loopMp.setLooping(true);
            looping = true;
            this.getButton().setBackgroundResource(R.drawable.rounded_btn_looping);
        }
        else {
            loopMp.pause();
            looping = false;
            this.getButton().setBackgroundResource(R.drawable.but_skin);
        }

        return true;
    }
}
