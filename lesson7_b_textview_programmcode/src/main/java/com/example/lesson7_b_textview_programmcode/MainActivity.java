package com.example.lesson7_b_textview_programmcode;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = new LinearLayout(this);
        TextView textView = new TextView(this);


        // Установка фонового цвета
        textView.setBackgroundColor(0xffe8eaf6);
        // Установка цвета текста
        textView.setTextColor(0xff5c6bc0);
        //Делаем все буквы заглавными
        textView.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        //Устанавливаем текст
        textView.setText("Hello World!");
        // Установка шрифта
        textView.setTypeface(Typeface.create("casual",Typeface.NORMAL));
        //Устанавливаем высоту текста
        textView.setTextSize(26);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);


        // Установка внешних отступов
        layoutParams.setMargins(20,20,20,20);

        //Устанавливаем размеры
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        setContentView(linearLayout);
    }
}
