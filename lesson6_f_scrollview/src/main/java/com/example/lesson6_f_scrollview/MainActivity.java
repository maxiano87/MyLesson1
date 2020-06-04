package com.example.lesson6_f_scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScrollView scrollView = new ScrollView(this);

        TextView textView1 = new TextView(this);
        textView1.setText("Loren Ipsum is simply dummy text" +
                "of the printing adn typesetting industry..." +
                "Like Aldus PageMaker including versions of Lorem Ipsum.");
        textView1.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        textView1.setTextSize(26);
        scrollView.addView(textView1);
        setContentView(scrollView);
    }
}
