package com.example.lesson9_g_togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = new LinearLayout(this);
        ToggleButton toggleButton = new ToggleButton(this);
        toggleButton.setTextOff("Выключено");
        toggleButton.setTextOn("Включено");
        toggleButton.setText("Выключено");
        toggleButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                boolean on = ((ToggleButton) view).isChecked();
                if (on) {

                    Toast.makeText(getApplicationContext(), "Свет включен!",
                            Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Свет выключен!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        linearLayout.addView(toggleButton, new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT));
        setContentView(linearLayout);
    }
}
