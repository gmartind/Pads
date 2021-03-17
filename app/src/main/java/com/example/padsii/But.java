package com.example.padsii;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.Serializable;

public abstract class But implements View.OnClickListener, Serializable {
    private ImageButton b;
    private int status;

    public But(ImageButton but){
        b = but;
        status = 0;
    }       //Constructor

    public void setStatus(int s) {
        this.status = s;
    } //Mutator

    protected ImageButton getButton(){
        return b;
    }   //Accessor
    protected int getStatus(){
        return status;
    } //Accessor

}
