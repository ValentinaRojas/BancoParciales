package com.digital.electronica.bancoparciales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ActivityInicio extends AppCompatActivity {

    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Toolbar toolbar = findViewById(R.id.include);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Banco de Parciales");


        siguiente = (Button)findViewById(R.id.BTNcontinuar);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent siguiente = new Intent(ActivityInicio.this, Activitysemestres.class);
                startActivity(siguiente);
            }
        });
    }

}
