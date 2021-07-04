package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button btnorganik,btnanorganik,btnINFO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnorganik = findViewById(R.id.btnorganik);
        btnanorganik = findViewById(R.id.btnanorganik);
        btnINFO = findViewById(R.id.btnINFO);

        btnINFO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), InfoActivity.class);
                startActivity(i);
            }
        });

        btnorganik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityOrganik.class);
                startActivity(i);
            }
        });

        btnanorganik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityAnorganik.class);
                startActivity(i);
            }
        });
    }
}