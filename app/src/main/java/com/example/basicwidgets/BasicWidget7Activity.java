package com.example.basicwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class BasicWidget7Activity extends AppCompatActivity {
    RadioButton rojo, azul, verde;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_widget7);
        rojo = (RadioButton) findViewById(R.id.radior);
        azul = (RadioButton) findViewById(R.id.radiob);
        verde = (RadioButton) findViewById(R.id.radiov);
        texto = (TextView) findViewById(R.id.textView4);
        texto.setText("Hola");
        rojo.setText("Red");
        azul.setText("Blue");
        verde.setText("Green");

        rojo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                texto.setTextColor(Color.RED);
                azul.setChecked(false);
                verde.setChecked(false);
            }
        });

        azul.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                texto.setTextColor(Color.BLUE);
                verde.setChecked(false);
                rojo.setChecked(false);
            }
        });

        verde.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                texto.setTextColor(Color.GREEN);
                azul.setChecked(false);
                rojo.setChecked(false);
            }
        });
    }
}