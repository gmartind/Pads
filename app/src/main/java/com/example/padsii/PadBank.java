package com.example.padsii;

import java.io.Serializable;

public class PadBank implements Serializable {
    private final Pad[] myPads;
    private final MainActivity ac;
    private boolean bank;
    static final int NBUTTONS = 32;
    public PadBank(MainActivity m){
        ac = m;
        bank = false;
        myPads = new Pad[NBUTTONS];
        buildPads();

    }           //Constructor
    public void buildPads(){
        for(int i = 0; i < NBUTTONS; i++){
            myPads[i] = new Pad(ac.findViewById(ac.getResources().getIdentifier("button" + Integer.toString(i), "id", ac.getPackageName())),ac);
        }
    }           //Constructor method

    public void setBank(boolean b){
        bank = b;
        for(Pad p: myPads){
            p.setBank(b);
            p.setStatus(0);
        }
    }       //Mutator
    public void setStatus(int b){
        int status = b % 3;
        for(Pad p: myPads){
            p.setStatus(status);
        }
    }       //Mutator

    public Pad[] getMyPads(){
        return myPads;
    } //Accessor
    public boolean getBank(){
        return bank;
    } //Accessor
}
