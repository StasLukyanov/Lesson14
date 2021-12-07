package com.example.AppTaskFirst;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BossApp extends AppCompatActivity {
    ConstraintLayout cl;
    Button btnMB;
    Button button;
    Button btmRiddles;
    Button btnCalculator;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boss_app);
        cl = findViewById(R.id.cl);
        btnMB = findViewById(R.id.btnMB);
        button = findViewById(R.id.button);
        btmRiddles = findViewById(R.id.btmRiddles);
        btnCalculator = findViewById(R.id.btnCalculator);
        btnMB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cl.setBackgroundColor(Color.RED);
                btnMB.setBackgroundColor(Color.DKGRAY);
                Intent intent = new Intent(BossApp.this, AppMagicBall.class);
                startActivity(intent);
            }
        });

    }

    public void onClickChanch(View view) {
        cl.setBackgroundColor(Color.GREEN);
        button.setBackgroundColor(Color.DKGRAY);
        Intent intrent = new Intent(BossApp.this, MainActivity.class);
        startActivity(intrent);

    }
    public void onClickRiddles(View v){
        cl.setBackgroundColor(Color.BLACK);
        btmRiddles.setBackgroundColor(Color.DKGRAY);
        Intent intent = new Intent(BossApp.this,Riddles.class);
        startActivity(intent);
    }
    public void onClickCalculator(View v){
        cl.setBackgroundColor(Color.YELLOW);
        btnCalculator.setBackgroundColor(Color.DKGRAY);
        Intent intent = new Intent(BossApp.this,Calculator.class);
        startActivity(intent);
    }

}