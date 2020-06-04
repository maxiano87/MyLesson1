package com.example.lesson15_a_spinner_vypadausheeokno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    String [] cities = {"Бишкек", "Ташкент", "Нур-Султан", "Душанбе", "Москва", "Минск"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.cities);

        // Создаем адаптер ArrayAdapter  с помощью массива строк
        // и стандартной разметки элемента spinner

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, cities);

        //Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //применяем адаптер к элементу spinner
        spinner.setAdapter(adapter);
    }
}
