package com.example.lesson14_c_withbutton;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android_lesson_14_c_withbuttons.ProductAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<Product> products = new ArrayList<>();
    ListView productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (products.size() == 0) {
            products.add(new Product("Картофель", "кг."));
            products.add(new Product("Чай", "шт."));
            products.add(new Product("Яйца", "шт."));
            products.add(new Product("Молоко", "л."));
            products.add(new Product("Макороны", "кг."));
        }
        productList = (ListView) findViewById(R.id.product_list);
        com.example.android_lesson_14_c_withbuttons.ProductAdapter adapter =
                new ProductAdapter(this,R.layout.list_item, products);
        productList.setAdapter(adapter);
    }
}
