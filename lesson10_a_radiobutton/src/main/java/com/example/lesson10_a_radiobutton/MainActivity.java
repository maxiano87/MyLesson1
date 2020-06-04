package com.example.lesson10_a_radiobutton;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onRadioButtonClicked(View view) {
        // Если переключатель отмечен
        boolean checked = ((RadioButton) view).isChecked();
        TextView selection = (TextView) findViewById(R.id.selection);
        // Получаем нажатый переключатель
        switch (view.getId()) {
            case R.id.java:
                if (checked) {
                    selection.setText("Выбран Java");
                }
                break;
            case R.id.javascript:
                if (checked) {
                    selection.setText("Выбран Javascript");
                }
                break;
        }
    }
}
