package com.example.AppTaskFirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {

    EditText txSolution;
    EditText edFirstNumber, edSecondNumber;
    Button btnSum, btnDifference, btnMultiplication, btnDivision;
    String num1;
    String num2;
    int number1 = 0;
    int number2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        txSolution = findViewById(R.id.txSolution);
        edFirstNumber = findViewById(R.id.edFirstNumber);
        edSecondNumber = findViewById(R.id.edSecondNumber);
        btnSum = findViewById(R.id.btnSum);
        btnDifference = findViewById(R.id.btnDifference);
        btnMultiplication = findViewById(R.id.btnMultiplication);
        btnDivision = findViewById(R.id.btnDivision);

    }

    public void onClickSum(View view) {
        int sum = 0;
        if (!edFirstNumber.getText().toString().equals("")) {
            num1 = edFirstNumber.getText().toString();
            number1 = Integer.valueOf(num1);
        } else number1 = 0;

        if (!edSecondNumber.getText().toString().equals("")) {
            num2 = edSecondNumber.getText().toString();
            number2 = Integer.valueOf(num2);
        } else number2 = 0;
        if (number1 < 1000000 && number2 < 1000000) {
            sum = number1 + number2;
        } else Toast.makeText(Calculator.this, "Не допустимое число!", Toast.LENGTH_LONG).show();


        txSolution.setText(String.valueOf(sum));
    }

    public void onClickDifference(View view) {
        int dif = 0;
        if (!edFirstNumber.getText().toString().equals("")) {
            num1 = edFirstNumber.getText().toString();
            number1 = Integer.valueOf(num1);
        } else number1 = 0;

        if (!edSecondNumber.getText().toString().equals("")) {
            num2 = edSecondNumber.getText().toString();
            number2 = Integer.valueOf(num2);
        } else number2 = 0;
        if (number1 < 1000000 && number2 < 1000000) {
            dif = number1 - number2;
        } else Toast.makeText(Calculator.this, "Не допустимое число!", Toast.LENGTH_LONG).show();


        txSolution.setText(String.valueOf(dif));
    }

    public void onClickMultiplication(View view) {
        int mult = 0;
        if (!edFirstNumber.getText().toString().equals("")) {
            num1 = edFirstNumber.getText().toString();
            number1 = Integer.valueOf(num1);
        } else number1 = 0;

        if (!edSecondNumber.getText().toString().equals("")) {
            num2 = edSecondNumber.getText().toString();
            number2 = Integer.valueOf(num2);
        } else number2 = 0;
        if (number1 < 1000000 && number2 < 1000000) {
            mult = number1 * number2;
        } else Toast.makeText(Calculator.this, "Не допустимое число!", Toast.LENGTH_LONG).show();


        txSolution.setText(String.valueOf(mult));
    }

    public void onClickDivision(View view) {
        int div = 0;
        if (!edFirstNumber.getText().toString().equals("")) {
            num1 = edFirstNumber.getText().toString();
            number1 = Integer.valueOf(num1);
        } else number1 = 0;

        if (!edSecondNumber.getText().toString().equals("")) {
            num2 = edSecondNumber.getText().toString();
            number2 = Integer.valueOf(num2);
        } else number2 = 0;
        if (number1 < 1000000 && number2 < 1000000) {
            div = number1 / number2;
        } else Toast.makeText(Calculator.this, "Не допустимое число!", Toast.LENGTH_LONG).show();


        txSolution.setText(String.valueOf(div));
    }

}