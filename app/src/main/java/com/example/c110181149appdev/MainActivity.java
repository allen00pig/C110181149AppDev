package com.example.c110181149appdev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText FanScore ,FuScore;

    Button Count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FanScore = findViewById(R.id.fanCount);
        FuScore = findViewById(R.id.fuCount);
        Count = findViewById(R.id.CountBtn);
    }

    public void BtnClick(View view){

    }
}