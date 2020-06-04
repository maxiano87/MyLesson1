package com.example.lesson11_c_intant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = new TextView(this);
        textView.setTextSize(20);
        textView.setPadding(16,16,16,16);

        Bundle arguments = getIntent().getExtras();

        if (arguments !=null) {
            String name = arguments.get("name").toString();
            String company = arguments.getString("company");
            int price = arguments.getInt("price");
            textView.setText("Name: " + name + " \nCompany: " + company + "\nPrice: " + price);
        }
        setContentView(textView);
    }
}
