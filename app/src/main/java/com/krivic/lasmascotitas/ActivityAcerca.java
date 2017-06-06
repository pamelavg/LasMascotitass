package com.krivic.lasmascotitas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ActivityAcerca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca);

    }

    public void irMascotas(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
