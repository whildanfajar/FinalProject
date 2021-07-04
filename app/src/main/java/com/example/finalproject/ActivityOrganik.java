package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityOrganik extends AppCompatActivity {
    TextView bsOtx,nOtx,daOtx;
    Button btnSO, btnBO;
    EditText bsO, daO, nO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organik);

        bsOtx = findViewById(R.id.bsOtx);
        nOtx = findViewById(R.id.nOtx);
        daOtx = findViewById(R.id.daOtx);
        btnSO = findViewById(R.id.btnSO);
        btnBO = findViewById(R.id.btnBO);
        bsO = findViewById(R.id.bsO);
        daO = findViewById(R.id.daO);
        nO = findViewById(R.id.nO);

        btnBO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(i);
            }
        });

        btnSO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bsO.getText().toString().isEmpty() ||
                    daO.getText().toString().isEmpty() ||
                    nO.getText().toString().isEmpty())
                {
                    bsO.setError("Tidak Boleh Kosong");
                    daO.setError("Tidak Boleh Kosong");
                    nO.setError("Tidak Boleh Kosong");
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