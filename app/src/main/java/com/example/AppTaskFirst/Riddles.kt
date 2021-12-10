package com.example.AppTaskFirst

import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.EditText
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.AppTaskFirst.R
import java.util.*

class Riddles : AppCompatActivity() {
    var tvRiddle: TextView? = null
    var tvAnswer: TextView? = null
    var edAnswer: EditText? = null
    var btnOk: Button? = null
    var btnNewRiddle: Button? = null
    var counter = 0
    var riddle0 = "Не огонь,а жжется."
    var riddle1 = "Красна девица сидит в темнице,а коса на улице."
    var riddle2 = "Жидкое, а не вода, белое, а не снег."
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riddles)
        tvRiddle = findViewById(R.id.tvRiddle)
        edAnswer = findViewById(R.id.edAnswer)
        tvAnswer = findViewById(R.id.tvAnswer)
        btnOk = findViewById(R.id.btnOk)
        btnNewRiddle = findViewById(R.id.btnNewRiddle)
    }

    fun onClickOk(view: View?) {
        val txt0 = "крапива"
        val txt1 = "морковь"
        val txt2 = "молоко"
        when (counter) {
            0 -> vernoNeVerno(txt0)
            1 -> vernoNeVerno(txt1)
            2 -> vernoNeVerno(txt2)
        }
    }

    fun onClickNewRiddle(view: View?) {
        val random = Random()
        when (random.nextInt(3)) {
            0 -> {
                tvRiddle!!.text = riddle0
                counter = 0
            }
            1 -> {
                tvRiddle!!.text = riddle1
                counter = 1
            }
            2 -> {
                tvRiddle!!.text = riddle2
                counter = 2
            }
        }
    }
    fun vernoNeVerno(txt:String){
        if (edAnswer!!.text.toString() == txt) {
            tvAnswer!!.text = "Верно!"
        } else tvAnswer!!.text = "НЕ верно!"

    }
}