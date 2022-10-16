package com.example.checkboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox c1,c2,c3,c4,c5;
        Button b1;
        c1= findViewById(R.id.chb1);
        c2= findViewById(R.id.chb2);
        c3= findViewById(R.id.chb3);
        c4= findViewById(R.id.chb4);
        c5= findViewById(R.id.chb5);
        b1=findViewById(R.id.bt1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder msg=new StringBuilder();
                msg.append("Your interest is ");
                if(c1.isChecked())
                {
                    msg.append(" Python,");
                }
                if(c2.isChecked()){
                    msg.append(" Java,");
                }
                if(c3.isChecked()){
                    msg.append(" C++,");
                }
                if(c4.isChecked()){
                    msg.append(" Android,");
                }
                if(c5.isChecked()){
                    msg.append(" C,");
                }
                Toast.makeText(getApplicationContext(),msg.toString(),Toast.LENGTH_LONG).show();
            }

        });


    }
}