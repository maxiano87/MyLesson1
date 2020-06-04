package com.example.lesson11_e_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activty);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView ageView = (TextView) findViewById(R.id.age_view);
            String age = extras.getString(MainActivity.AGE_KEY);
            ageView.setText("Возраст: " + age);
        }
    }

    public void onCanceledClick(View view) {
        setResult(RESULT_CANCELED);
        finish();
    }

    public void onButton1Click(View view) {
        sendMessage("Доступ разрешен");
    }

    public void onButton2Click(View view) {
        sendMessage("Доступ разрешен");
    }

    public void onButton3Click(View view) {
        sendMessage("Недопустимый метод");
    }

    private void sendMessage(String message) {

        Intent data = new Intent();
        data.putExtra(MainActivity.ACCES_MESSAGE, message);
        setResult(RESULT_OK, data);
        finish();
    }
}
