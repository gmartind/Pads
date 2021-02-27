package com.example.padsii;

import android.view.View;
import android.widget.Button;

public class Fader  extends But{
    private Pad associatedPad;
    public Fader(Button fader, Pad pad){
        super(fader);
        associatedPad = pad;
        fader.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        setStatus((this.getStatus() + 1) % 3);
        associatedPad.setStatus(this.getStatus());
    }
}
