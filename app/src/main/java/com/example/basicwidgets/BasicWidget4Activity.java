package com.example.basicwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BasicWidget4Activity extends AppCompatActivity {
Button sonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_widget4);
        final MediaPlayer m = MediaPlayer.create(this, R.raw.minecraft);
        sonido = (Button) findViewById(R.id.sonido);
        sonido.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                m.start();
            }
        });


    }
}
