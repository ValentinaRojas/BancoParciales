package com.digital.electronica.bancoparciales;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ActivityMaterias5 extends AppCompatActivity {

    Button labedigital,eldigital,estad,progra4,admi,gramaticas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materias5);

        Toolbar toolbar = findViewById(R.id.include);
        toolbar.setBackgroundColor(Color.parseColor("#FFD32F2F"));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setTitle("Materias");

        labedigital = (Button)findViewById(R.id.BTNlabelectronica);

        labedigital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent siguiente = new Intent(ActivityMaterias5.this, ActivityProfesores.class);
                startActivity(siguiente);
            }
        });


        eldigital = (Button)findViewById(R.id.BTNdigital);

        eldigital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent siguiente = new Intent(ActivityMaterias5.this, ActivityProfesores.class);
                startActivity(siguiente);
            }
        });

        estad = (Button)findViewById(R.id.BTNestadistica);

        estad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent siguiente = new Intent(ActivityMaterias5.this, ActivityProfesores.class);
                startActivity(siguiente);
            }
        });

        progra4 = (Button)findViewById(R.id.BTNprogra4);

        progra4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent siguiente = new Intent(ActivityMaterias5.this, ActivityProfesores.class);
                startActivity(siguiente);
            }
        });

        admi = (Button)findViewById(R.id.BTNadmi);

        admi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent siguiente = new Intent(ActivityMaterias5.this, ActivityProfesores.class);
                startActivity(siguiente);
            }
        });

        gramaticas = (Button)findViewById(R.id.BTNgramaticas);

        gramaticas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent siguiente = new Intent(ActivityMaterias5.this, ActivityProfesores.class);
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
