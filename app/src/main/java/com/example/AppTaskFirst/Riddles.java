package com.example.AppTaskFirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Riddles extends AppCompatActivity {
    TextView tvRiddle, tvAnswer;
    EditText edAnswer;
    int counter =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riddles);
        tvRiddle = findViewById(R.id.tvRiddle);
        edAnswer = findViewById(R.id.edAnswer);
        tvAnswer = findViewById(R.id.tvAnswer);
    }
    public void onClickRiddles(View view){
        String txt1 = "Крапива";
        String txt2 = "Морковь";
        String txt3 = "Молоко";

        switch (counter){
            case 1:
                if(edAnswer.getText().toString().equals(txt1)){
                    tvAnswer.setText("Верно!");
                }else{
                    tvAnswer.setText("Не верно!");
                }
        }



    }
}