package com.example.lesson3_e;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.lesson3_e.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout relativeLayout = new RelativeLayout(this);
        TextView textView =new TextView(this);
        textView.setBackgroundColor(0xFFBDBDBD);
        textView.setText("Hello Maxiano!");
        textView.setTextSize(26);
        textView.setGravity(Gravity.CENTER);
        textView.setBackgroundColor(Color.parseColor("#FF0000"));

        RelativeLayout.LayoutParams layoutParams =
                new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 200);

        // Установка внешних отступов
        layoutParams.setMargins(30,40,50,60);
        // Устанавливаем размеры
        textView.setLayoutParams (layoutParams);
        //Установка внутренних отступов
        textView.setPadding(30,30,30,30);

        // добавляем TextView в RelativeLayout
        relativeLayout.addView(textView);
        setContentView(relativeLayout);
    }
}
