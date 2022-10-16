package com.example.textviewedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username= (EditText) findViewById(R.id.e1);

        EditText password= (EditText) findViewById(R.id.e2);

        Button submit= (Button) findViewById(R.id.b1);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t1=(TextView) findViewById(R.id.t4);
                t1.setText("Username is "+username.getText().toString());
                TextView t2=(TextView) findViewById(R.id.t5);
                t2.setText("Password is "+password.getText().toString());
            }
        });
    }
}