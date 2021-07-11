package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button; //import untuk memanggil activity, menambah fungsi, membaca data string/int, meampilkan data dan masih banyak lagi

public class InfoActivity extends AppCompatActivity {
    Button btnBACK; //deklarasi variabel yang di gunakan pada layout

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        btnBACK = findViewById(R.id.btnBACK); // menghubungkan dengan button,edit text dan text view yang digunakan pada layout

        btnBACK.setOnClickListener(new View.OnClickListener() { //fungsi button back untuk kembali pada halaman home
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(i);
            }
        });
    }
}