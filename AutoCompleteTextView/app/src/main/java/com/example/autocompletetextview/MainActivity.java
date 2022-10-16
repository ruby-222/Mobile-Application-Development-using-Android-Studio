package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] Words={"India","America","Australia ","United Kingdom","Canada","China","England"};
        AutoCompleteTextView autoCompleteTextView= (AutoCompleteTextView) findViewById(R.id.at1);
        ArrayAdapter adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,Words);
        autoCompleteTextView.setAdapter(adapter);
    }
}