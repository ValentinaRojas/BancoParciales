package com.digital.electronica.bancoparciales;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ActivityMaterias4 extends AppCompatActivity {

    Button labe,fundamentos,tgs,progra3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materias4);


        Toolbar toolbar = findViewById(R.id.include);
        toolbar.setBackgroundColor(Color.parseColor("#FFD32F2F"));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setTitle("Materias");

        labe = (Button)findViewById(R.id.BTNlabe);

        labe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent siguiente = new Intent(ActivityMaterias4.this, ActivityProfesores.class);
                startActivity(siguiente);
            }
        });

       fundamentos = (Button)findViewById(R.id.BTNfundamentos);

        fundamentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent siguiente = new Intent(ActivityMaterias4.this, ActivityProfesores.class);
                startActivity(siguiente);
            }
        });

        tgs = (Button)findViewById(R.id.BTNtgs);

        tgs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent siguiente = new Intent(ActivityMaterias4.this, ActivityProfesores.class);
                startActivity(siguiente);
            }
        });

        progra3 = (Button)findViewById(R.id.BTNprogra3);

       progra3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent siguiente = new Intent(ActivityMaterias4.this, ActivityProfesores.class);
                startActivity(siguiente);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
