package com.example.lid_infraestructura.finalu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Sedes extends AppCompatActivity {
    Button Boyaca, Bucaramanga, Cucuta, Medellin, Manizales, Monteria, Pasto, Pereira, Yopal;
    ImageView btnhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sedes);

        Yopal = (Button)findViewById(R.id.btnyopal);
        Yopal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intyopal = new Intent(Sedes.this, Yopal.class);
                startActivity(intyopal);

            }
        });

        Pereira = (Button)findViewById(R.id.btnpereira);
        Pereira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intpereira = new Intent(Sedes.this, Pereira.class);
                startActivity(intpereira);

            }
        });

        Pasto = (Button)findViewById(R.id.btnpasto);
        Pasto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intpasto = new Intent(Sedes.this, Pasto.class);
                startActivity(intpasto);

            }
        });

        Monteria = (Button)findViewById(R.id.btnmonteria);
        Monteria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intmonteria = new Intent(Sedes.this, Monteria.class);
                startActivity(intmonteria);

            }
        });


        Manizales = (Button)findViewById(R.id.btnmanizales);
        Manizales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intmanizales = new Intent(Sedes.this, Manizales.class);
                startActivity(intmanizales);

            }
        });


        Medellin = (Button)findViewById(R.id.btnmedellin);
        Medellin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intmedellin = new Intent(Sedes.this, Medellin.class);
                startActivity(intmedellin);

            }
        });


        Cucuta = (Button)findViewById(R.id.btncucuta);
        Cucuta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intcucuta = new Intent(Sedes.this, Cucuta.class);
                startActivity(intcucuta);

            }
        });

        Bucaramanga = (Button)findViewById(R.id.btnbucaramanga);
        Bucaramanga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intbucaramanga = new Intent(Sedes.this, Bucaramanga.class);
                startActivity(intbucaramanga);

            }
        });


        btnhome = (ImageView)findViewById(R.id.btnhome);
        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        Boyaca = (Button)findViewById(R.id.btnboyaca);
        Boyaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intboyaca = new Intent(Sedes.this, Boyaca.class);
                startActivity(intboyaca);
            }
        });

    }
}
