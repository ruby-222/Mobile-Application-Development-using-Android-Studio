package com.example.email;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText to,sub,msg;
Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        to=findViewById(R.id.to);
        sub=findViewById(R.id.subject);
        msg=findViewById(R.id.msg);




    }
    public void sendmail(View v){
        Intent i=new Intent(Intent.ACTION_SEND);
        i.putExtra(Intent.EXTRA_EMAIL,new String[]{to.getText().toString()});
        i.putExtra(Intent.EXTRA_SUBJECT,sub.getText().toString());
        i.putExtra(Intent.EXTRA_TEXT,msg.getText().toString());
        i.setType("message/rfc822");
        startActivity(Intent.createChooser(i,"Choose Mail App"));
    }
}