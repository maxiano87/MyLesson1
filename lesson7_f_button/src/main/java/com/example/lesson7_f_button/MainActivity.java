package com.example.lesson7_f_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        // Обработка нажатия кнопки

        public void sendMessage(View view){
            TextView textView = (TextView) findViewById(R.id.text_view);
            EditText editText = (EditText) findViewById(R.id.edit_text);
            textView.setText("Добро пожаловать, " + editText.getText());
    }
}
