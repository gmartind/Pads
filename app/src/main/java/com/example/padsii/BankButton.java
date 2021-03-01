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
    }

    @Override
    public void onClick(View v) {
        bank = !bank;
        myPadBank.setBank(bank);
        myPadBank.setStatus(0);
        myFaderBank.reset();
    }
}
