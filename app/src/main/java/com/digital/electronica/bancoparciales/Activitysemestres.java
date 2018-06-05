package com.digital.electronica.bancoparciales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Activitysemestres extends AppCompatActivity {

    Button semestre1,semestre2,semestre3,semestre4,semestre5,semestre6,semestre7,semestre8,semestre9,semestre10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semestres);

        Toolbar toolbar = findViewById(R.id.include);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setTitle("Semestres");

        semestre1 = (Button)findViewById(R.id.BTNsemestre1);

        semestre1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent siguiente = new Intent(Activitysemestres.this, ActivityMaterias1.class);
                startActivity(siguiente);
            }
        });

        semestre2 = (Button)findViewById(R.id.BTNsemestre2);

        semestre2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent siguiente = new Intent(Activitysemestres.this, ActivityMaterias2.class);
                startActivity(siguiente);
            }
        });

        semestre3 = (Button)findViewById(R.id.BTNsemestre3);

        semestre3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent siguiente = new Intent(Activitysemestres.this, ActivityMaterias3.class);
                startActivity(siguiente);
            }
        });

        semestre4 = (Button)findViewById(R.id.BTNsemestre4);

        semestre4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent siguiente = new Intent(Activitysemestres.this, ActivityMaterias4.class);
                startActivity(siguiente);
            }
        });

        semestre5 = (Button)findViewById(R.id.BTNsemestre5);

        semestre5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent siguiente = new Intent(Activitysemestres.this, ActivityMaterias5.class);
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
