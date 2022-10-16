package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=findViewById(R.id.btn1);
        ImageView img=findViewById(R.id.image);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                img.setImageResource(R.drawable.tomdaya);

            }
        });
    }
}
