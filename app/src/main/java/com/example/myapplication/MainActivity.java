package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalendarView calendarView = (CalendarView) findViewById(R.id.calendarview);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                // todo
                Toast.makeText(getApplicationContext(), "버튼이 눌렸습니다!", Toast.LENGTH_SHORT).show();

                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText(String.valueOf(year) + "-" +
                        String.valueOf(month) + "-" +
                        String.valueOf(dayOfMonth));
            }
        });
    }
}