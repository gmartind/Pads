package com.example.padsii;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ProgressBar;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements Serializable {
    private PadBank pb;
    private FaderBank fb;
    private BankButton bb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prueba);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        initViews();
    } //Launcher !!
    public void initViews(){
        pb = new PadBank(this);
        //fb = new FaderBank(this, pb);
        //ImageButton b = findViewById(R.id.bankButton);
        //bb = new BankButton(b, pb, fb);
    }
}