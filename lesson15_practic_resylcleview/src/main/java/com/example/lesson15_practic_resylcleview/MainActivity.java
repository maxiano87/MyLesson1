package com.example.lesson15_practic_resylcleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Метод findViewById позволяет получить ссылку на View активити,
        // которая размещена в разметке, через его идентификатор.
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        // LayoutManager отвечает за позиционирование view - компонентов в
        // RecylclerView, а также за определение того, когда следует переиспользовать
        // view - компоненты , которые больше не видныпользователю.

        // recelclerView.setLayoutManager ( new LinearLayoutManager(this));
        // recyclerView.setLayoutManager(new LinearLayoutManager(this,
               // LinearLayoutManager.HORIZONTAL,false));
         recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        // recyclerView.setLayoutManager(new GridLayoutManager(this, 3,
               // GridLayoutManager.HORIZONTAL, false ));

        // recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, 1));

        // Создаем новый экземпляр класса CarAdapter и передаем ему созданный список

        ArrayList <Car> cars = new ArrayList<>();
        cars.add(new Car(R.drawable.audi, "Audi"));
        cars.add(new Car(R.drawable.bmw,"BMW"));
        cars.add(new Car(R.drawable.lada,"Lada"));
        cars.add(new Car(R.drawable.toyota,"Toyota"));
        cars.add(new Car(R.drawable.lada,"Lada"));
        cars.add(new Car(R.drawable.audi, "Audi"));
        cars.add(new Car(R.drawable.bmw,"BMW"));
        cars.add(new Car(R.drawable.lada,"Lada"));
        cars.add(new Car(R.drawable.audi, "Audi"));
        cars.add(new Car(R.drawable.bmw,"BMW"));
        cars.add(new Car(R.drawable.lada,"Lada"));
        cars.add(new Car(R.drawable.toyota,"Toyota"));
        cars.add(new Car(R.drawable.audi, "Audi"));
        cars.add(new Car(R.drawable.bmw,"BMW"));
        cars.add(new Car(R.drawable.lada,"Lada"));
        cars.add(new Car(R.drawable.toyota,"Toyota"));
        cars.add(new Car(R.drawable.audi, "Audi"));
        cars.add(new Car(R.drawable.bmw,"BMW"));
        cars.add(new Car(R.drawable.lada,"Lada"));
        cars.add(new Car(R.drawable.toyota,"Toyota"));
        cars.add(new Car(R.drawable.audi, "Audi"));
        cars.add(new Car(R.drawable.bmw,"BMW"));
        cars.add(new Car(R.drawable.lada,"Lada"));
        cars.add(new Car(R.drawable.toyota,"Toyota"));

        // Инициализируем и используем адаптер,
        // вызывая в конструктор адаптера созданный список
        CarAdapter carAdapter = new CarAdapter(cars);

        // Отдаем адаптер методу setAdapter нашего RecylclerView;
        recyclerView.setAdapter(carAdapter);

     }
}
