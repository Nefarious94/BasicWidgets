package com.example.basicwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BasicWidget1Activity extends AppCompatActivity {
TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_widget1);

        texto = (TextView)findViewById(R.id.texto_1);
        texto.setText("You were expecting something profound?" );
    }
}
