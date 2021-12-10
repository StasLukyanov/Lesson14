package com.example.AppTaskFirst

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.AppTaskFirst.R
import android.widget.Toast

class Calculator : AppCompatActivity() {
    var txSolution: EditText? = null
    var edFirstNumber: EditText? = null
    var edSecondNumber: EditText? = null
    var btnSum: Button? = null
    var btnDifference: Button? = null
    var btnMultiplication: Button? = null
    var btnDivision: Button? = null
    var num1: String? = null
    var num2: String? = null
    var number1 = 0
    var number2 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        txSolution = findViewById(R.id.txSolution)
        edFirstNumber = findViewById(R.id.edFirstNumber)
        edSecondNumber = findViewById(R.id.edSecondNumber)
        btnSum = findViewById(R.id.btnSum)
        btnDifference = findViewById(R.id.btnDifference)
        btnMultiplication = findViewById(R.id.btnMultiplication)
        btnDivision = findViewById(R.id.btnDivision)
    }


    fun onClickMath(view: View?) {
        view as Button
        var div = 0
        if (edFirstNumber!!.text.toString() != "") {
            num1 = edFirstNumber!!.text.toString()
            number1 = Integer.valueOf(num1)
        } else number1 = 0
        if (edSecondNumber!!.text.toString() != "") {
            num2 = edSecondNumber!!.text.toString()
            number2 = Integer.valueOf(num2)
        } else number2 = 0
        if (number1 < 1000000 && number2 < 1000000) {
            when(view?.id) {
             R.id.btnDivision->   div = number1 / number2
             R.id.btnMultiplication->   div = number1 * number2
             R.id.btnSum->   div = number1 + number2
             R.id.btnDifference->   div = number1 - number2
            }

        } else Toast.makeText(this@Calculator, "Не допустимое число!", Toast.LENGTH_LONG).show()
        txSolution!!.setText(div.toString())
    }
}