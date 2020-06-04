package com.example.lesson3_b;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout relativeLayout = new RelativeLayout(this);
        TextView textView =new TextView(this);
        textView.setText("Hello Maxiano!");
        textView.setBackgroundColor(Color.parseColor("#e0e0e0"));
        textView.setTextSize(26);

        // устанавливаем размеры
        textView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                         ViewGroup.LayoutParams.WRAP_CONTENT));
        //Также мы можем передать точные значения  или комбинировать типы значений
        //*textView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,200));*/

        // добавляем TextView в RelativeLayout
        relativeLayout.addView(textView);
        setContentView(relativeLayout);
    }
}
