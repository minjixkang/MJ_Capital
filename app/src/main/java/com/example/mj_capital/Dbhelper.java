package com.example.mj_capital;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Dbhelper extends SQLiteOpenHelper {

    Context context;

    public Dbhelper (Context context){
        super (context, "mj.db", null, 1);
        this.context = context;

    }

    public void onUpgrade(SQLiteDatabase db, int oldV, int newV){

    }

    public void onCreate (SQLiteDatabase db){
        String sqllender;
        sqllender = "CREATE TABLE lender (username text Primary Key, password text, name text, birthdate text)";
        db.execSQL(sqllender);

        String sqlloaner;
        sqlloaner = "Create table loaner (username text Primary Key, password text, name text)";
        db.execSQL(sqlloaner);

        String sqltransaction;
        sqltransaction = "Create table loaner (username text Primary Key, password text, name text)";
        db.execSQL(sqltransaction);

    }
    public void insertion(String username, int id){
        SQLiteDatabase db = getWritableDatabase();
        String sql;
        db.close();

    }
}
