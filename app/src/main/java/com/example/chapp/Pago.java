package com.example.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Pago extends AppCompatActivity implements View.OnClickListener{
 Button buttonPagar;
    EditText editTextNombreP,editTextNumberCP,editTextNumT,editTextFechaEx,editTextcvv,editTextNip;
    daoUsuario dao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pago);

        editTextNombreP =(EditText) findViewById(R.id.editTextNombreP);
        editTextNumberCP = (EditText) findViewById(R.id.editTextNumberCP);
        editTextNumT = (EditText) findViewById(R.id.editTextNumT);
        editTextFechaEx = (EditText) findViewById(R.id.editTextFechaEx);
        editTextcvv = (EditText) findViewById(R.id.editTextcvv);
        editTextNip = (EditText) findViewById(R.id.editTextNip);

        buttonPagar=(Button) findViewById(R.id.buttonPagar);
        dao=new daoUsuario(this);
        buttonPagar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonPagar:
                UsuarioR b = new UsuarioR();

                b.setNombreP(editTextNombreP.getText().toString());
                b.setnContratoP(editTextNumberCP.getText().toString());
                b.setnTargeta(editTextNumT.getText().toString());
                b.setfExpedicion(editTextFechaEx.getText().toString());
                b.setCvv(editTextcvv.getText().toString());
                b.setNip(editTextNip.getText().toString());

                String nP=editTextNombreP.getText().toString();
                String nC=editTextNumberCP.getText().toString();
                String nT=editTextNumT.getText().toString();
                String fE=editTextFechaEx.getText().toString();
                String cvv=editTextcvv.getText().toString();
                String nip=editTextNip.getText().toString();

                if(nP.length()==0){
                    Toast.makeText(this,"Debes ingresar tu nombre completo",Toast.LENGTH_LONG).show();
                }
                if(nC.length()==0){
                    Toast.makeText(this,"Debes ingresar tu numero de contrato",Toast.LENGTH_LONG).show();
                }
                if(nT.length()==0){
                    Toast.makeText(this,"Debes ingresar tu numero de tarjeta",Toast.LENGTH_LONG).show();
                }
                if(fE.length()==0){
                    Toast.makeText(this,"Debes ingresar la fecha de expedion de tu tarjeta",Toast.LENGTH_LONG).show();
                }
                if(cvv.length()==0){
                    Toast.makeText(this,"Debes ingresar el cvv de tu tarjeta",Toast.LENGTH_LONG).show();
                }
                if(nip.length()==0){
                    Toast.makeText(this,"Debes ingresar tu nip de tu tarjeta",Toast.LENGTH_LONG).show();
                }else if (dao.generarP(b)){
                Toast.makeText(this,"PAGO GENERADO!!",Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this,"ERROR AL GENERAR PAGO",Toast.LENGTH_LONG).show();
            }
                break;
        }
    }

    public void Hom (View view) {
        Intent hom = new Intent(this, Barra.class);
        startActivity(hom);
    }
    public void Rep (View view) {
        Intent rep = new Intent(this, ReporteF.class);
        startActivity(rep);
    }
    public void Mas (View view) {
        Intent mas = new Intent(this, infomas.class);
        startActivity(mas);
    }


}