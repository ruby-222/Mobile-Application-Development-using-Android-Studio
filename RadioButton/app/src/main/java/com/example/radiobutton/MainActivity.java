package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioButton rb1,rb2,rb3,rb4;
        RadioGroup rg1;
        Button b1;
        String[] msg = new String[1];
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        rb3=findViewById(R.id.rb3);
        rb4=findViewById(R.id.rb4);
        b1=findViewById(R.id.bt1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rb3.isChecked()) {
                    msg[0] = rb3.getText().toString();
                }
                else if (rb4.isChecked()){
                    msg[0] = rb4.getText().toString();
                }
                Toast.makeText(getApplicationContext(), msg[0] , Toast.LENGTH_LONG).show();
            }
        });

    }
}