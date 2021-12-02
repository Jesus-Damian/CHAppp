package com.example.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnEntrar, btnRegistrar;
    EditText txtUsuario, txtContra;
    daoUsuario dao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuario=(EditText) findViewById(R.id.txtUsuario);
        txtContra=(EditText) findViewById(R.id.txtContra);
        btnEntrar=(Button) findViewById(R.id.btnEntrar);
        btnRegistrar=(Button) findViewById(R.id.btnCrear);

        btnEntrar.setOnClickListener(this);
        btnRegistrar.setOnClickListener(this);
        dao=new daoUsuario(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnEntrar:
                String u=txtUsuario.getText().toString();
                String p=txtContra.getText().toString();
                if(u.length()==0){
                    Toast.makeText(this,"Debes ingresar tu numero de contrato",Toast.LENGTH_LONG).show();
                }
                if (p.length()==00){
                    Toast.makeText(this,"Debes ingresar tu contraseña",Toast.LENGTH_LONG).show();
                }
                if(u.equals("")&&p.equals("")){

                }else if (dao.login(u,p)==1){
                    UsuarioR ux=dao.getUsuarioR(u,p);
                    Toast.makeText(this,"Datos correctos!!",Toast.LENGTH_LONG).show();
                    Intent i1=new Intent(MainActivity.this, Barra.class);
                    i1.putExtra("Id", ux.getId());
                    startActivity(i1);
                    finish();
                }else{
                    Toast.makeText(this,"Usuario y/o Password incorrectos",Toast.LENGTH_LONG).show();
                    limpiar();
                }
                break;
            case R.id.btnCrear:
                Intent i=new Intent(MainActivity.this, Registrarse.class);
                startActivity(i);
                break;

        }
    }

    private void limpiar (){
        txtUsuario.setText("");
        txtContra.setText("");
    }
    public void Siguiente(View view){
        Intent siguiente = new Intent(this, ReportesAdm.class);
        startActivity(siguiente);
    }
    public void Admin (View view) {
        Intent admin = new Intent(this, Admin.class);
        startActivity(admin);
    }
    public void Reg (View view) {
        Intent reg = new Intent(this, Registrarse.class);
        startActivity(reg);
    }
    public void Hom (View view) {
        Intent hom = new Intent(this, Barra.class);
        startActivity(hom);
    }
}