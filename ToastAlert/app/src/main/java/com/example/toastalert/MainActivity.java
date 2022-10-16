package com.example.toastalert;

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
        CheckBox pizza,coffee,burger;
        Button order;
        StringBuilder msg=new StringBuilder();

        int pizzaprice;
        int coffeeprice;
        int burgerprice;
        int[] total = new int[1];
        pizzaprice=170;
        coffeeprice= 50;
        burgerprice=120;
        total[0] =0;
        pizza=findViewById(R.id.chb1);
        coffee=findViewById(R.id.chb2);
        burger=findViewById(R.id.chb3);
        order=findViewById(R.id.btn1);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pizza.isChecked()) {
                    msg.append("Selected items\n");
                    msg.append(pizza.getText().toString() + pizzaprice + "Rs\n");
                    total[0] += pizzaprice;
                }
                if(coffee.isChecked()) {
                    msg.append(coffee.getText().toString() + coffeeprice + "Rs\n");
                    total[0] += coffeeprice;
                }
                if(burger.isChecked()) {
                    msg.append(burger.getText().toString() + burgerprice + "Rs\n");
                    total[0] += burgerprice;
                }
                msg.append("Total "+total[0]);
                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_LONG).show();
                msg.delete(0, msg.length());
            }
        });
    }
}