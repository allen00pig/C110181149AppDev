package com.example.c110181149appdev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText FanScore, FuScore;
    private Button Count;
    private Spinner HomeSpinner, PeopleSpinner;
    private Integer SelfDrawnScore = 0;
    //總自摸得分
    private Integer chunkScore = 0;
    //放槍分
    private Integer PlayerSelfDrawnScore = 0;
    //自摸閒家
    private Integer DealerSeifDrawnScore = 0;
    //自摸親家
    private String ManGan = "";
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FanScore = findViewById(R.id.fanCount);
        FuScore = findViewById(R.id.fuCount);
        Count = findViewById(R.id.CountBtn);
        HomeSpinner = findViewById(R.id.HomeSpinner);
        PeopleSpinner = findViewById(R.id.PeopleSpinner);
        output = findViewById(R.id.lblOutput);
    }

    public void BtnClick(View view) {
        String[] Home = getResources().getStringArray(R.array.homeType);
        String[] People = getResources().getStringArray(R.array.PeopleType);

        int idHome = HomeSpinner.getSelectedItemPosition();
        int idPeople = PeopleSpinner.getSelectedItemPosition();

        int Fan = Integer.parseInt(FanScore.getText().toString());
        int Fu = Integer.parseInt(FuScore.getText().toString());
        //轉換成整數

        if (idHome == 0 && idPeople == 0) {
            //這是三麻親家
            if (Fan == 1) {
                if (Fu == 30) {
                    chunkScore = 1500;
                    SelfDrawnScore = 1000;
                    PlayerSelfDrawnScore = 500;

                }
                if(Fu == 40){
                    chunkScore = 2000;
                    SelfDrawnScore = 1400;
                    PlayerSelfDrawnScore = 700;
                }
                if(Fu == 50){
                    chunkScore = 2400;
                    SelfDrawnScore = 1600;
                    PlayerSelfDrawnScore = 800;
                }
                if(Fu == 60){
                    chunkScore = 1000;
                    SelfDrawnScore = 2000;
                    PlayerSelfDrawnScore = 1000;
                }
                if(Fu == 70){
                    chunkScore = 2900;
                    SelfDrawnScore = 2400;
                    PlayerSelfDrawnScore = 1200;
                }
                if(Fu == 80){
                    chunkScore = 3900;
                    SelfDrawnScore = 2600;
                    PlayerSelfDrawnScore = 1300;
                }
                if(Fu == 90){
                    chunkScore = 4400;
                    SelfDrawnScore = 3000;
                    PlayerSelfDrawnScore = 1500;
                }
                if(Fu == 100){
                    chunkScore = 4800;
                    SelfDrawnScore = 3200;
                    PlayerSelfDrawnScore = 1600;
                }
                if(Fu == 110){
                    chunkScore = 5300;
                }
            }
            if (Fan == 2) {
                if (Fu == 20) {
                    SelfDrawnScore = 1400;
                    PlayerSelfDrawnScore = 700;
                }
                if (Fu == 25) {
                    chunkScore = 2400;
                }
                if (Fu == 30) {
                    chunkScore = 2900;
                    SelfDrawnScore = 2000;
                    PlayerSelfDrawnScore = 1000;

                }
                if(Fu == 40){
                    chunkScore = 3900;
                    SelfDrawnScore = 2600;
                    PlayerSelfDrawnScore = 1300;
                }
                if(Fu == 50){
                    chunkScore = 4800;
                    SelfDrawnScore = 3200;
                    PlayerSelfDrawnScore = 1600;
                }
                if(Fu == 60){
                    chunkScore = 5800;
                    SelfDrawnScore = 4000;
                    PlayerSelfDrawnScore = 2000;
                }
                if(Fu == 70){
                    chunkScore = 6800;
                    SelfDrawnScore = 4600;
                    PlayerSelfDrawnScore = 2300;
                }
                if(Fu == 80){
                    chunkScore = 7700;
                    SelfDrawnScore = 5200;
                    PlayerSelfDrawnScore = 2600;
                }
                if(Fu == 90){
                    chunkScore = 8700;
                    SelfDrawnScore = 5800;
                    PlayerSelfDrawnScore = 2900;
                }
                if(Fu == 100){
                    chunkScore = 9600;
                    SelfDrawnScore = 6400;
                    PlayerSelfDrawnScore = 3200;
                }
                if(Fu == 110){
                    chunkScore = 10600;
                    SelfDrawnScore = 7200;
                    PlayerSelfDrawnScore = 3600;
                }
                if(Fan == 3){
                    if (Fu == 20) {
                        SelfDrawnScore = 2600;
                        PlayerSelfDrawnScore = 1300;
                    }
                    if (Fu == 25) {
                        chunkScore = 4800;
                        SelfDrawnScore = 3200;
                        PlayerSelfDrawnScore = 1600;
                    }
                    if (Fu == 30) {
                        chunkScore = 5800;
                        SelfDrawnScore = 4000;
                        PlayerSelfDrawnScore = 2000;

                    }
                    if(Fu == 40){
                        chunkScore = 7700;
                        SelfDrawnScore = 5200;
                        PlayerSelfDrawnScore = 2600;
                    }
                    if(Fu == 50){
                        chunkScore = 9600;
                        SelfDrawnScore = 6400;
                        PlayerSelfDrawnScore = 3200;
                    }
                    if(Fu == 60){
                        chunkScore = 11600;
                        SelfDrawnScore = 7800;
                        PlayerSelfDrawnScore = 3900;
                    }
                    if(Fu >= 70){
                        ManGan = "滿貫";
                        chunkScore = 12000;
                        SelfDrawnScore = 8000;
                        PlayerSelfDrawnScore = 4000;
                    }
                }
                if(Fan == 4){
                    if(Fu == 20){
                        SelfDrawnScore = 5200;
                        PlayerSelfDrawnScore = 2600;
                    }
                    if(Fu == 25){
                        chunkScore = 9600;
                        SelfDrawnScore = 6400;
                        PlayerSelfDrawnScore = 3200;
                    }
                    if(Fu == 30){
                        chunkScore = 11600;
                        SelfDrawnScore = 7800;
                        PlayerSelfDrawnScore = 3900;
                    }
                    if(Fu >= 40){
                        ManGan = "滿貫";
                        chunkScore = 12000;
                        SelfDrawnScore = 8000;
                        PlayerSelfDrawnScore = 4000;
                    }
                }
                if(Fan == 5){
                    ManGan = "滿貫";
                    chunkScore = 12000;
                    SelfDrawnScore = 8000;
                    PlayerSelfDrawnScore = 4000;
                }
                if(Fan== 6 || Fan == 7){
                    ManGan = "跳滿";
                    chunkScore = 18000;
                    SelfDrawnScore = 12000;
                    PlayerSelfDrawnScore = 6000;
                }
                if(Fan>= 8 && Fan <= 10){
                    ManGan = "倍滿";
                    chunkScore = 24000;
                    SelfDrawnScore = 16000;
                    PlayerSelfDrawnScore = 8000;
                }
                if(Fan== 11 || Fan == 12){
                    ManGan = "三倍滿";
                    chunkScore = 36000;
                    SelfDrawnScore = 24000;
                    PlayerSelfDrawnScore = 12000;
                }
                if(Fan >= 13){
                    ManGan = "累積役滿";
                    chunkScore = 48000;
                    SelfDrawnScore = 32000;
                    PlayerSelfDrawnScore = 16000;
                }
            }
            if (idHome == 1 && idPeople == 0) {
                //這是三麻閒家
                if (Fan == 1) {
                    if (Fu == 30) {
                        chunkScore = 1000;
                        SelfDrawnScore = 800;
                        PlayerSelfDrawnScore = 300;
                        DealerSeifDrawnScore = 500;
                    }
                    if (Fu == 40) {
                        chunkScore = 1300;
                        SelfDrawnScore = 1100;
                        PlayerSelfDrawnScore = 400;
                        DealerSeifDrawnScore = 700;
                    }
                    if (Fu == 50) {
                        chunkScore = 1600;
                        SelfDrawnScore = 1200;
                        PlayerSelfDrawnScore = 400;
                        DealerSeifDrawnScore = 800;
                    }
                    if(Fu == 60) {
                        chunkScore = 2000;
                        SelfDrawnScore = 1500;
                        PlayerSelfDrawnScore = 500;
                        DealerSeifDrawnScore = 1000;
                    }
                }
            }
            if (idHome == 0 && idPeople == 1) {
                //這是四麻親家
                if (Fan == 1) {
                    if (Fu == 30) {
                        chunkScore = 1500;
                        SelfDrawnScore = 1500;
                        PlayerSelfDrawnScore = 500;

                    }
                    if(Fu == 40){
                        chunkScore = 2000;
                        SelfDrawnScore = 2100;
                        PlayerSelfDrawnScore = 700;
                    }
                    if(Fu == 50){
                        chunkScore = 2400;
                        SelfDrawnScore = 2400;
                        PlayerSelfDrawnScore = 800;
                    }
                    if(Fu == 60){
                        chunkScore = 2900;
                        SelfDrawnScore = 3000;
                        PlayerSelfDrawnScore = 1000;
                    }
                    if(Fu == 70){
                        chunkScore = 3400;
                        SelfDrawnScore = 3600;
                        PlayerSelfDrawnScore = 1200;
                    }
                    if(Fu == 80){
                        chunkScore = 3900;
                        SelfDrawnScore = 3900;
                        PlayerSelfDrawnScore = 1300;
                    }
                    if(Fu == 90){
                        chunkScore = 4400;
                        SelfDrawnScore = 4500;
                        PlayerSelfDrawnScore = 1500;
                    }
                    if(Fu == 100){
                        chunkScore = 4800;
                        SelfDrawnScore = 4800;
                        PlayerSelfDrawnScore = 1600;
                    }
                    if(Fu == 110){
                        chunkScore = 10600;
                        SelfDrawnScore = 10800;
                        PlayerSelfDrawnScore = 3600;

                    }
                }
                if (Fan == 2) {
                    if (Fu == 20) {
                        SelfDrawnScore = 2100;
                        PlayerSelfDrawnScore = 700;
                    }
                    if (Fu == 25) {
                        chunkScore = 2400;
                    }
                    if (Fu == 30) {
                        chunkScore = 2900;
                        SelfDrawnScore = 3000;
                        PlayerSelfDrawnScore = 1000;

                    }
                    if (Fu == 40) {
                        chunkScore = 3900;
                        SelfDrawnScore = 3900;
                        PlayerSelfDrawnScore = 1300;
                    }
                    if (Fu == 50) {
                        chunkScore = 4800;
                        SelfDrawnScore = 4800;
                        PlayerSelfDrawnScore = 1600;
                    }
                    if (Fu == 60) {
                        chunkScore = 5800;
                        SelfDrawnScore = 6000;
                        PlayerSelfDrawnScore = 2000;
                    }
                    if (Fu == 70) {
                        chunkScore = 6800;
                        SelfDrawnScore = 6900;
                        PlayerSelfDrawnScore = 2300;
                    }
                    if (Fu == 80) {
                        chunkScore = 7700;
                        SelfDrawnScore = 7800;
                        PlayerSelfDrawnScore = 2600;
                    }
                    if (Fu == 90) {
                        chunkScore = 8700;
                        SelfDrawnScore = 8700;
                        PlayerSelfDrawnScore = 2900;
                    }
                    if (Fu == 100) {
                        chunkScore = 9600;
                        SelfDrawnScore = 9600;
                        PlayerSelfDrawnScore = 3200;
                    }
                    if (Fu == 110) {
                        chunkScore = 10600;
                        SelfDrawnScore = 10800;
                        PlayerSelfDrawnScore = 3600;
                    }
                    if (Fan == 3) {
                        if (Fu == 20) {
                            SelfDrawnScore = 3900;
                            PlayerSelfDrawnScore = 1300;
                        }
                        if (Fu == 25) {
                            chunkScore = 4800;
                            SelfDrawnScore = 4800;
                            PlayerSelfDrawnScore = 1600;
                        }
                        if (Fu == 30) {
                            chunkScore = 5800;
                            SelfDrawnScore = 6000;
                            PlayerSelfDrawnScore = 2000;

                        }
                        if (Fu == 40) {
                            chunkScore = 7700;
                            SelfDrawnScore = 7800;
                            PlayerSelfDrawnScore = 2600;
                        }
                        if (Fu == 50) {
                            chunkScore = 9600;
                            SelfDrawnScore = 9600;
                            PlayerSelfDrawnScore = 3200;
                        }
                        if (Fu == 60) {
                            chunkScore = 11600;
                            SelfDrawnScore = 7800;
                            PlayerSelfDrawnScore = 3900;
                        }
                        if (Fu >= 70) {
                            ManGan = "滿貫";
                            chunkScore = 12000;
                            SelfDrawnScore = 12000;
                            PlayerSelfDrawnScore = 4000;
                        }
                    }
                    if (Fan == 4) {
                        if (Fu == 20) {
                            SelfDrawnScore = 7800;
                            PlayerSelfDrawnScore = 2600;
                        }
                        if (Fu == 25) {
                            chunkScore = 9600;
                            SelfDrawnScore = 9600;
                            PlayerSelfDrawnScore = 3200;
                        }
                        if (Fu == 30) {
                            chunkScore = 11600;
                            SelfDrawnScore = 11700;
                            PlayerSelfDrawnScore = 3900;
                        }
                        if (Fu >= 40) {
                            ManGan = "滿貫";
                            chunkScore = 12000;
                            SelfDrawnScore = 12000;
                            PlayerSelfDrawnScore = 4000;
                        }
                    }
                    if (Fan == 5) {
                        ManGan = "滿貫";
                        chunkScore = 12000;
                        SelfDrawnScore = 12000;
                        PlayerSelfDrawnScore = 4000;
                    }
                    if (Fan == 6 || Fan == 7) {
                        ManGan = "跳滿";
                        chunkScore = 18000;
                        SelfDrawnScore = 18000;
                        PlayerSelfDrawnScore = 6000;
                    }
                    if (Fan >= 8 && Fan <= 10) {
                        ManGan = "倍滿";
                        chunkScore = 24000;
                        SelfDrawnScore = 24000;
                        PlayerSelfDrawnScore = 8000;
                    }
                    if (Fan == 11 || Fan == 12) {
                        ManGan = "三倍滿";
                        chunkScore = 36000;
                        SelfDrawnScore = 36000;
                        PlayerSelfDrawnScore = 12000;
                    }
                    if (Fan >= 13) {
                        ManGan = "累積役滿";
                        chunkScore = 48000;
                        SelfDrawnScore = 48000;
                        PlayerSelfDrawnScore = 16000;
                    }
                }
            }
            if (idHome == 1 && idPeople == 1) {
                //這是四麻閒家

            }
            output.setText(ManGan+
                    "\n總自摸得分: "+SelfDrawnScore +
                    "\n放槍得分: "+chunkScore+
                    "\n自摸閒家給分"+PlayerSelfDrawnScore +
                    "\n自摸親家給分:"+DealerSeifDrawnScore);
        }
    }
}