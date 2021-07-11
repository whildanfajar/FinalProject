package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button; //import untuk memanggil activity, menambah fungsi, membaca data string/int, meampilkan data dan masih banyak lagi

public class EndActivity extends AppCompatActivity {
    Button btnEND; // deklarasi variabel

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        btnEND = findViewById(R.id.btnEND); // menghubungkan dengan button,edit text dan text view yang digunakan pada layout

        btnEND.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),HomeActivity.class); // jika button di klik akan mengarahkan ke halaman home
                startActivity(i);
            }
        });
    }
}