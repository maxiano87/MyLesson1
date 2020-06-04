package com.example.lesson6_h_include;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int clicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View topButtonPanel = findViewById(R.id.top_button_panel);
        View bottomButtonPanel = findViewById(R.id.bottom_button_panel);
        final TextView clicksText = findViewById(R.id.clicksText);

        Button topButton = topButtonPanel.findViewById(R.id.clickBtn);
        Button bottomButton = bottomButtonPanel.findViewById(R.id.clickBtn);

        topButton.setText("+");
        bottomButton.setText("-");

        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v ) {
                clicks++;
                clicksText.setText(clicks + " Clicks");
            }
        });

        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicks--;
                clicksText.setText(clicks + " Clicks");
            }
        });
    }
}
