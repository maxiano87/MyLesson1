package com.example.lesson14_a_arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // набор данных, которые свяжем со списком
    String [] countries = {"Brasil", "Argentina", "Colombia", "Chile", "Uruguai"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // получаем элемент ListView
        ListView countriesList = (ListView) findViewById(R.id.countries_list);

        //Создаем адаптер
        ArrayAdapter <String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, countries);

        // Устанавливаем для списка адаптер
        countriesList.setAdapter(adapter);
    }
}
