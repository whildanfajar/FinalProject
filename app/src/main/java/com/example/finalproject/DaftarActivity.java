package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar; //import untuk memanggil activity, menambah fungsi, membaca data string/int, meampilkan data dan masih banyak lagi

public class DaftarActivity extends AppCompatActivity {

    EditText edtnama, edtemail, edtalamat, edtpassword, edtrepassword; //deklarasi variabel
    Button btnBDAFTAR, btnSDAFTAR;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        edtnama = findViewById(R.id.edtnama);
        edtemail = findViewById(R.id.edtemail);
        edtalamat = findViewById(R.id.edtalamat);
        edtpassword = findViewById(R.id.edtpassword);
        edtrepassword = findViewById(R.id.edtrepassword); // menghubungkan dengan button,edit text dan text view yang digunakan pada layout
        btnSDAFTAR = findViewById(R.id.btnSDAFTAR);
        btnBDAFTAR = findViewById(R.id.btnBDAFTAR);

        btnBDAFTAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);// button untuk kembali ke halaman Main activity
                startActivity(i);
            }
        });


        btnSDAFTAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtnama.getText().toString().isEmpty() ||
                        edtemail.getText().toString().isEmpty() || //input data tidak boleh kosong
                        edtalamat.getText().toString().isEmpty() ||
                        edtpassword.getText().toString().isEmpty() ||
                        edtrepassword.getText().toString().isEmpty()) {
                    edtnama.setError("Masukkan Nama");
                    edtemail.setError("Masukkan Email");
                    edtalamat.setError("Masukkan Alamat");
                    edtpassword.setError("Masukkan Password");
                    edtrepassword.setError("Masukkan Re-Password");// menampilkan error jika ada input yang kosong
                } else {
                    if (edtpassword.getText().toString().equals(edtrepassword.getText().toString())) {//mengecek password dan repassword harus sama
                        Toast.makeText(getApplicationContext(), "registration is successful", // menampilkkan jika registrasi suskses
                                Toast.LENGTH_LONG).show();
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);//jika registrasi sukses akan menuju ke main activity
                        startActivity(i);
                    } else {
                        Snackbar.make(view, "password and repassword must be same",//menampilkan snackbar password dan repass harus sama
                                Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}