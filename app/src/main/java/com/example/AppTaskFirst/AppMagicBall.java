package com.example.AppTaskFirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class AppMagicBall extends AppCompatActivity {
    TextView tvAnswer;
    EditText edQuestion;
    Button btnAnswer;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_magic_ball);
        tvAnswer = findViewById(R.id.tvAnswer);
        edQuestion = findViewById(R.id.edQuestion);
        btnAnswer = findViewById(R.id.btnAnswer);
        imageView = findViewById(R.id.imageView);

    }

    public void onClickMB(View view) {
        Random random = new Random();
        int counter = random.nextInt(7);
        switch (counter) {
            case 0:
                tvAnswer.setText("Да");
                imageView.setImageResource(R.drawable.img);
                break;
            case 1:
                tvAnswer.setText("Нет");
                imageView.setImageResource(R.drawable.img_1);
                break;
            case 2:
                tvAnswer.setText("Скорее всего да");
                imageView.setImageResource(R.drawable.img_5);
                break;
            case 3:
                tvAnswer.setText("Скорее всего нет");
                imageView.setImageResource(R.drawable.img_6);
                break;
            case 4:
                tvAnswer.setText("Возможно");
                imageView.setImageResource(R.drawable.img_2);
                break;
            case 5:
                tvAnswer.setText("Имеются перспективы");
                imageView.setImageResource(R.drawable.img_3);
                break;
            case 6:
                tvAnswer.setText("Вопрос задан неверно");
                imageView.setImageResource(R.drawable.img_4);
                break;
        }

    }
}
