package com.example.lesson5_c_code;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = new LinearLayout(this);
        TextView textView = new TextView(this);
        textView.setText("Hello World!!!");
        textView.setTextSize(26);
        textView.setBackgroundColor(0xffe8eaf6);


        //Установка gravity
        textView.setGravity(Gravity.CENTER);

        // Установка высоты и ширины
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 200);

        //Установка layout_gravity
        layoutParams.gravity = Gravity.CENTER;

        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        setContentView(linearLayout);

    }
}