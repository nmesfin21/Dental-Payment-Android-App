package com.natty.dentalpayment;

/**
 * Created by Dell on 5/24/2018.
 */


import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.content.Context;
import android.content.ContentValues;
import android.nfc.Tag;
import android.util.Log;

import java.util.Date;

public class EmployeeDBHandler extends SQLiteOpenHelper{
    private static  final int DATABASE_VERSION = 1;
    private static String DATABASE_NAME = "employee.db";
    public static final String TABLE_EMPLOYEE = "EMPLOYEE";
    public static final String COLUMN_USERNAME = "Uname";
    public static final String COLUMN_FIRSTNAME = "Fname";
    public static final String COLUMN_LASTNAME = "Lname";
    public static final String COLUMN_BDATE = "Dbirth";
    public static final String COLUMN_PHONENUMBER = "Pnumber";
    public static final String COLUMN_EMAIL = "Email";
    public static final String COLUMN_PASSWORD = "Password";
    public static final String COLUMN_ID = "EiD";

    public EmployeeDBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        // create a table
        String query = "CREATE TABLE " + TABLE_EMPLOYEE + "(" +
                COLUMN_USERNAME + " TEXT PRIMARY KEY," +
                COLUMN_FIRSTNAME + " TEXT, " +
                COLUMN_LASTNAME + " TEXT, " +
                COLUMN_BDATE + " TEXT, " +
                COLUMN_PHONENUMBER + " TEXT, " +
                COLUMN_EMAIL + " TEXT, " +
                COLUMN_PASSWORD + " TEXT);";
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i2){
        db.execSQL("DROP IF TABLE EXISTS " + TABLE_EMPLOYEE);
        onCreate(db);
    }

    //add a new raw in the employyee
    public boolean addEmployee(Employee employee){
        ContentValues values = new ContentValues();
        values.put(COLUMN_USERNAME, employee.getUserName());
        values.put(COLUMN_FIRSTNAME, employee.getFirstName());
        values.put(COLUMN_LASTNAME, employee.getLastName());
        values.put(COLUMN_BDATE, employee.getBirthDate());
        values.put(COLUMN_PHONENUMBER, employee.getPhoneNumber());
        values.put(COLUMN_EMAIL, employee.getEmail());
        values.put(COLUMN_PASSWORD, employee.getPassword());

        //Log.d(Tag, "AddData: Adding " + employee + " to " +  TABLE_EMPLOYEE);

        SQLiteDatabase db = getWritableDatabase();
        long result = db.insert(TABLE_EMPLOYEE, null, values);
        db.close();
        if(result == -1){
            return  false;
        } else{
            return true;
        }
    }

    //remove employee
    public void removeEmployee(String uName){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_EMPLOYEE + " WHERE " + COLUMN_USERNAME + "=\"" + uName + "\";");
    }

    //match username and password
    public boolean matchUserNameAndPassword(String uName, String pWard){
        SQLiteDatabase db = getWritableDatabase();

        String password = "SELECT " + COLUMN_PASSWORD + " FROM " + TABLE_EMPLOYEE + " WHERE " + COLUMN_USERNAME + "=\"" + uName + "\";";

        db.close();

        if(password == pWard){
            return true;
        } else {
            return false;
        }
    }
}
