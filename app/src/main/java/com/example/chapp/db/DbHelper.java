package com.example.chapp.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 2;
    private static final String DATABASE_NOMBRE = "TVCHA";
    public static final String TABLE_REPORTE ="t_reporte";
    public static final String TABLE_USUARIO ="t_usuarios";

    public DbHelper(@Nullable Context context) {
        super(context, DATABASE_NOMBRE, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_REPORTE + "(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "numContrato TEXT NOT NULL," +
                "direccion TEXT NOT NULL," +
                "desFalla TEXT)");

        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_USUARIO + "(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "NumberC TEXT NOT NULL,"+
                "CodigoP TEXT NOT NULL," +
                "Correo TEXT NOT NULL," +
                "Contraseña TEXT NOT NULL, "+
                "ConfContra TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE " + TABLE_REPORTE);
        onCreate(sqLiteDatabase);
        sqLiteDatabase.execSQL("DROP TABLE " + TABLE_USUARIO);
        onCreate(sqLiteDatabase);
    }
}
