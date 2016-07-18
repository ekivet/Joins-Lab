package com.example.erickivet.joinslab;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by erickivet on 7/17/16.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "employees.db";
    public static final String EMPLOYEE_TABLE = "employees";
    public static final String COL_ID = "_id";
    public static final String COL_SSN = "ssn";
    public static final String COL_FIRST_NAME = "first name";
    public static final String COL_LAST_NAME = "last name";
    public static final String COL_BIRTH_YEAR ="birth year";
    public static final String COL_CITY = "city";

    public static final String JOB_TABLE = "jobs";
    public static final String COL_COMPANY = "company";
    public static final String COL_SALARY = "salary";
    public static final String COL_EXPERIENCE = "experience";


    private DatabaseHelper (Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    private static DatabaseHelper INSTANCE;
    public static synchronized DatabaseHelper getInstance(Context context){
        if (INSTANCE == null)
            INSTANCE = new DatabaseHelper(context.getApplicationContext());
        return INSTANCE;
    }

    public void onCreate(SQLiteDatabase db){
        String employeeString = "CREATE TABLE " + EMPLOYEE_TABLE + " (" +
                COL_ID + " INTEGER PRIMARY KEY, " +
                COL_SSN + " TEXT, " +
                COL_FIRST_NAME + " TEXT, " +
                COL_LAST_NAME + " TEXT, " +
                COL_BIRTH_YEAR + " INT, " +
                COL_CITY + " TEXT )";

        db.execSQL(employeeString);

        String jobString = "CREATE TABLE " + JOB_TABLE + " (" +
                COL_ID + " INTEGER PRIMARY KEY, " +
                COL_SSN + " TEXT, " +
                COL_COMPANY + " TEXT, " +
                COL_SALARY + " TEXT, " +
                COL_EXPERIENCE + " TEXT )";

        db.execSQL(jobString);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

        db.execSQL("DROP TABLE IF EXISTS " + EMPLOYEE_TABLE);
        db.execSQL("DROP TABLE IF EXISTS " + JOB_TABLE);
        onCreate(db);

    }

    public void insertRowEmployee(Employee employee){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_SSN, employee.getSsn());
        values.put(COL_FIRST_NAME, employee.getFirstName());
        values.put(COL_LAST_NAME, employee.getLastName());
        values.put(COL_BIRTH_YEAR, employee.getBirthYear());
        values.put(COL_CITY, employee.getCity());
        db.insertOrThrow(EMPLOYEE_TABLE,null,values);
    }

    public void insertRowJob(Job job){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_SSN, job.getSsn());
        values.put(COL_COMPANY, job.getCompany());
        values.put(COL_SALARY, job.getSalary());
        values.put(COL_EXPERIENCE, job.getExperience());
        db.insertOrThrow(JOB_TABLE, null, values);


    }
}
