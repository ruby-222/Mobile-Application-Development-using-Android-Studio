package com.example.circularprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProgressBar pgb=findViewById(R.id.pgb1);
        Button start=findViewById(R.id.btn1);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pgb.setVisibility(1);
            }
        });
    }
}