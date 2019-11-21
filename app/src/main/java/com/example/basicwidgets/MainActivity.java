package com.example.basicwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void B1 (View v){
        startActivity(new Intent(this, BasicWidget1Activity.class));
    }

    public void B2 (View v){
        startActivity(new Intent(this, BasicWidget2Activity.class));
    }

    public void B3 (View v){
        startActivity(new Intent(this, BasicWidget3Activity.class));
    }

    public void B4 (View v){
        startActivity(new Intent(this, BasicWidget4Activity.class));
    }

    public void B5 (View v){
        startActivity(new Intent(this, BasicWidget5Activity.class));
    }

    public void B6 (View v){
        startActivity(new Intent(this, BasicWidget6Activity.class));
    }

    public void B7 (View v){
        startActivity(new Intent(this, BasicWidget7Activity.class));
    }

    public void B8 (View v){
        startActivity(new Intent(this, BasicWidget8Activity.class));
    }
}
