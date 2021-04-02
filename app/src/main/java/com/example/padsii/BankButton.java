package com.example.padsii;

import android.view.View;
import android.widget.Button;

public class BankButton extends But{
    private PadBank myPadBank;
    private boolean bank;
    private FaderBank myFaderBank;
    public BankButton(Button but, PadBank as, FaderBank ap) {
        super(but);
        this.getButton().setOnClickListener(this);
        bank = false;
        myPadBank = as;
        myFaderBank = ap;
    } //Constructor

    @Override
    public void onClick(View v) {       // !! When we click a Bank Button, we set desired sound bank in our pad bank, set every pad state to 0 and reset our faders status
        bank = !bank;
        myPadBank.setBank(bank);
        myFaderBank.reset();
    }
}
