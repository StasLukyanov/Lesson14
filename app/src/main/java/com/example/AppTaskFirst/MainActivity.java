package com.example.AppTaskFirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.fignya);
        editText = findViewById(R.id.editTextText);



    }

    public void onBtnClick(View view) {
        String str = editText.getText().toString();
        String srti = "";
        textView.setText("Молодец!!!");
        char [] chrus = str.toCharArray();
        for(int i =0;i<chrus.length;i++){
            if(chrus[i]== 'a'|| chrus[i]=='A'|| chrus[i]== 'а'|| chrus[i]== 'А'){
                chrus[i]='o';
            }
            srti = srti + chrus[i];
        }
        editText.setText(srti);


    }
}