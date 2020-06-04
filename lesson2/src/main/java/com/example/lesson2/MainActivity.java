package com.example.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // создание TextView
        TextView textView = new TextView(this);
        // Установка текста в TextView
        textView.setText("Hello Maxiano");
        //Установка высоты текста
        textView.setTextSize(30);
        //установка визуального интерфейса для Activity
        setContentView(textView);
    }
}
