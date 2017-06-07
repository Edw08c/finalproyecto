package com.example.lid_infraestructura.finalu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Inicio extends AppCompatActivity {

    ImageView btnsalir;
    Button Sedes, Ubicacion, Comunidad, Programas, Admisiones, Uniremington, Bienestar, Correo, Moodle, Q10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);


        Correo = (Button) findViewById(R.id.btncorreo);
        Correo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intcorreo = new Intent(Inicio.this, Correo.class);
                startActivity(intcorreo);
            }
        });

        Moodle = (Button) findViewById(R.id.btnmoodle);
        Moodle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intmoodle = new Intent(Inicio.this, Moodle.class);
                startActivity(intmoodle);
            }
        });

        Q10 = (Button) findViewById(R.id.btnq10);
        Q10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intq10 = new Intent(Inicio.this, Q10.class);
                startActivity(intq10);
            }
        });

        Bienestar = (Button) findViewById(R.id.btnbienestaryegresados);
        Bienestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intbienestar = new Intent(Inicio.this, Bienestar.class);
                startActivity(intbienestar);
            }
        });

        Uniremington = (Button) findViewById(R.id.btnuniremington);
        Uniremington.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intuniremington = new Intent(Inicio.this, Uniremington.class);
                startActivity(intuniremington);
            }
        });

        Admisiones = (Button) findViewById(R.id.btnadmisiones);
        Admisiones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intadmisiones = new Intent(Inicio.this, Admisiones.class);
                startActivity(intadmisiones);
            }
        });

        Programas = (Button) findViewById(R.id.btnprogramas);
        Programas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intprogramas = new Intent(Inicio.this, Programas.class);
                startActivity(intprogramas);
            }
        });


        Comunidad = (Button) findViewById(R.id.btncomunidad);
        Comunidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intcomunidad = new Intent(Inicio.this, Comunidad.class);
                startActivity(intcomunidad);
            }
        });

        Ubicacion = (Button) findViewById(R.id.btnubicacion);
        Ubicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intubicacion = new Intent(Inicio.this, Ubicacion.class);
                startActivity(intubicacion);
            }
        });


        Sedes = (Button) findViewById(R.id.btnsedes);
        Sedes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intsedes = new Intent(Inicio.this, Sedes.class);
                startActivity(intsedes);
            }
        });


        btnsalir = (ImageView) findViewById(R.id.btnsalir);
        btnsalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intsalir = new Intent(Intent.ACTION_MAIN);
                intsalir.addCategory(Intent.CATEGORY_HOME);
                intsalir.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intsalir);

            }
        });

    }
}
