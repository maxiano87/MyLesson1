package com.example.lesson11_e_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    static final String AGE_KEY = "AGE";
    static final String ACCES_MESSAGE = "ACCES_MESSAGE";
    private static final int REQUEST_ACCES_TYPE = 1;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text_view);
    }

    public void onClick (View view) {
        //Получаем введенный возраст
        EditText ageBox = (EditText) findViewById(R.id.age_box);
        String age = ageBox.getText().toString();

        Intent intent = new Intent(this,SecondActivty.class);
        intent.putExtra(AGE_KEY, age);
        startActivityForResult(intent,REQUEST_ACCES_TYPE);
    }

    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data){
        if (requestCode == REQUEST_ACCES_TYPE) {
            if(resultCode == RESULT_OK) {
                String accesMessage = data.getStringExtra(ACCES_MESSAGE);
                textView.setText("Ошибка доступа");
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}
