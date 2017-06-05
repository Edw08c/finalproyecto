package com.example.lid_infraestructura.finalu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText room, pass;
    private Button Inicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        room = (EditText)findViewById(R.id.room);
        pass = (EditText)findViewById(R.id.pass);

        Inicio =(Button)findViewById(R.id.btnLogin);
        Inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usuario = room.getText().toString();
                String contraseña = pass.getText().toString();

                switch (v.getId()){
                    case R.id.btnLogin:
                        if (usuario.equals("edward")&&contraseña.equals("1234")){

                            Intent intingresar = new Intent(MainActivity.this, Inicio.class);
                            startActivity(intingresar);
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Datos Erroneos", Toast.LENGTH_SHORT).show();
                        }
                }
            }
        });
    }
}

