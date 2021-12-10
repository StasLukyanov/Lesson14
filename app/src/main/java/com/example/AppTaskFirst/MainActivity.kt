package com.example.AppTaskFirst

import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.EditText
import android.os.Bundle
import android.view.View
import com.example.AppTaskFirst.R

class MainActivity : AppCompatActivity() {
    var textView: TextView? = null
    var editText: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.fignya)
        editText = findViewById(R.id.editTextText)
    }

    fun onBtnClick(view: View?) {
        val str = editText!!.text.toString()
        var srti = ""
        textView!!.text = "Молодец!!!"
        val chrus = str.toCharArray()
        for (i in chrus.indices) {
            if (chrus[i] == 'a' || chrus[i] == 'A' || chrus[i] == 'а' || chrus[i] == 'А') {
                chrus[i] = 'o'
            }
            srti = srti + chrus[i]
        }
        editText!!.setText(srti)
    }
}