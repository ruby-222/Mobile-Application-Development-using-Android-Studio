package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=findViewById(R.id.bt1);
        GridView gd=findViewById(R.id.gd1);
        String arr[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};


        ArrayAdapter <String> ad= new ArrayAdapter<>(this,R.layout.activity_gridview,R.id.bt1,arr);
        gd.setAdapter(ad);
    }
}
