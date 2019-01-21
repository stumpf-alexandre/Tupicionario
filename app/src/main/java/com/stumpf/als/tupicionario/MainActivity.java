package com.stumpf.als.tupicionario;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView bichos = findViewById(R.id.bichos);
    TextView culinaria = findViewById(R.id.culinaria);
    TextView plantas = findViewById(R.id.plantas);
    TextView povos_nativos = findViewById(R.id.povos_nativos);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bichos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, BichosActivity.class);
                startActivity(i);
            }
        });
        culinaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CulinariasActivity.class);
                startActivity(i);
            }
        });
        plantas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PlantasActivity.class);
                startActivity(i);
            }
        });
        povos_nativos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PovosNativosActivity.class);
                startActivity(i);
            }
        });
    }
}