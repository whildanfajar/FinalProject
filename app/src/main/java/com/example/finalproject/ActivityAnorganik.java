package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityAnorganik extends AppCompatActivity {

    TextView bsAOtx,nAOtx,daAOtx;
    Button btnSAO, btnBAO;
    EditText bsAO, daAO, nAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anorganik);

        bsAOtx = findViewById(R.id.bsAOtx);
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
                Intent i = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(i);
            }
        });

        btnSAO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bsAO.getText().toString().isEmpty() ||
                        daAO.getText().toString().isEmpty() ||
                        nAO.getText().toString().isEmpty())
                {
                    bsAO.setError("Tidak Boleh Kosong");
                    daAO.setError("Tidak Boleh Kosong");
                    nAO.setError("Tidak Boleh Kosong");
                }else {
                    Toast.makeText(getApplicationContext(),"Driver Sedang Menuju Tempat Anda",
                            Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplicationContext(), EndActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}