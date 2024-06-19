package com.example.datepickerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    DatePicker picker;
    Button btGet;
    TextView tw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tw = (TextView)findViewById(R.id.textView1);
        picker=(DatePicker)findViewById(R.id.datePicker1);
        btGet=(Button) findViewById(R.id.button1);
        btGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tw.setText("Selected Date:"+picker.getDayOfMonth()+"/"+picker.getMonth()+"/"+picker.getYear());
            }
        });

    }
}