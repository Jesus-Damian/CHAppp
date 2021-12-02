package com.example.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ReportesAdm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes_adm);
    }
    public void Usuarios(View view){
        Intent usuarios = new Intent(this, Usuarios.class);
        startActivity(usuarios);
    }
    public void Main(View view){
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }
}