package com.example.lesson9_c_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*public void onCheckboxClicked(View view) {
        //Получаем флажок
        CheckBox language = (CheckBox) view;
        // Получаем, от1мечен ли данный флажок
        boolean checked = language.isChecked();

        TextView selection = (TextView) findViewById(R.id.selection);
        // Смотрим какой именно из флажков отмечен

        switch (view.getId()) {
            case R.id.java:
                if (checked) {
                    selection.setText("Java");
                }
                break;
            case R.id.javascript:
                if (checked)
                    selection.setText("Javascript");
                break;
        }*/

    public void onCheckboxClicked (View view) {
        //Получаем флажок
        CheckBox languege = (CheckBox) view;
        // Получаем отмечен ли флажок
        TextView selection = (TextView) findViewById(R.id.selection);
                if(languege.isChecked())
                    selection.setText(languege.getText());
    }
}
