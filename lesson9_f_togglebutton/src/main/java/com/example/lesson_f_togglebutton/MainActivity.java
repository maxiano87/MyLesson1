package com.example.lesson_f_togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onToggleClicked (View view) {
        //Включена ли кнопка
        boolean on = ((ToggleButton) view).isChecked();
        if (on) {
            // действия если включена
            Toast.makeText(this,"Свет включен",
                    Toast.LENGTH_LONG).show();
        } else {
            // действия, если  выключена
            Toast.makeText(this, "Свет выключен!",
                    Toast.LENGTH_LONG).show();
        }
    }
}
