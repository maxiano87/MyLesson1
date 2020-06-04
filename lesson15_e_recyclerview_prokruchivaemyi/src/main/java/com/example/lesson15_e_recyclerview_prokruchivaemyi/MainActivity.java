package com.example.lesson15_e_recyclerview_prokruchivaemyi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Phone> phones = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);

        //Создаем адаптер
        DataAdapter adapter = new DataAdapter(this, phones);

        // Устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        phones.add(new Phone("Huawei P10", "Huawei", R.drawable.mate_8));
        phones.add(new Phone("Elite z3", "HP", R.drawable.lumia950));
        phones.add(new Phone("Galaxy S8", "Samsung", R.drawable.galaxys6));
        phones.add(new Phone("LG G 5", "LG", R.drawable.nexus5x));
    }
}
