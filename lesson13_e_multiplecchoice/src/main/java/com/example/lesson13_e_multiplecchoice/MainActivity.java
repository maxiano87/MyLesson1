package com.example.lesson13_e_multiplecchoice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String [] countries = {"Brazil", "Argentina", "Colombia", "Chile", "Uruguai"};
    private TextView selection;
    ListView countriesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Получаем элемент Textview
        selection = (TextView) findViewById(R.id.selection);

        // Получаем элемент ListView
        countriesList = (ListView) findViewById(R.id.countries_list);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.select_dialog_multichoice, countries);

        //Устанавливаем для списка адаптер
        countriesList.setAdapter(adapter);

        // Добавляем для списка слушатель
        countriesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SparseBooleanArray sp = countriesList.getCheckedItemPositions();

                String selectedItems = "\0\0";
                for (int i = 0; i < countries.length; i++) {
                    if (sp.get(i)) selectedItems += countries[i] + ",";
                }

                // Установка текста элемента TextView
                selection.setText("Выбрано " + selectedItems.substring(0, selectedItems.length()-1));
            }
        });
    }
}
