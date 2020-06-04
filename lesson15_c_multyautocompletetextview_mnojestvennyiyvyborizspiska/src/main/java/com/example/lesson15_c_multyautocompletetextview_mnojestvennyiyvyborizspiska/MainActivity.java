package com.example.lesson15_c_multyautocompletetextview_mnojestvennyiyvyborizspiska;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    String [] cities = {"Москва", "Самара", "Вологда", "Волгоград", "Воронеж"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Получаем ссылку элемента AutoCompleteTextView в разметке

        MultiAutoCompleteTextView autoCompleteTextView =
                (MultiAutoCompleteTextView) findViewById(R.id.auto_complete);

        // Создаем адаптер для автозаполнения элемента AutoCompleteTextView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item, cities);
        autoCompleteTextView.setAdapter(adapter);

        // Установка запятой в качестве разделителя
        autoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
