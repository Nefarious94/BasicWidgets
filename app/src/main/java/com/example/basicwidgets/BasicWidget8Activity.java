package com.example.basicwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BasicWidget8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_widget8);
    }

    public void B1 (View v){
        startActivity(new Intent(this, BasicWidget8_1Activity.class));
    }

    public void B2 (View v){
        startActivity(new Intent(this, BasicWidget8_2Activity.class));
    }

    public void B3 (View v){
        startActivity(new Intent(this, BasicWidget8_3Activity.class));
    }

    public void B4 (View v){
        startActivity(new Intent(this, BasicWidget8_4Activity.class));
    }

    public void B5 (View v){
        startActivity(new Intent(this, BasicWidget8_5Activity.class));
    }

}
