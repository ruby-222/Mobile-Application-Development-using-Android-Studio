package com.example.login2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String username="admin";
        String password="admin@123";
        EditText usname=(EditText) findViewById(R.id.et1);
        EditText pass=(EditText) findViewById(R.id.et2);
        Button login=(Button) findViewById(R.id.bt1);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.equals(usname.getText().toString())&& password.equals(pass.getText().toString()))
                {
                    Toast.makeText(getApplicationContext(), "Login Successful",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Login Failed",Toast.LENGTH_LONG).show();

                }
            }
        });


    }
}