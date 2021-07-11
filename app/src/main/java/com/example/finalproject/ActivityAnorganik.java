package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast; //import untuk memanggil activity, menambah fungsi, membaca data string/int, meampilkan data dan masih banyak lagi

public class ActivityAnorganik extends AppCompatActivity {

    TextView bsAOtx,nAOtx,daAOtx; //deklarasi variabel yang digunakna
    Button btnSAO, btnBAO;
    EditText bsAO, daAO, nAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anorganik);

        bsAOtx = findViewById(R.id.bsAOtx); //menghubungkan dengan button,edit text dan text view yang digunakan pada layout
        nAOtx = findViewById(R.id.nAOtx);
        daAOtx = findViewById(R.id.daAOtx);
        btnSAO = findViewById(R.id.btnSAO);
        btnBAO = findViewById(R.id.btnBAO);
        bsAO = findViewById(R.id.bsAO);
        daAO = findViewById(R.id.daAO);
        nAO = findViewById(R.id.nAO);

        btnBAO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), HomeActivity.class); //button yang berfungsi untuk kembali ke halaman home
                startActivity(i);
            }
        });

        btnSAO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bsAO.getText().toString().isEmpty() ||
                        daAO.getText().toString().isEmpty() || // input data harus di isi dan tidak boleh kosong
                        nAO.getText().toString().isEmpty())
                {
                    bsAO.setError("Tidak Boleh Kosong");
                    daAO.setError("Tidak Boleh Kosong"); // menampilkan error jika input data kosong
                    nAO.setError("Tidak Boleh Kosong");
                }else {
                    Toast.makeText(getApplicationContext(),"Driver Sedang Menuju Tempat Anda", // setelah selesai input data akan menampilkan toast "Driver Sedang Menuju Tempat Anda"
                            Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplicationContext(), EndActivity.class); //jika input data sukses akan menuju ke halaman end
                    startActivity(i);
                }
            }
        });
    }
}