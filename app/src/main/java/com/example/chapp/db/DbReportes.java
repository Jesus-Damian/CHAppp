package com.example.chapp.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.Nullable;

public class DbReportes extends DbHelper{

    Context context;

    public DbReportes(@Nullable Context context) {
        super(context);
        this.context = context;
    }

    public long generarReporte(String numContrato, String direccion, String desFalla){

        long id = 0;

        try {
            DbHelper dbHelper = new DbHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("numContrato", numContrato);
            values.put("direccion", direccion);
            values.put("desFalla", desFalla);

            id = db.insert(TABLE_REPORTE, null, values);
        } catch (Exception ex) {
            ex.toString();
        }

        return id;
    }
}
