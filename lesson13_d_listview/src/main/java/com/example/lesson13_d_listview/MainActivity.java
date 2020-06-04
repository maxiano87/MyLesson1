package com.example.lesson13_d_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String [] countries = {"Brazil", "Argentina", "Colombia", "Chile", "Uruguai"};
    private TextView selection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Получаем элемент TextView
        selection = (TextView) findViewById(R.id.selection);

        //Получаем элемент ListView
        final ListView countriesList = (ListView) findViewById(R.id.countries_list);

        //Создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, countries);

        // Устанавливаем для списка адаптер
        countriesList.setAdapter(adapter);

        // Добавляем для списка слушатель
        countriesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // По позиции получаем выбранный элемент
                String selectedItem = countries[position];

                // Установка текста элемента TextView
                selection.setText(selectedItem);
            }
        });

    }
}
