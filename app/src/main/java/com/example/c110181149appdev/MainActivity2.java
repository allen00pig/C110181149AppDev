package com.example.c110181149appdev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button RollBtn = findViewById(R.id.RollBtn);
        Button BackMainbtn = findViewById(R.id.BackMainBtn);
        BackMainbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
        RollBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand1 = new Random();
                Random rand2 = new Random();
                Random rand3 = new Random();

                int randNum1 = rand1.nextInt(6)+1;
                int randNum2= rand2.nextInt(6)+1;
                int randNum3 = rand3.nextInt(6)+1;

                ImageView diceImg1 = findViewById(R.id.Dice1);
                ImageView diceImg2 = findViewById(R.id.Dice2);
                ImageView diceImg3 = findViewById(R.id.Dice3);

                int drawbleResource1;
                int drawbleResource2;
                int drawbleResource3;

                switch (randNum1){
                    case 1: drawbleResource1 = R.drawable.dice_1; break;
                    case 2: drawbleResource1 = R.drawable.dice_2; break;
                    case 3: drawbleResource1 = R.drawable.dice_3; break;
                    case 4: drawbleResource1 = R.drawable.dice_4; break;
                    case 5: drawbleResource1 = R.drawable.dice_5; break;
                    case 6: drawbleResource1 = R.drawable.dice_6; break;
                    default:
                        throw new IllegalStateException("Unexpected value: "+ randNum1);
                }
                switch (randNum2){
                    case 1: drawbleResource2 = R.drawable.dice_1; break;
                    case 2: drawbleResource2 = R.drawable.dice_2; break;
                    case 3: drawbleResource2 = R.drawable.dice_3; break;
                    case 4: drawbleResource2 = R.drawable.dice_4; break;
                    case 5: drawbleResource2 = R.drawable.dice_5; break;
                    case 6: drawbleResource2 = R.drawable.dice_6; break;
                    default:
                        throw new IllegalStateException("Unexpected value: "+ randNum1);
                }
                switch (randNum3){
                    case 1: drawbleResource3 = R.drawable.dice_1; break;
                    case 2: drawbleResource3 = R.drawable.dice_2; break;
                    case 3: drawbleResource3 = R.drawable.dice_3; break;
                    case 4: drawbleResource3 = R.drawable.dice_4; break;
                    case 5: drawbleResource3 = R.drawable.dice_5; break;
                    case 6: drawbleResource3 = R.drawable.dice_6; break;
                    default:
                        throw new IllegalStateException("Unexpected value: "+ randNum1);
                }

                Drawable drawable1 = ContextCompat.getDrawable(getBaseContext(),drawbleResource1);
                Drawable drawable2 = ContextCompat.getDrawable(getBaseContext(),drawbleResource2);
                Drawable drawable3 = ContextCompat.getDrawable(getBaseContext(),drawbleResource3);

                diceImg1.setImageDrawable(drawable1);
                diceImg2.setImageDrawable(drawable2);
                diceImg3.setImageDrawable(drawable3);
            }
        });
    }
}