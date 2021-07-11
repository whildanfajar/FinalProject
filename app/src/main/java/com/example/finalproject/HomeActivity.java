package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button; //import untuk memanggil activity, menambah fungsi, membaca data string/int, meampilkan data dan masih banyak lagi

public class HomeActivity extends AppCompatActivity {
    Button btnorganik,btnanorganik,btnINFO; //mendeklarasikan variabel

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnorganik = findViewById(R.id.btnorganik);
        btnanorganik = findViewById(R.id.btnanorganik); // menghubungkan dengan button,edit text dan text view yang digunakan pada layout
        btnINFO = findViewById(R.id.btnINFO);

        btnINFO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), InfoActivity.class); //button yang berfungsi untuk mengarahkan ke layout InfoActivity
                startActivity(i);
            }
        });

        btnorganik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityOrganik.class);//button yang berfungsi untuk mengarahkan ke layout OrganikActivity
                startActivity(i);
            }
        });

        btnanorganik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityAnorganik.class);//button yang berfungsi untuk mengarahkan ke layout AnorganikActivity
                startActivity(i);
            }
        });
    }
}