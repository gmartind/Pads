package com.example.padsii;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Fader  extends But{
    private final Pad associatedPad;
    private final int drawables[] = {R.drawable.kick, R.drawable.kick, R.drawable.kick};
    public Fader(Button fader, Pad pad){
        super(fader);
        associatedPad = pad;
        fader.setOnClickListener(this);
    }  //Constructor

    @Override
    public void onClick(View v) {
        setStatus((this.getStatus() + 1) % 3);
        associatedPad.setStatus(this.getStatus());
        //this.changeImage(this.getStatus());
    }

}
