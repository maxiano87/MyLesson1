package com.example.lesson9_d_checkbox;

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

    public void onCheckboxClicked (View view) {

        // Получаем флажки
        CheckBox java = (CheckBox) findViewById(R.id.java);
        CheckBox javascript = (CheckBox) findViewById(R.id.javascript);
        String selectedItems = "";
        if (java.isChecked())
            selectedItems += java.getText() + ", ";
        if (javascript.isChecked())
            selectedItems += javascript.getText();

        TextView selection = (TextView) findViewById(R.id.selection);
        selection.setText(selectedItems);
    }
}
