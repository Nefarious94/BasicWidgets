package com.example.basicwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Date;

public class BasicWidget2Activity extends AppCompatActivity implements View.OnClickListener{
    Button fecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_widget2);
        fecha = (Button) findViewById(R.id.time);
        fecha.setOnClickListener(this);
    }
    public void onClick(View view){
        updateTime();
    }

    private void updateTime() {
        fecha.setText(new Date().toString());
    }
}
