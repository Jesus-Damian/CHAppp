package com.example.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registrarse extends AppCompatActivity implements View.OnClickListener{
    Button btnCrear, btnRegresar;
    EditText editTextNumberC, editTextCodigP, editTextCorreo, editTextContra, editTextConfContra;
    daoUsuario dao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);

        editTextNumberC=(EditText) findViewById(R.id.editTextNumberC);
        editTextCodigP=(EditText) findViewById(R.id.editTextCodigP);
        editTextCorreo=(EditText) findViewById(R.id.editTextCorreo);
        editTextContra=(EditText) findViewById(R.id.editTextContra);
        editTextConfContra=(EditText) findViewById(R.id.editTextConfContra);
        btnCrear=(Button) findViewById(R.id.btnCrear);
        btnRegresar=(Button) findViewById(R.id.btnRegresar);

        btnCrear.setOnClickListener(this);
        btnRegresar.setOnClickListener(this);
        dao=new daoUsuario(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCrear:
                UsuarioR u=new UsuarioR();
                String nC=editTextNumberC.getText().toString();
                String cP=editTextCodigP.getText().toString();
                String c=editTextCorreo.getText().toString();
                String con=editTextCorreo.getText().toString();
                String cC=editTextConfContra.getText().toString();

                u.setnContrato(editTextNumberC.getText().toString());
                u.setCodigP(editTextCodigP.getText().toString());
                u.setCorreo(editTextCorreo.getText().toString());
                u.setContraseña(editTextContra.getText().toString());
                u.setcContraseña(editTextConfContra.getText().toString());

                if(nC.length()==0){
                    Toast.makeText(this,"Debes ingresar tu numero de contrato",Toast.LENGTH_LONG).show();
                }
                if(cP.length()==0){
                    Toast.makeText(this,"Debes ingresar tu Codigo postal",Toast.LENGTH_LONG).show();
                }
                if (c.length()==0){
                    Toast.makeText(this,"Debes ingresar tu correo",Toast.LENGTH_LONG).show();
                }
                if(con.length()==0){
                    Toast.makeText(this,"Debes ingresar una contraseña",Toast.LENGTH_LONG).show();
                }
                if (cC.length()==0){
                    Toast.makeText(this,"Debes confirmar tu contraseña",Toast.LENGTH_LONG).show();
                }else if(dao.insertUsuario(u)) {
                    Toast.makeText(this, "Registro EXITOSO!!!", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, "Este Usuario ya fue registrado anteriormente!!!", Toast.LENGTH_LONG).show();
                    Toast.makeText(this, "Verifique su Numero de contrato!!!", Toast.LENGTH_LONG).show();
                    limpiar();
                }
                break;

            case R.id.btnRegresar:
                Intent i=new Intent(Registrarse.this, MainActivity.class);
                startActivity(i);
                finish();
                break;
        }
    }
    private void limpiar (){
        editTextNumberC.setText("");
        editTextCodigP.setText("");
        editTextCorreo.setText("");
        editTextContra.setText("");
        editTextConfContra.setText("");
    }
}