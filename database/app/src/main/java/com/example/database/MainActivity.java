package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText roll,name,marks;
   DBHelper mydb= new DBHelper(MainActivity.this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roll = findViewById(R.id.roll);
        name = findViewById(R.id.name);
        marks = findViewById(R.id.marks);
    }

            public void insertdb(View view) {
                String rollTxt = roll.getText().toString();
                String nameTxt = name.getText().toString();
                String marksTxt = marks.getText().toString();

                Boolean check = mydb.insertdata(rollTxt, nameTxt, marksTxt);
                if (check ==true) {
                    Toast.makeText(MainActivity.this, "Inserted successfully", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Error in inserting", Toast.LENGTH_LONG).show();
                }
            }



            public void updatedb(View v) {
                String rollTxt = roll.getText().toString();
                String nameTxt = name.getText().toString();
                String marksTxt = marks.getText().toString();

                Boolean check = mydb.updatedata(rollTxt, nameTxt, marksTxt);
                if (check ==true) {
                    Toast.makeText(MainActivity.this, "Updated successfully", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Error in updating", Toast.LENGTH_LONG).show();
                }
            }




            public void deletedb(View v) {
                String rollTxt = roll.getText().toString();


                Boolean check = mydb.deletedata(rollTxt);
                if (check ==true) {
                    Toast.makeText(MainActivity.this, "Deleted successfully", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Error in deleting", Toast.LENGTH_LONG).show();
                }
            }



            public void viewdb(View v) {



                Cursor res= mydb.viewdata();
                if (res.getCount()>0) {
                    StringBuilder msg=new StringBuilder();
                    while (res.moveToNext()) {
                        msg.append("Roll no"+res.getString(0)+"\n");
                        msg.append("Name"+res.getString(1)+"\n");
                        msg.append("Marks"+res.getString(2)+"\n\n");

                    }
                    Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "No record Exists", Toast.LENGTH_LONG).show();
                }
            }



}