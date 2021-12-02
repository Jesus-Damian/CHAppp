package com.example.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class infomas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infomas);
    }
    public void Hom (View view) {
        Intent hom = new Intent(this, Barra.class);
        startActivity(hom);
    }
    public void Rep (View view) {
        Intent rep = new Intent(this, ReporteF.class);
        startActivity(rep);
    }
    public void Pag (View view) {
        Intent pag = new Intent(this, Pago.class);
        startActivity(pag);
    }
    public void Exi (View view) {
        Intent exi = new Intent(this, MainActivity.class);
        startActivity(exi);
    }
}