package com.example.lesson10_d_timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView timeDefault = (TextView) findViewById(R.id.timeDefault);

        TimePicker tp = (TimePicker) this.findViewById(R.id.timePicker);
        java.util.Formatter timeF = new java.util.Formatter();
        timeF.format("Время по умолчанию %d:02d",tp.getHour(),tp.getMinute());
        timeDefault.setText(timeF.toString());
        tp.setIs24HourView(true);
        tp.setHour(new Integer(10));
        tp.setMinute(new Integer(10));
    }
}
