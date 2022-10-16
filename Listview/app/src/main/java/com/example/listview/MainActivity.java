package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView ls=findViewById(R.id.listview);
        String[] languages={"Android","Java","PHP","Hadoop","Sap","Python","Ajax","C++","Ruby","Rails","C"};
        ArrayAdapter <String> arrayAdapter=new ArrayAdapter<>(this,R.layout.activity_listview,R.id.textView,languages);
        ls.setAdapter(arrayAdapter);
    }
}