package com.example.AppTaskFirst

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.AppTaskFirst.R
import java.util.*

class AppMagicBall : AppCompatActivity() {
    var tvAnswer: TextView? = null
    var edQuestion: EditText? = null
    var btnAnswer: Button? = null
    var imageView: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_magic_ball)
        tvAnswer = findViewById(R.id.tvAnswer)
        edQuestion = findViewById(R.id.edQuestion)
        btnAnswer = findViewById(R.id.btnAnswer)
        imageView = findViewById(R.id.imageView)
    }

    fun onClickMB(view: View?) {
        if (edQuestion?.text.toString()!="") {
            val random = Random()
            val counter = random.nextInt(7)
            when (counter) {
                0 -> {
                    tvAnswer!!.text = "Да"
                    imageView!!.setImageResource(R.drawable.img)
                }
                1 -> {
                    tvAnswer!!.text = "Нет"
                    imageView!!.setImageResource(R.drawable.img_1)
                }
                2 -> {
                    tvAnswer!!.text = "Скорее всего да"
                    imageView!!.setImageResource(R.drawable.img_5)
                }
                3 -> {
                    tvAnswer!!.text = "Скорее всего нет"
                    imageView!!.setImageResource(R.drawable.img_6)
                }
                4 -> {
                    tvAnswer!!.text = "Возможно"
                    imageView!!.setImageResource(R.drawable.img_2)
                }
                5 -> {
                    tvAnswer!!.text = "Имеются перспективы"
                    imageView!!.setImageResource(R.drawable.img_3)
                }
                6 -> {
                    tvAnswer!!.text = "Вопрос задан неверно"
                    imageView!!.setImageResource(R.drawable.img_4)
                }

            }
        }else {
            Toast.makeText(this,"Ты не пройдешь!",Toast.LENGTH_LONG).show()
        }
    }
}
