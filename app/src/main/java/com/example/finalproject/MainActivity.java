package com.example.finalproject;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;  //fungsi import untuk memanggil activity, menambah fungsi, membaca data string/int, meampilkan data dan masih banyak lagi


public class MainActivity extends AppCompatActivity {
    Button btnsign, btnDAFTAR;
    EditText edemail, edpassword; // mendeklarasi variable yg akan digunakan

    String nama, password; // untuk menyimpan emsil dan password

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsign = findViewById(R.id.btnsignin);
        btnDAFTAR = findViewById(R.id.btnDAFTAR); // menghubungkan dengan button,edit text dan text view yang digunakan pada layout
        edemail = findViewById(R.id.user);
        edpassword = findViewById(R.id.pass);

        btnDAFTAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), DaftarActivity.class);//untuk memindah layout saat di klik pada button Daftar
                startActivity(i);
            }
        });



        btnsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = edemail.getText().toString();
                password = edpassword.getText().toString();// untuk mengeset email dan pass saat login
                String email = "whildan";
                String pass = "123";

                if (nama.isEmpty() || password.isEmpty()) { // memastikan nama dan password tidak boleh kosong
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan Password tidak boleh kosong", Toast.LENGTH_LONG);// memunculkan error saat email dan password kosong
                    edemail.setError("Email dan Password tidak boleh kosong");
                    edpassword.setError("Email dan Password tidak boleh kosong");
                    t.show();

                } else {

                    if (nama.equals(email) && password.equals(pass)) {
                        Toast t = Toast.makeText(getApplicationContext(),// verifikasi email dan password sesuai dengan yang telah di setting
                                "Login Sukses", Toast.LENGTH_LONG);
                        t.show();
                        Bundle b = new Bundle();

                        b.putString("a", nama.trim());

                        b.putString("b", password.trim());

                        Intent i = new Intent(getApplicationContext(), HomeActivity.class); // jika login sukses maka akan berpindah ke layout home activity

                        i.putExtras(b);

                        startActivity(i);

                    } else {
                        Toast t = Toast.makeText(getApplicationContext(),// memunculkan error gagal saat verifikasi login tidak sesuai
                                "Login Gagal", Toast.LENGTH_LONG);
                        edemail.setError("Login Gagal");
                        edpassword.setError("Login Gagal");
                        t.show();
                    }
                }
            }
        });
    }
}