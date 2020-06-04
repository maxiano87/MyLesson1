package com.example.lesson10_c_datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView dateDefault = (TextView) findViewById(R.id.dateDefault);

        DatePicker dp = (DatePicker) this.findViewById(R.id.datePicker);

        // Месяц начиная с нуля. Для отоброжения добавляем 1.
        dateDefault.setText("Дата по умолчанию " + dp.getDayOfMonth() + "/" +
                (dp.getMonth() + 1) + "/" + dp.getYear());

        dp.init(2020,00,11,null);
    }
}
