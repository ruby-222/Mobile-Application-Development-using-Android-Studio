package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText e1,e2,e3;
        Button add,sub,div,mul,mod,pow;

        e1=(EditText) findViewById( R.id.et1 );
        e2=(EditText) findViewById( R.id.et2 );
        e3=(EditText) findViewById( R.id.et3 );
        add=(Button) findViewById( R.id.bt1 );
        sub=(Button) findViewById( R.id.bt2 );
        mul=(Button) findViewById( R.id.bt3 );
        div=(Button) findViewById( R.id.bt4 );
        mod=(Button) findViewById( R.id.bt5 );
        pow=(Button) findViewById( R.id.bt6 );

        add.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a= Integer.parseInt(e1.getText().toString());
                int b= Integer.parseInt( e2.getText().toString() );
                e3.setText("Addition is "+ (a+b) );
            }
        } );

        sub.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a= Integer.parseInt(e1.getText().toString());
                int b= Integer.parseInt( e2.getText().toString() );
                e3.setText("Subtraction is "+ (a-b) );
            }
        } );

        mul.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a= Integer.parseInt(e1.getText().toString());
                int b= Integer.parseInt( e2.getText().toString() );
                e3.setText("Multiplication is "+ (a*b) );
            }
        } );

        div.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a= Integer.parseInt(e1.getText().toString());
                int b= Integer.parseInt( e2.getText().toString() );
                e3.setText("Division is "+ (a/b) );
            }
        } );


        mod.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a= Integer.parseInt(e1.getText().toString());
                int b= Integer.parseInt( e2.getText().toString() );
                e3.setText("Modulus is "+ (a%b) );
            }
        } );

        pow.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a= Integer.parseInt(e1.getText().toString());
                int b= Integer.parseInt( e2.getText().toString() );
                e3.setText(" "+ Math.pow(a,b) );
            }
        } );

    }
}


