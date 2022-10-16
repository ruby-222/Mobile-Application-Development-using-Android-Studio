package com.example.sensors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.SensorPrivacyManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SensorManager sensorManager=(SensorManager) getSystemService(Context.SENSOR_SERVICE);
        TextView textView=findViewById(R.id.txt1);
        List<Sensor> sensorList=sensorManager.getSensorList(Sensor.TYPE_ALL);
        StringBuilder msg= new StringBuilder();
        for (Sensor s:sensorList){
            msg.append(s.getName()+"\n");
        }
        textView.setText(msg);
    }
}