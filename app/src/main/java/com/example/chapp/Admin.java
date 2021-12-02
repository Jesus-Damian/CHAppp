package com.example.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Admin extends AppCompatActivity {
TextView txtAdminUsuario2,txtAdminContra2;
Button btnAdminEntrar2, btnRegistrar2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);


        txtAdminUsuario2=(TextView) findViewById(R.id.txtAdminUsuario2);
        txtAdminContra2=(TextView) findViewById(R.id.txtAdminContra2);

        btnAdminEntrar2=(Button) findViewById(R.id.btnAdminEntrar2);
        btnRegistrar2=(Button) findViewById(R.id.btnRegistrar2);

        btnAdminEntrar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario ="admin";
                String contra ="admin";

                String u=txtAdminUsuario2.getText().toString();
                String p=txtAdminContra2.getText().toString();
                if (u.length()==00){
                    Toast.makeText(getApplicationContext(),"Debes ingresar tu USUARIO",Toast.LENGTH_LONG).show();
                }
                if (p.length()==00){
                    Toast.makeText(getApplicationContext(),"Debes ingresar tu CONTRASEÑA",Toast.LENGTH_LONG).show();
                } else if (txtAdminUsuario2.length()==5 && txtAdminContra2.length()==5){
                    Intent sig = new Intent(getApplicationContext(), ReportesAdm.class);
                    startActivity(sig);
                }else{
                    Toast.makeText(getApplicationContext(),"Datos incorrectos", Toast.LENGTH_LONG).show();
                }
            }
        });

    }



    public void Siguiente(View view){
        Intent siguiente = new Intent(this, ReportesAdm.class);
        startActivity(siguiente);
    }
    public void Main(View view){
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }



}