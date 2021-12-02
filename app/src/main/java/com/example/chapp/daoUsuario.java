package com.example.chapp;

import static com.example.chapp.db.DbHelper.TABLE_REPORTE;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.Nullable;

import com.example.chapp.db.DbHelper;

import java.sql.SQLData;
import java.util.ArrayList;

public class daoUsuario{
    Context c;
    Context ct;
    UsuarioR u;
    UsuarioR a;
    UsuarioR b;
    ArrayList<UsuarioR> lista;
    ArrayList<UsuarioR> list;
    SQLiteDatabase sql;

    String bd="DbTvCha";
    String tabla1="create table if not exists reporte (idReporte integer primary key autoincrement, nContratoR text, nombre text, apellidos text, direccion text, desFalla text)";
    String tabla2="create table if not exists usuario (id integer primary key autoincrement, nContrato text, codigoP text, correo text, contraseña text, cContraseña text )";
    String tabla3="create table if not exists pago (idPago integer primary key autoincrement, nombre text, nContrato text, nTargeta text, fExpedicion text, cvv text, nip text)";
    String tabla4="create table if not exists admin (idAdmin integer primary key autoincrement,nombre text, apellidop text, apellidom text, usuario text, paswoord text)";
    public daoUsuario( Context c) {
        this.c=c;
        sql = c.openOrCreateDatabase(bd, c.MODE_PRIVATE, null);
        sql.execSQL(tabla1);
        sql = c.openOrCreateDatabase(bd, c.MODE_PRIVATE, null);
        sql.execSQL(tabla2);
        sql = c.openOrCreateDatabase(bd, c.MODE_PRIVATE, null);
        sql.execSQL(tabla3);
        sql = c.openOrCreateDatabase(bd, c.MODE_PRIVATE, null);
        sql.execSQL(tabla4);
        u=new UsuarioR();
    }


/*Login*/
    public boolean insertUsuario(UsuarioR u){
        if(buscar(u.getnContrato())==0){
            ContentValues cv=new ContentValues();
            cv.put("nContrato",u.getnContrato());
            cv.put("codigoP",u.getCodigP());
            cv.put("correo",u.getCorreo());
            cv.put("contraseña",u.getContraseña());
            cv.put("cContraseña", u.getcContraseña());
            return (sql.insert("usuario", null, cv)>0);
        }else{
            return false;
        }
    }

    public int buscar(String u){
        int x=0;
        lista=selecUsuarios();
        for (UsuarioR us:lista) {
            if (us.getnContrato().equals(u)){
                x++;
            }
        }
        return x;
    }

    public ArrayList<UsuarioR> selecUsuarios() {
        ArrayList<UsuarioR> lista=new ArrayList<UsuarioR>();
        lista.clear();
        Cursor cr=sql.rawQuery("select * from usuario", null);
        if (cr!=null&&cr.moveToFirst()){
            do {
                UsuarioR u=new UsuarioR();
                u.setId(cr.getInt(0));
                u.setnContrato(cr.getString(1));
                u.setCodigP(cr.getString(2));
                u.setCorreo(cr.getString(3));
                u.setContraseña(cr.getString(4));
                u.setcContraseña(cr.getString(5));
                lista.add(u);
            }while (cr.moveToNext());
        }
        return lista;
    }

    public int login(String u, String p){
        int a=0;
        Cursor cr=sql.rawQuery("select * from usuario", null);
        if (cr!=null&&cr.moveToFirst()){
            do {
                if (cr.getString(1).equals(u)&&cr.getString(4).equals(p)){
                    a++;
                }
            }while (cr.moveToNext());
        }
            return a;
    }



    public UsuarioR getUsuarioR(String u, String p){
        lista=selecUsuarios();
        for (UsuarioR us:lista) {
            if(us.getnContrato().equals(u)&&us.getContraseña().equals(p)){
                return us;
            }
        }
        return null;
    }

    public UsuarioR getUsuarioRById(int id){
        lista=selecUsuarios();
        for (UsuarioR us:lista) {
            if(us.getId()==id){
                return us;
            }
        }
        return null;
    }

    /*REPORTE DE FALLA*/

    public boolean reporteF(UsuarioR a){
            ContentValues cv=new ContentValues();
            cv.put("nContratoR",a.getnContratoR());
            cv.put("nombre",a.getNombre());
            cv.put("apellidos",a.getApellios());
            cv.put("direccion",a.getDireccion());
            cv.put("desFalla",a.getDesFalla());
            return (sql.insert("reporte", null, cv)>0);
    }

    public boolean generarP(UsuarioR b){
        ContentValues cv=new ContentValues();
        cv.put("nombre",b.getNombreP());
        cv.put("nContrato",b.getnContratoP());
        cv.put("nTargeta",b.getnTargeta());
        cv.put("fExpedicion",b.getfExpedicion());
        cv.put("cvv", b.getCvv());
        cv.put("nip",b.getNip());
        return (sql.insert("pago",null, cv)>0);
    }

    /*Mostrar Reportes*/

    public ArrayList<UsuarioR> verReporte(){
        ArrayList<UsuarioR> list=new ArrayList<>();
      list.clear();
        Cursor cursor=sql.rawQuery("select * from reporte", null);
        if (cursor!=null && cursor.getCount()>0){
            cursor.moveToFirst();
            do {
                UsuarioR a=new UsuarioR();
                a.setIdReporte(cursor.getInt(0));
                a.setnContratoR(cursor.getString(1));
                a.setNombre(cursor.getString(2));
                a.setApellios(cursor.getString(3));
                a.setDireccion(cursor.getString(4));
                a.setDesFalla(cursor.getString(5));
            }while (cursor.moveToNext());
        }

        return list;
    }

}
