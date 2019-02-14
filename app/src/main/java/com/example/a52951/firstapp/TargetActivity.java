package com.example.a52951.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {
    TextView myTextView;
    Intent currentIntent;
    String myIntentVar;
    int myIntegerVar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        currentIntent = getIntent();
        myIntentVar = currentIntent.getStringExtra("stringToSend");
        myIntegerVar = currentIntent.getIntExtra("myInteger",0);

        myTextView = findViewById(R.id.textView);
        myTextView.setText(myIntentVar);


    }
}
