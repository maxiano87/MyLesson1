package com.example.lesson10_b_radiobutton;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Получаем объект RadioGroup
        RadioGroup radGrp = (RadioGroup) findViewById(R.id.radios);
        // Обработка переключения состояния переключателя
        radGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup arg0, int id) {
                TextView selection = (TextView) findViewById(R.id.selection);
                switch (id) {
                    case R.id.java:
                        selection.setText("Выбран Java");
                        break;
                    case R.id.javascript:
                        selection.setText("Выбран Javascript");
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
