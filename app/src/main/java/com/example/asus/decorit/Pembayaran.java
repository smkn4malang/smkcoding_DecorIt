package com.example.asus.decorit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Pembayaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);

        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        String[] countries = {"Cash", "Transfer", "Balance"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,countries);
        spinner.setAdapter(adapter);

        Button confirm = (Button) findViewById(R.id.confirm);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pembayaran.this, TampilanBarang.class);
                Toast.makeText(Pembayaran.this, "Your Payment is being Confirmed", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }
}
