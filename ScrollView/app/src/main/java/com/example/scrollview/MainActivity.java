package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt=findViewById(R.id.txt1);
        StringBuilder msg=new StringBuilder();
        for(int i=0;i<100;i++) {
            msg.append("MY NAME IS BAHAR");
        }
        txt.setText(msg);
    }
}