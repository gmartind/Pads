package com.example.padsii;

import android.view.View;
import android.widget.Button;

public abstract class But implements View.OnClickListener{
    private Button b;
    private int status;

    public But(Button but){
        b = but;
        status = 0;
    }

    protected Button getButton(){
        return b;
    }

    protected int getStatus(){
        return status;
    }
    public void setStatus(int s) {
        this.status = s;
    }

}
