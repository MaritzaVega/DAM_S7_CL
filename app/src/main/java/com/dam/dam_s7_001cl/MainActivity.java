package com.dam.dam_s7_001cl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = findViewById(R.id.buttonLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent( MainActivity.this,NotasActivity.class);
                startActivity(i);
            }
        });

        }
    }

////PARA LOS COLORES : https://material.io/resources/color/#!/?view.left=0&view.right=0
///PARA LOS ICONOS : https://www.flaticon.es/packs/facebook-pack