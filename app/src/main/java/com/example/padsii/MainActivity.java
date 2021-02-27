package com.example.padsii;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.ArrayDeque;
import java.util.Queue;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button b1, b2, b3, b4;
    private Queue<MediaPlayer> q = new ArrayDeque<MediaPlayer>();
    private MediaPlayer del;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtenemos los cuatro botones de la interfaz
        b1= findViewById(R.id.button1);
        b2= findViewById(R.id.button2);
        b3= findViewById(R.id.button3);
        b4= findViewById(R.id.button4);

        //Y les asignamos el controlador de eventos
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //Comprobamos el identificador del boton que ha llamado al evento para ver
        //cual de los botones es y ejecutar la acción correspondiente

        if(q.size() >= 3){
            del = q.remove();
            del.stop();
            del.release();
            del = null;
        }

        switch(v.getId()){
            case R.id.button1:
                //Clap
                MediaPlayer mp1 = MediaPlayer.create(this, R.raw.clap1);
                mp1.start();
                q.add(mp1);
                break;
            case R.id.button2:
                //Cowbell
                MediaPlayer mp2 = MediaPlayer.create(this, R.raw.cowbell1);
                mp2.start();
                q.add(mp2);
                break;
            case R.id.button3:
                //HH
                MediaPlayer mp3 = MediaPlayer.create(this, R.raw.hihat1);
                mp3.start();
                q.add(mp3);
                break;
            case R.id.button4:
                //SD
                MediaPlayer mp4 = MediaPlayer.create(this, R.raw.snare1);
                mp4.start();
                q.add(mp4);
                break;
        }
    }
}