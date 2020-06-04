package com.example.lesson18_a_bottom_sheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements BottomSeetsEx.BottomSheetListener {

    TextView mTextView;
    Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.text);
        mBtn = findViewById(R.id.showBtnSheetBtn);
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSeetsEx bottomSeetsEx = new BottomSeetsEx();
                bottomSeetsEx.show(getSupportFragmentManager(),"BottomSheetEx");
            }
        });
    }

    @Override
    public void onOptionClick(String text) {
        mTextView.setText(text);
    }
}
