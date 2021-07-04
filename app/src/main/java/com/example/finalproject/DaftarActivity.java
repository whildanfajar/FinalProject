package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar;

public class DaftarActivity extends AppCompatActivity {

    EditText edtnama, edtemail, edtalamat, edtpassword, edtrepassword;
    Button btnBDAFTAR, btnSDAFTAR;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        edtnama = findViewById(R.id.edtnama);
        edtemail = findViewById(R.id.edtemail);
        edtalamat = findViewById(R.id.edtalamat);
        edtpassword = findViewById(R.id.edtpassword);
        edtrepassword = findViewById(R.id.edtrepassword);
        btnSDAFTAR = findViewById(R.id.btnSDAFTAR);
        btnBDAFTAR = findViewById(R.id.btnBDAFTAR);

        btnBDAFTAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);

            }
        });


        btnSDAFTAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtnama.getText().toString().isEmpty() ||
                        edtemail.getText().toString().isEmpty() ||
                        edtalamat.getText().toString().isEmpty() ||
                        edtpassword.getText().toString().isEmpty() ||
                        edtrepassword.getText().toString().isEmpty()) {
                    edtnama.setError("Masukkan Nama");
                    edtemail.setError("Masukkan Email");
                    edtalamat.setError("Masukkan Alamat");
                    edtpassword.setError("Masukkan Password");
                    edtrepassword.setError("Masukkan Re-Password");
                } else {
                    if (edtpassword.getText().toString().equals(edtrepassword.getText().toString())) {
                        Toast.makeText(getApplicationContext(), "registration is successful",
                                Toast.LENGTH_LONG).show();
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    } else {
                        Snackbar.make(view, "password and repassword must be same",
                                Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}