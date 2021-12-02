package com.example.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Usuarios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuarios);
    }
    public void Reportes(View view){
        Intent reportes = new Intent(this, ReportesAdm.class);
        startActivity(reportes);
    }
    public void Main(View view){
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }

}