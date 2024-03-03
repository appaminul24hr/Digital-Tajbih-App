package com.aisoft.digitaltajbihapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    TextView tvDisplay;
    Button addButton;
    Button subButton;
    Button resetButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find
        tvDisplay = findViewById(R.id.tvDisplay);
        addButton = findViewById(R.id.addButton);
        subButton = findViewById(R.id.subButton);
        resetButton = findViewById(R.id.resetButton);


        //setOnClickListener add button
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count++;
                tvDisplay.setText(""+count);

            }
        });


        //setOnClickListener sub button
        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                tvDisplay.setText(""+count);

            }
        });


        //setOnClickListener reset button
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                tvDisplay.setText(""+count);

            }
        });


    }
}