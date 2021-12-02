package com.example.chapp.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.Nullable;

public class DbRegis extends DbHelper{

    Context context;

    public DbRegis(@Nullable Context context) {
        super(context);
        this.context = context;
    }
    public long GenerarRegistrarse(String NumberC, String CodigoP, String Correo, String  Contraseña, String ConfContra){

        long id = 0;

        try {
            DbHelper dbHelper = new DbHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("NumberC", "jesus");
            values.put("CodigoP", "1234");
            values.put("Correo", "sdfgfedf");
            values.put("Contraseña", "aa");
            values.put("ConfContra", "aa");

            id = db.insert(TABLE_USUARIO, null, values);
        } catch (Exception ex) {
            ex.toString();
        }

        return id;
    }
}
