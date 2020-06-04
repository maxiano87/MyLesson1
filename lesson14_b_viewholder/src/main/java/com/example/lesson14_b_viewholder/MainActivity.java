package com.example.lesson14_b_viewholder;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List <State> states = new ArrayList<>();
    ListView countriesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // начальняя иницализация списка
        setInitialData();

        // Получаем элемент ListView
        countriesList = (ListView) findViewById(R.id.countries_list);

        // создаем адаптер
        StateAdapter stateAdapter = new StateAdapter(this,
                R.layout.list_item, states);

        // Устанавливаем адаптер
        countriesList.setAdapter(stateAdapter);

        // слушатель выбора в списке
        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick (AdapterView<?> parent, View view, int position, long id) {
                //Получаем выбранный пункт
                State selectedState = (State) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Был выбран " +
                        selectedState.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        };
        countriesList.setOnItemClickListener(itemListener);
    }

    private void setInitialData () {
        states.add(new State("Бразилия", "Бразилиа", R.drawable.br));
        states.add(new State("Аргентина", "Буэнос_Айрес", R.drawable.ar));
        states.add(new State("Колумбия", "Богота", R.drawable.co));
        states.add(new State("Уругвай", "Монтевидео", R.drawable.uy));
        states.add(new State("Чили", "Сантьяго", R.drawable.cl));
    }
}
