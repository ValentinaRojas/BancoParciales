package com.digital.electronica.bancoparciales;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ActivityProfesores extends AppCompatActivity {

    Button profe1,profe2,profe3,profe4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profesores);

        Toolbar toolbar = findViewById(R.id.include);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setTitle("Profesores");


        profe1 = (Button)findViewById(R.id.BTNprofe1);

        profe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent siguiente = new Intent(ActivityProfesores.this, ActivityParcialesP1.class);
                startActivity(siguiente);
            }
        });

        profe2 = (Button)findViewById(R.id.BTNprofe2);

        profe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent siguiente = new Intent(ActivityProfesores.this, ActivityParcialesP1.class);
                startActivity(siguiente);
            }
        });

        profe3 = (Button)findViewById(R.id.BTNprofe3);

        profe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent siguiente = new Intent(ActivityProfesores.this, ActivityParcialesP1.class);
                startActivity(siguiente);
            }
        });

        profe4 = (Button)findViewById(R.id.BTNprofe4);

        profe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent siguiente = new Intent(ActivityProfesores.this, ActivityParcialesP1.class);
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
