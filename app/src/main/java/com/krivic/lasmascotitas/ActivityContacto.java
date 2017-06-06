package com.krivic.lasmascotitas;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class ActivityContacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
    }

    public void mensajeEnviado(View v){

        Toast.makeText(v.getContext(), "Comentario enviado", Toast.LENGTH_SHORT).show();
        TextInputEditText nombre = (TextInputEditText) findViewById(R.id.nombre);
        TextInputEditText correo = (TextInputEditText) findViewById(R.id.correo);
        TextInputEditText mensaje = (TextInputEditText) findViewById(R.id.mensaje);

        nombre.setText("");
        correo.setText("");
        mensaje.setText("");
    }

    public void irMascotas(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

