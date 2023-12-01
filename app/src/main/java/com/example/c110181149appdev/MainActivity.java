package com.example.c110181149appdev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText FanScore ,FuScore;
    private Button Count;
    private Spinner HomeSpinner ,PeopleSpinner;
    private Integer Score;
    private String ManGan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FanScore = findViewById(R.id.fanCount);
        FuScore = findViewById(R.id.fuCount);
        Count = findViewById(R.id.CountBtn);
        HomeSpinner = findViewById(R.id.HomeSpinner);
        PeopleSpinner = findViewById(R.id.PeopleSpinner);
    }

    public void BtnClick(View view){
        String[] Home = getResources().getStringArray(R.array.homeType);
        String[] People = getResources().getStringArray(R.array.PeopleType);

        int idHome = HomeSpinner.getSelectedItemPosition();
        int idPeople = PeopleSpinner.getSelectedItemPosition();

        if(idHome == 0 && idPeople == 0){
            //這是三麻親家

        }
        if(idHome == 1 && idPeople == 0){
            //這是三麻閒家

        }
        if(idHome == 0 && idPeople == 1){
            //這是四麻親家

        }
        if(idHome == 1 && idPeople == 1){
            //這是四麻閒家

        }
    }
}