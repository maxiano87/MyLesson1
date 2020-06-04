package com.example.lesson4_g;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* RelativeLayout relativeLayout = new RelativeLayout(this);
        EditText editText = new EditText(this);

        // Метод generateViewId(); позволяет программно сгенерировать
        // id для элемента управления
        editText.setId(EditText.generateViewId());

        Button button = new Button(this);
        button.setText("Send");

        // Устанавливаем параметры положения для EditText
        RelativeLayout.LayoutParams buttonParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        editTextParams.addRule(RelativeLayout.CENTER_IN_PARENT);
        relativeLayout.addView(editText,editTextParams);

        buttonParams.addRule(RelativeLayout.BELOW,editText.getId());
        buttonParams.addRule(RelativeLayout.ALIGN_RIGHT,editText.getId());
        relativeLayout.addView(button, buttonParams);

        setContentView(relativeLayout);*/

        RelativeLayout relativeLayout = new RelativeLayout(this);
        EditText editText = new EditText(this);

        //метод generateViewId(); позволяет программно сгенерировать
        //id для элемента управления
        editText.setId(EditText.generateViewId());

        Button button = new Button(this);
        button.setText("Send");

        // устанавливаем параметры положения для EditText
        RelativeLayout.LayoutParams editTextParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        editTextParams.addRule(RelativeLayout.CENTER_IN_PARENT);
        relativeLayout.addView(editText, editTextParams);

        // устанавливаем параметры положения для Button
        RelativeLayout.LayoutParams buttonParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        buttonParams.addRule(RelativeLayout.BELOW, editText.getId());
        buttonParams.addRule(RelativeLayout.ALIGN_RIGHT, editText.getId());
        relativeLayout.addView(button, buttonParams);

        setContentView(relativeLayout);


    }
}
