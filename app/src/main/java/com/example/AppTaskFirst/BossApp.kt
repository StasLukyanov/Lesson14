package com.example.AppTaskFirst

import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import android.os.Bundle
import com.example.AppTaskFirst.R
import android.content.Intent
import android.graphics.Color
import android.view.View
import android.widget.Button
import com.example.AppTaskFirst.AppMagicBall
import com.example.AppTaskFirst.MainActivity
import com.example.AppTaskFirst.Riddles
import com.example.AppTaskFirst.Calculator

class BossApp : AppCompatActivity() {
    var cl: ConstraintLayout? = null
    var btnMB: Button? = null
    var button: Button? = null
    var btmRiddles: Button? = null
    var btnCalculator: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boss_app)
        cl = findViewById(R.id.cl)
        btnMB = findViewById(R.id.btnMB)
        button = findViewById(R.id.button)
        btmRiddles = findViewById(R.id.btmRiddles)
        btnCalculator = findViewById(R.id.btnCalculator)
        btnMB?.setOnClickListener(View.OnClickListener {
            cl?.setBackgroundColor(Color.RED)
            btnMB?.setBackgroundColor(Color.DKGRAY)
            val intent = Intent(this@BossApp, AppMagicBall::class.java)
            startActivity(intent)
        })
    }

    fun onClickChanch(view: View?) {
        cl!!.setBackgroundColor(Color.GREEN)
        button!!.setBackgroundColor(Color.DKGRAY)
        val intrent = Intent(this@BossApp, MainActivity::class.java)
        startActivity(intrent)
    }

    fun onClickRiddles(v: View?) {
        cl!!.setBackgroundColor(Color.BLACK)
        btmRiddles!!.setBackgroundColor(Color.DKGRAY)
        val intent = Intent(this@BossApp, Riddles::class.java)
        startActivity(intent)
    }

    fun onClickCalculator(v: View?) {
        cl!!.setBackgroundColor(Color.YELLOW)
        btnCalculator!!.setBackgroundColor(Color.DKGRAY)
        val intent = Intent(this@BossApp, Calculator::class.java)
        startActivity(intent)
    }
}