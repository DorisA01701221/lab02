package com.example.a52951.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {
    Button btnNewAct;
    EditText myName;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnNewAct = findViewById(R.id.button);
        myName = findViewById(R.id.nameInput);

        btnNewAct.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(FirstActivity.this, TargetActivity.class);

                        text = myName.getText().toString();
                        String send = "hi "+text+" :)";
                        myName.setText("");

                        myIntent.putExtra("stringToSend", send);
                        myIntent.putExtra("myInteger",2);

                        startActivity(myIntent);
                }
        });

    }
}
