package com.example.basicwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class BasicWidget8_1Activity extends AppCompatActivity {
RadioButton V,H,I,C,D;
RadioGroup R1,R2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_widget8_1);

        V = findViewById(R.id.Vertical);
        H = findViewById(R.id.Horizontal);
        I = findViewById(R.id.Izq);
        C = findViewById(R.id.Centro);
        D = findViewById(R.id.Dcha);
        R1 = findViewById(R.id.RadioG1);
        R2 = findViewById(R.id.RadioG2);

        V.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                H.setChecked(false);

            }
        });
    }
}
