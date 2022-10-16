package com.example.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context) {

        super(context, "Student.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table StudentInfo (roll TEXT primary key,name TEXT,marks TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists StudentInfo");
    }

    public Boolean insertdata(String roll, String name, String marks) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("roll", roll);
        values.put("name", name);
        values.put("marks", marks);
        long res = db.insert("StudentInfo", null, values);
        if (res == -1) {
            return false;
        }
        return true;
    }


    public Boolean updatedata(String roll, String name, String marks) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", name);
        values.put("marks", marks);
        Cursor cursor = db.rawQuery("Select *from StudentInfo where roll=?", new String[]{roll});
        if (cursor.getCount() > 0) {
            int res = db.update("StudentInfo", values, "roll=?", new String[]{roll});
            if (res == -1) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public Boolean deletedata(String roll) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("Select *from StudentInfo where roll=?", new String[]{roll});
        if (cursor.getCount() > 0) {
            int res = db.delete("StudentInfo", "roll=?", new String[]{roll});
            if (res == -1) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public Cursor viewdata() {
        SQLiteDatabase db = this.getWritableDatabase();

        Cursor cursor = db.rawQuery("Select * from StudentInfo", null);
        return cursor;

    }
}
