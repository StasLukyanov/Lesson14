package com.example.AppTaskFirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Riddles extends AppCompatActivity {
    TextView tvRiddle, tvAnswer;
    EditText edAnswer;
    Button btnOk;
    Button btnNewRiddle;
    int counter = 0;
    String riddle0 = "Не огонь,а жжется.";
    String riddle1 = "Красна девица сидит в темнице,а коса на улице.";
    String riddle2 = "Жидкое, а не вода, белое, а не снег.";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riddles);
        tvRiddle = findViewById(R.id.tvRiddle);
        edAnswer = findViewById(R.id.edAnswer);
        tvAnswer = findViewById(R.id.tvAnswer);
        btnOk = findViewById(R.id.btnOk);
        btnNewRiddle = findViewById(R.id.btnNewRiddle);
    }

    public void onClickOk(View view) {
        String txt0 = "крапива";
        String txt1 = "морковь";
        String txt2 = "молоко";

        switch (counter) {
            case 0:
                if (edAnswer.getText().toString().equals(txt0)) {
                    tvAnswer.setText("Верно!");
                } else tvAnswer.setText("НЕ верно!");
                break;
            case 1:
                if (edAnswer.getText().toString().equals(txt1)) {
                    tvAnswer.setText("Верно!");
                } else tvAnswer.setText("НЕ верно!");
                break;
            case 2:
                if (edAnswer.getText().toString().equals(txt2)) {
                    tvAnswer.setText("Верно!");
                } else tvAnswer.setText("НЕ верно!");
                break;
        }


    }

    public void onClickNewRiddle(View view) {
        Random random = new Random();
        switch (random.nextInt(3)) {
            case 0:
                tvRiddle.setText(riddle0);
                counter = 0;
                break;
            case 1:
                tvRiddle.setText(riddle1);
                counter = 1;
                break;
            case 2:
                tvRiddle.setText(riddle2);
                counter = 2;
                break;

        }

    }
}