package com.example.c110181149appdev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText FanScore, FuScore ,Sessions;
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
        Sessions = findViewById(R.id.SessionCount);
        output = findViewById(R.id.lblOutput);
    }

    public void BtnClick(View view) {
        String[] Home = getResources().getStringArray(R.array.homeType);
        String[] People = getResources().getStringArray(R.array.PeopleType);

        int idHome = HomeSpinner.getSelectedItemPosition();
        int idPeople = PeopleSpinner.getSelectedItemPosition();

        int Fan = Integer.parseInt(FanScore.getText().toString());
        int Fu = Integer.parseInt(FuScore.getText().toString());
        int Session = Integer.parseInt(Sessions.getText().toString());
        //轉換成整數

        SelfDrawnScore = 0;
        chunkScore = 0;
        PlayerSelfDrawnScore = 0;
        DealerSeifDrawnScore = 0;
        ManGan = "";

        if (idHome == 0 && idPeople == 0) {
            //這是三麻親家
            if (Fan == 1) {
                if (Fu == 30) {
                    chunkScore = 1500;
                    PlayerSelfDrawnScore = 500;

                }
                if (Fu == 40) {
                    chunkScore = 2000;
                    PlayerSelfDrawnScore = 700;
                }
                if (Fu == 50) {
                    chunkScore = 2400;
                    PlayerSelfDrawnScore = 800;
                }
                if (Fu == 60) {
                    chunkScore = 2900;
                    PlayerSelfDrawnScore = 1000;
                }
                if (Fu == 70) {
                    chunkScore = 3400;
                    PlayerSelfDrawnScore = 1200;
                }
                if (Fu == 80) {
                    chunkScore = 3900;
                    PlayerSelfDrawnScore = 1300;
                }
                if (Fu == 90) {
                    chunkScore = 4400;
                    PlayerSelfDrawnScore = 1500;
                }
                if (Fu == 100) {
                    chunkScore = 4800;
                    PlayerSelfDrawnScore = 1600;
                }
                if (Fu == 110) {
                    chunkScore = 5300;
                }
            }
            if (Fan == 2) {
                if (Fu == 20) {;
                    PlayerSelfDrawnScore = 700;
                }
                if (Fu == 25) {
                    chunkScore = 2400;
                }
                if (Fu == 30) {
                    chunkScore = 2900;
                    PlayerSelfDrawnScore = 1000;

                }
                if (Fu == 40) {
                    chunkScore = 3900;
                    PlayerSelfDrawnScore = 1300;
                }
                if (Fu == 50) {
                    chunkScore = 4800;
                    PlayerSelfDrawnScore = 1600;
                }
                if (Fu == 60) {
                    chunkScore = 5800;
                    PlayerSelfDrawnScore = 2000;
                }
                if (Fu == 70) {
                    chunkScore = 6800;
                    PlayerSelfDrawnScore = 2300;
                }
                if (Fu == 80) {
                    chunkScore = 7700;
                    PlayerSelfDrawnScore = 2600;
                }
                if (Fu == 90) {
                    chunkScore = 8700;
                    PlayerSelfDrawnScore = 2900;
                }
                if (Fu == 100) {
                    chunkScore = 9600;
                    PlayerSelfDrawnScore = 3200;
                }
                if (Fu == 110) {
                    chunkScore = 10600;
                    PlayerSelfDrawnScore = 3600;
                }
            }
            if (Fan == 3) {
                if (Fu == 20) {
                    PlayerSelfDrawnScore = 1300;
                }
                if (Fu == 25) {
                    chunkScore = 4800;
                    PlayerSelfDrawnScore = 1600;
                }
                if (Fu == 30) {
                    chunkScore = 5800;
                    PlayerSelfDrawnScore = 2000;
                }
                if (Fu == 40) {
                    chunkScore = 7700;
                    PlayerSelfDrawnScore = 2600;
                }
                if (Fu == 50) {
                    chunkScore = 9600;
                    PlayerSelfDrawnScore = 3200;
                }
                if (Fu == 60) {
                    chunkScore = 11600;
                    PlayerSelfDrawnScore = 3900;
                }
                if (Fu >= 70) {
                    ManGan = "滿貫";
                    chunkScore = 12000;
                    PlayerSelfDrawnScore = 4000;
                }
            }
            if (Fan == 4) {
                if (Fu == 20) {
                    PlayerSelfDrawnScore = 2600;
                }
                if (Fu == 25) {
                    chunkScore = 9600;
                    PlayerSelfDrawnScore = 3200;
                }
                if (Fu == 30) {
                    chunkScore = 11600;
                    PlayerSelfDrawnScore = 3900;
                }
                if (Fu >= 40) {
                    ManGan = "滿貫";
                    chunkScore = 12000;
                    PlayerSelfDrawnScore = 4000;
                }
            }
            if (Fan == 5) {
                ManGan = "滿貫";
                chunkScore = 12000;
                PlayerSelfDrawnScore = 4000;
            }
            if (Fan == 6 || Fan == 7) {
                ManGan = "跳滿";
                chunkScore = 18000;
                PlayerSelfDrawnScore = 6000;
            }
            if (Fan >= 8 && Fan <= 10) {
                ManGan = "倍滿";
                chunkScore = 24000;
                PlayerSelfDrawnScore = 8000;
            }
            if (Fan == 11 || Fan == 12) {
                ManGan = "三倍滿";
                chunkScore = 36000;
                PlayerSelfDrawnScore = 12000;
            }
            if (Fan >= 13) {
                ManGan = "累積役滿";
                chunkScore = 48000;
                PlayerSelfDrawnScore = 16000;
            }
            SelfDrawnScore = PlayerSelfDrawnScore * 2;
        }
        if (idHome == 1 && idPeople == 0) {
            //這是三麻閒家
            if (Fan == 1) {
                if (Fu == 30) {
                    chunkScore = 1000;
                    PlayerSelfDrawnScore = 300;
                    DealerSeifDrawnScore = 500;
                }
                if (Fu == 40) {
                    chunkScore = 1300;
                    PlayerSelfDrawnScore = 400;
                    DealerSeifDrawnScore = 700;
                }
                if (Fu == 50) {
                    chunkScore = 1600;
                    PlayerSelfDrawnScore = 400;
                    DealerSeifDrawnScore = 800;
                }
                if (Fu == 60) {
                    chunkScore = 2000;
                    PlayerSelfDrawnScore = 500;
                    DealerSeifDrawnScore = 1000;
                }
                if (Fu == 70){
                    chunkScore = 2300;
                    PlayerSelfDrawnScore = 600;
                    DealerSeifDrawnScore = 1200;
                }
                if(Fu == 80){
                    chunkScore = 2600;
                    PlayerSelfDrawnScore = 700;
                    DealerSeifDrawnScore = 1300;
                }
                if(Fu == 90){
                    chunkScore = 2900;
                    PlayerSelfDrawnScore = 800;
                    DealerSeifDrawnScore = 1500;
                }
                if(Fu == 100){
                    chunkScore = 3200;
                    PlayerSelfDrawnScore = 800;
                    DealerSeifDrawnScore = 1600;
                }
                if(Fu == 110){
                    chunkScore = 3600;
                }
            }
            if (Fan == 2){
                if(Fu == 20){
                    PlayerSelfDrawnScore = 400;
                    DealerSeifDrawnScore = 700;
                }
                if(Fu == 25){
                    chunkScore = 1600;
                }
                if (Fu == 30) {
                    chunkScore = 2000;
                    PlayerSelfDrawnScore = 500;
                    DealerSeifDrawnScore = 1000;
                }
                if (Fu == 40) {
                    chunkScore = 2600;
                    PlayerSelfDrawnScore = 700;
                    DealerSeifDrawnScore = 1300;
                }
                if (Fu == 50) {
                    chunkScore = 3200;
                    PlayerSelfDrawnScore = 800;
                    DealerSeifDrawnScore = 1600;
                }
                if (Fu == 60) {
                    chunkScore = 3900;
                    PlayerSelfDrawnScore = 1000;
                    DealerSeifDrawnScore = 2000;
                }
                if (Fu == 70){
                    chunkScore = 4500;
                    PlayerSelfDrawnScore = 1200;
                    DealerSeifDrawnScore = 2300;
                }
                if(Fu == 80){
                    chunkScore = 5200;
                    PlayerSelfDrawnScore = 1300;
                    DealerSeifDrawnScore = 2600;
                }
                if(Fu == 90){
                    chunkScore = 5800;
                    PlayerSelfDrawnScore = 1500;
                    DealerSeifDrawnScore = 2900;
                }
                if(Fu == 100){
                    chunkScore = 6400;
                    PlayerSelfDrawnScore = 1600;
                    DealerSeifDrawnScore = 3200;
                }
                if(Fu == 110){
                    chunkScore = 7100;
                    PlayerSelfDrawnScore = 1800;
                    DealerSeifDrawnScore = 3600;
                }
            }
            if(Fan == 3){
                if(Fu == 20){
                    PlayerSelfDrawnScore = 700;
                    DealerSeifDrawnScore = 1300;
                }
                if(Fu == 25){
                    chunkScore = 3200;
                    PlayerSelfDrawnScore = 800;
                    DealerSeifDrawnScore = 1600;
                }
                if(Fu == 30){
                    chunkScore = 3900;
                    PlayerSelfDrawnScore = 1000;
                    DealerSeifDrawnScore = 2000;
                }
                if(Fu == 40){
                    chunkScore = 5200;
                    PlayerSelfDrawnScore = 1300;
                    DealerSeifDrawnScore = 2600;
                }
                if(Fu == 50){
                    chunkScore = 6400;
                    PlayerSelfDrawnScore = 1600;
                    DealerSeifDrawnScore = 3200;
                }
                if(Fu == 60){
                    chunkScore = 7700;
                    PlayerSelfDrawnScore = 2000;
                    DealerSeifDrawnScore = 3900;
                }
                if(Fu >= 70){
                    ManGan = "滿貫";
                    chunkScore = 8000;
                    PlayerSelfDrawnScore = 2000;
                    DealerSeifDrawnScore = 4000;
                }
            }
            if(Fan == 5){
                ManGan = "滿貫";
                chunkScore = 8000;
                PlayerSelfDrawnScore = 2000;
                DealerSeifDrawnScore = 4000;
            }
            if (Fan == 6 || Fan == 7) {
                ManGan = "跳滿";
                chunkScore = 12000;
                PlayerSelfDrawnScore = 3000;
                DealerSeifDrawnScore = 6000;
            }
            if (Fan >= 8 && Fan <= 10) {
                ManGan = "倍滿";
                chunkScore = 16000;
                PlayerSelfDrawnScore = 4000;
                DealerSeifDrawnScore = 8000;
            }
            if (Fan == 11 || Fan == 12) {
                ManGan = "三倍滿";
                chunkScore = 24000;
                PlayerSelfDrawnScore = 6000;
                DealerSeifDrawnScore = 12000;
            }
            if (Fan >= 13) {
                ManGan = "累積役滿";
                chunkScore = 32000;
                PlayerSelfDrawnScore = 8000;
                DealerSeifDrawnScore = 16000;
            }
            SelfDrawnScore = PlayerSelfDrawnScore + DealerSeifDrawnScore;
        }
        if (idHome == 0 && idPeople == 1) {
            //這是四麻親家
            if (Fan == 1) {
                if (Fu == 30) {
                    chunkScore = 1500;
                    PlayerSelfDrawnScore = 500;
                }
                if (Fu == 40) {
                    chunkScore = 2000;
                    PlayerSelfDrawnScore = 700;
                }
                if (Fu == 50) {
                    chunkScore = 2400;
                    PlayerSelfDrawnScore = 800;
                }
                if (Fu == 60) {
                    chunkScore = 2900;
                    PlayerSelfDrawnScore = 1000;
                }
                if (Fu == 70) {
                    chunkScore = 3400;
                    PlayerSelfDrawnScore = 1200;
                }
                if (Fu == 80) {
                    chunkScore = 3900;
                    PlayerSelfDrawnScore = 1300;
                }
                if (Fu == 90) {
                    chunkScore = 4400;
                    PlayerSelfDrawnScore = 1500;
                }
                if (Fu == 100) {
                    chunkScore = 4800;
                    PlayerSelfDrawnScore = 1600;
                }
                if (Fu == 110) {
                    chunkScore = 5300;

                }
            }
            if (Fan == 2) {
                if (Fu == 20) {
                    PlayerSelfDrawnScore = 700;
                }
                if (Fu == 25) {
                    chunkScore = 2400;
                }
                if (Fu == 30) {
                    chunkScore = 2900;
                    PlayerSelfDrawnScore = 1000;
                }
                if (Fu == 40) {
                    chunkScore = 3900;
                    PlayerSelfDrawnScore = 1300;
                }
                if (Fu == 50) {
                    chunkScore = 4800;
                    PlayerSelfDrawnScore = 1600;
                }
                if (Fu == 60) {
                    chunkScore = 5800;
                    PlayerSelfDrawnScore = 2000;
                }
                if (Fu == 70) {
                    chunkScore = 6800;
                    PlayerSelfDrawnScore = 2300;
                }
                if (Fu == 80) {
                    chunkScore = 7700;
                    PlayerSelfDrawnScore = 2600;
                }
                if (Fu == 90) {
                    chunkScore = 8700;
                    PlayerSelfDrawnScore = 2900;
                }
                if (Fu == 100) {
                    chunkScore = 9600;
                    PlayerSelfDrawnScore = 3200;
                }
                if (Fu == 110) {
                    chunkScore = 10600;
                    PlayerSelfDrawnScore = 3600;
                }
            }
            if (Fan == 3) {
                if (Fu == 20) {
                    PlayerSelfDrawnScore = 1300;
                }
                if (Fu == 25) {
                    chunkScore = 4800;
                    PlayerSelfDrawnScore = 1600;
                }
                if (Fu == 30) {
                    chunkScore = 5800;
                    PlayerSelfDrawnScore = 2000;
                }
                if (Fu == 40) {
                    chunkScore = 7700;
                    PlayerSelfDrawnScore = 2600;
                }
                if (Fu == 50) {
                    chunkScore = 9600;
                    PlayerSelfDrawnScore = 3200;
                }
                if (Fu == 60) {
                    chunkScore = 11600;
                    PlayerSelfDrawnScore = 3900;
                }
                if (Fu >= 70) {
                    ManGan = "滿貫";
                    chunkScore = 12000;
                    PlayerSelfDrawnScore = 4000;
                }
            }
            if (Fan == 4) {
                if (Fu == 20) {
                    PlayerSelfDrawnScore = 2600;
                }
                if (Fu == 25) {
                    chunkScore = 9600;
                    PlayerSelfDrawnScore = 3200;
                }
                if (Fu == 30) {
                    chunkScore = 11600;
                    PlayerSelfDrawnScore = 3900;
                }
                if (Fu >= 40) {
                    ManGan = "滿貫";
                    chunkScore = 12000;
                    PlayerSelfDrawnScore = 4000;
                }
            }
            if (Fan == 5) {
                ManGan = "滿貫";
                chunkScore = 12000;
                PlayerSelfDrawnScore = 4000;
            }
            if (Fan == 6 || Fan == 7) {
                ManGan = "跳滿";
                chunkScore = 18000;
                PlayerSelfDrawnScore = 6000;
            }
            if (Fan >= 8 && Fan <= 10) {
                ManGan = "倍滿";
                chunkScore = 24000;
                PlayerSelfDrawnScore = 8000;
            }
            if (Fan == 11 || Fan == 12) {
                ManGan = "三倍滿";
                chunkScore = 36000;
                PlayerSelfDrawnScore = 12000;
            }
            if (Fan >= 13) {
                ManGan = "累積役滿";
                chunkScore = 48000;
                PlayerSelfDrawnScore = 16000;
            }
            SelfDrawnScore = PlayerSelfDrawnScore * 3;
        }
        if (idHome == 1 && idPeople == 1) {
            //這是四麻閒家
            if (Fan == 1) {
                if (Fu == 30) {
                    chunkScore = 1000;
                    PlayerSelfDrawnScore = 300;
                    DealerSeifDrawnScore = 500;
                }
                if (Fu == 40) {
                    chunkScore = 1300;
                    PlayerSelfDrawnScore = 400;
                    DealerSeifDrawnScore = 700;
                }
                if (Fu == 50) {
                    chunkScore = 1600;
                    PlayerSelfDrawnScore = 400;
                    DealerSeifDrawnScore = 800;
                }
                if (Fu == 60) {
                    chunkScore = 2000;
                    PlayerSelfDrawnScore = 500;
                    DealerSeifDrawnScore = 1000;
                }
                if (Fu == 70){
                    chunkScore = 2300;
                    PlayerSelfDrawnScore = 600;
                    DealerSeifDrawnScore = 1200;
                }
                if(Fu == 80){
                    chunkScore = 2600;
                    PlayerSelfDrawnScore = 700;
                    DealerSeifDrawnScore = 1300;
                }
                if(Fu == 90){
                    chunkScore = 2900;
                    PlayerSelfDrawnScore = 800;
                    DealerSeifDrawnScore = 1500;
                }
                if(Fu == 100){
                    chunkScore = 3200;
                    PlayerSelfDrawnScore = 800;
                    DealerSeifDrawnScore = 1600;
                }
                if(Fu == 110){
                    chunkScore = 3600;
                }
            }
            if (Fan == 2){
                if(Fu == 20){
                    PlayerSelfDrawnScore = 400;
                    DealerSeifDrawnScore = 700;
                }
                if(Fu == 25){
                    chunkScore = 1600;
                }
                if (Fu == 30) {
                    chunkScore = 2000;
                    PlayerSelfDrawnScore = 500;
                    DealerSeifDrawnScore = 1000;
                }
                if (Fu == 40) {
                    chunkScore = 2600;
                    PlayerSelfDrawnScore = 700;
                    DealerSeifDrawnScore = 1300;
                }
                if (Fu == 50) {
                    chunkScore = 3200;
                    PlayerSelfDrawnScore = 800;
                    DealerSeifDrawnScore = 1600;
                }
                if (Fu == 60) {
                    chunkScore = 3900;
                    PlayerSelfDrawnScore = 1000;
                    DealerSeifDrawnScore = 2000;
                }
                if (Fu == 70){
                    chunkScore = 4500;
                    PlayerSelfDrawnScore = 1200;
                    DealerSeifDrawnScore = 2300;
                }
                if(Fu == 80){
                    chunkScore = 5200;
                    PlayerSelfDrawnScore = 1300;
                    DealerSeifDrawnScore = 2600;
                }
                if(Fu == 90){
                    chunkScore = 5800;
                    PlayerSelfDrawnScore = 1500;
                    DealerSeifDrawnScore = 2900;
                }
                if(Fu == 100){
                    chunkScore = 6400;
                    PlayerSelfDrawnScore = 1600;
                    DealerSeifDrawnScore = 3200;
                }
                if(Fu == 110){
                    chunkScore = 7100;
                    PlayerSelfDrawnScore = 1800;
                    DealerSeifDrawnScore = 3600;
                }
            }
            if(Fan == 3){
                if(Fu == 20){
                    PlayerSelfDrawnScore = 700;
                    DealerSeifDrawnScore = 1300;
                }
                if(Fu == 25){
                    chunkScore = 3200;
                    PlayerSelfDrawnScore = 800;
                    DealerSeifDrawnScore = 1600;
                }
                if(Fu == 30){
                    chunkScore = 3900;
                    PlayerSelfDrawnScore = 1000;
                    DealerSeifDrawnScore = 2000;
                }
                if(Fu == 40){
                    chunkScore = 5200;
                    PlayerSelfDrawnScore = 1300;
                    DealerSeifDrawnScore = 2600;
                }
                if(Fu == 50){
                    chunkScore = 6400;
                    PlayerSelfDrawnScore = 1600;
                    DealerSeifDrawnScore = 3200;
                }
                if(Fu == 60){
                    chunkScore = 7700;
                    PlayerSelfDrawnScore = 2000;
                    DealerSeifDrawnScore = 3900;
                }
                if(Fu >= 70){
                    ManGan = "滿貫";
                    chunkScore = 8000;
                    PlayerSelfDrawnScore = 2000;
                    DealerSeifDrawnScore = 4000;
                }
            }
            if(Fan == 5){
                ManGan = "滿貫";
                chunkScore = 8000;
                PlayerSelfDrawnScore = 2000;
                DealerSeifDrawnScore = 4000;
            }
            if (Fan == 6 || Fan == 7) {
                ManGan = "跳滿";
                chunkScore = 12000;
                PlayerSelfDrawnScore = 3000;
                DealerSeifDrawnScore = 6000;
            }
            if (Fan >= 8 && Fan <= 10) {
                ManGan = "倍滿";
                chunkScore = 16000;
                PlayerSelfDrawnScore = 4000;
                DealerSeifDrawnScore = 8000;
            }
            if (Fan == 11 || Fan == 12) {
                ManGan = "三倍滿";
                chunkScore = 24000;
                PlayerSelfDrawnScore = 6000;
                DealerSeifDrawnScore = 12000;
            }
            if (Fan >= 13) {
                ManGan = "累積役滿";
                chunkScore = 32000;
                PlayerSelfDrawnScore = 8000;
                DealerSeifDrawnScore = 16000;
            }
            SelfDrawnScore = PlayerSelfDrawnScore * 2 + DealerSeifDrawnScore;
        }
        if(Session > 0){
            if (idPeople == 1){
                if (idHome == 0){
                    chunkScore += (Session * 300);
                    SelfDrawnScore += (Session * 300);
                    PlayerSelfDrawnScore += (Session * 100);
                }
                if (idHome == 1){
                    chunkScore += (Session * 300);
                    SelfDrawnScore += (Session * 300);
                    DealerSeifDrawnScore += (Session * 100);
                    PlayerSelfDrawnScore += (Session * 100);
                }

            }
            if (idPeople == 0) {
                if (idHome == 1){
                    chunkScore += (Session * 200);
                    SelfDrawnScore += (Session * 200);
                    DealerSeifDrawnScore += (Session * 100);
                    PlayerSelfDrawnScore += (Session * 100);
                }
                if (idHome == 0){
                    chunkScore += (Session * 200);
                    SelfDrawnScore += (Session * 200);
                    PlayerSelfDrawnScore += (Session * 100);

                }
            }
        }
        output.setText(ManGan +
                "\n總自摸得分: " + SelfDrawnScore +
                "\n放槍得分: " + chunkScore +
                "\n自摸閒家給分" + PlayerSelfDrawnScore +
                "\n自摸親家給分:" + DealerSeifDrawnScore);
    }
}
