package com.example.padsii;

import java.io.Serializable;

public class FaderBank implements Serializable {
    private final Fader[] myFaders;
    private final MainActivity ac;
    private final PadBank associatedPadBank;

    public FaderBank(MainActivity m, PadBank pb){
        myFaders = new Fader[8];
        associatedPadBank = pb;
        ac = m;
        buildFaders();

    }   //Constructor
    public void buildFaders(){
        Pad [] associatedPads = associatedPadBank.getMyPads();
        for(int i = 0; i < 8; i++){
            myFaders[i] = new Fader(ac.findViewById(ac.getResources().getIdentifier("fader" + Integer.toString(i), "id", ac.getPackageName())),associatedPads[i]);
        }
    } //Constructor method

    public void reset(){
        for(Fader fader : myFaders){
            fader.setStatus(0);
            //fader.changeImage(0);
        }
    } //Mutator
}
