package com.example.chapp;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.chapp.db.DbHelper;
import com.example.chapp.db.DbReportes;

public class ReporteF extends AppCompatActivity implements View.OnClickListener{

    Button  btnGenerarF;
    EditText editTextNumberC, editTextDireccion, editTextDesFalla, editTextNombre,editTextApellidos;
    daoUsuario dao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte_f);

        editTextNumberC =(EditText) findViewById(R.id.editTextNumberC);
        editTextDireccion = (EditText) findViewById(R.id.editTextDireccion);
        editTextDesFalla = (EditText) findViewById(R.id.editTextDesFalla);
        editTextNombre = (EditText) findViewById(R.id.editTextNombre);
        editTextApellidos = (EditText) findViewById(R.id.editTextApellidos);
        btnGenerarF = (Button) findViewById(R.id.btnGenerarF);
        dao=new daoUsuario(this);
        btnGenerarF.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnGenerarF:
                UsuarioR a=new UsuarioR();

                String nC=editTextNumberC.getText().toString();
                String n=editTextNombre.getText().toString();
                String ape=editTextApellidos.getText().toString();
                String di= editTextDireccion.getText().toString();
                String dF= editTextDesFalla.getText().toString();

                a.setnContratoR(editTextNumberC.getText().toString());
                a.setNombre(editTextNombre.getText().toString());
                a.setApellios(editTextApellidos.getText().toString());
                a.setDireccion(editTextDireccion.getText().toString());
                a.setDesFalla(editTextDesFalla.getText().toString());
                if(nC.length()==0){
                    Toast.makeText(this,"Debes ingresar tu numero de contrato",Toast.LENGTH_LONG).show();
                }
                if(n.length()==0){
                    Toast.makeText(this,"Debes ingresar Nombre Completo",Toast.LENGTH_LONG).show();
                }
                if(ape.length()==0){
                    Toast.makeText(this,"Debes ingresar tus Apellidos",Toast.LENGTH_LONG).show();
                }
                if(di.length()==0){
                    Toast.makeText(this,"Debes ingresar tu Direccion",Toast.LENGTH_LONG).show();
                }
                if(dF.length()==0){
                    Toast.makeText(this,"Debes ingresar la descripcion de la falla",Toast.LENGTH_LONG).show();
                }else if (dao.reporteF(a)){
                    Toast.makeText(this,"REPORTE GENERADO!!",Toast.LENGTH_LONG).show();
                    limpiar();
                }else{
                    Toast.makeText(this,"ERROR AL GENERAR REPORTE",Toast.LENGTH_LONG).show();
                }
                break;
        }
    }


    public void Hom (View view) {
        Intent hom = new Intent(this, Barra.class);
        startActivity(hom);
    }
    public void Pag (View view) {
        Intent pag = new Intent(this, Pago.class);
        startActivity(pag);
    }
    public void Mas (View view) {
        Intent mas = new Intent(this, infomas.class);
        startActivity(mas);
    }
    private void limpiar (){
        editTextNumberC.setText("");
        editTextDireccion.setText("");
        editTextDesFalla.setText("");
        editTextNombre.setText("");
        editTextApellidos.setText("");
    }


}