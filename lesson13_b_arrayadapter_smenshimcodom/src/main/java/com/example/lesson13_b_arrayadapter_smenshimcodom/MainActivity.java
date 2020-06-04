package com.example.lesson13_b_arrayadapter_smenshimcodom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Получаем элемент ListView
        ListView countriesList = (ListView) findViewById(R.id.countries_list);

        // Получаем ресурс
        String [] countries = getResources().getStringArray(R.array.countries);

        // Создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, countries);

        // Устанавливаем для списка адаптер
        countriesList.setAdapter(adapter);
    }
}
