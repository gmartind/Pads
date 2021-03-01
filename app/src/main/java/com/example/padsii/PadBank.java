package com.example.padsii;

import android.media.MediaPlayer;
import android.widget.Button;

import java.util.Queue;

public class PadBank {
    private Pad myPads[];
    private MainActivity ac;
    private boolean bank;
    PadBank(MainActivity m, Queue<MediaPlayer> q){
        ac = m;
        bank = false;
        myPads = new Pad[8];
        myPads[0] = new Pad(ac.findViewById(R.id.button1), ac, q);
        myPads[1] = new Pad(ac.findViewById(R.id.button2), ac, q);
        myPads[2] = new Pad(ac.findViewById(R.id.button3), ac, q);
        myPads[3] = new Pad(ac.findViewById(R.id.button4), ac, q);
        myPads[4] = new Pad(ac.findViewById(R.id.button5), ac, q);
        myPads[5] = new Pad(ac.findViewById(R.id.button6), ac, q);
        myPads[6] = new Pad(ac.findViewById(R.id.button7), ac, q);
        myPads[7] = new Pad(ac.findViewById(R.id.button8), ac, q); ///!!!!!!!!!!!
    }

    public void setBank(boolean b){
        bank = b;
        for(int i = 0; i < 8; i++){
            myPads[i].setBank(b);
        }
    }
    public void setStatus(int b){
        int status = b % 3;
        for(Pad p: myPads){
            p.setStatus(status);
        }
    }

    public boolean getBank(){
        return bank;
    }

    public Pad[] getMyPads(){
        return myPads;
    }
}
