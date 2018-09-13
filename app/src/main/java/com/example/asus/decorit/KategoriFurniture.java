package com.example.asus.decorit;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class KategoriFurniture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori_furniture);

        RelativeLayout kursi = (RelativeLayout) findViewById(R.id.kategorikursi);
        kursi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriFurniture.this, KategoriKursi.class);
                startActivity(i);
            }
        });

        RelativeLayout rakbuku = (RelativeLayout) findViewById(R.id.kategorirakbuku);
        rakbuku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriFurniture.this, KategoriRakBuku.class);
                startActivity(i);
            }
        });

        RelativeLayout lemari = (RelativeLayout) findViewById(R.id.kategorilemari);
        lemari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriFurniture.this, KategoriLemari.class);
                startActivity(i);
            }
        });

        RelativeLayout meja = (RelativeLayout) findViewById(R.id.kategorimeja);
        meja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriFurniture.this, KategoriMeja.class);
                startActivity(i);
            }
        });

        LinearLayout item1 = (LinearLayout) findViewById(R.id.item1);
        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriFurniture.this, TampilanBarang.class);
                startActivity(i);
            }
        });

        LinearLayout item2 = (LinearLayout) findViewById(R.id.item2);
        item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriFurniture.this, TampilanBarang.class);
                startActivity(i);
            }
        });

        LinearLayout item3 = (LinearLayout) findViewById(R.id.item3);
        item3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriFurniture.this, TampilanBarang.class);
                startActivity(i);
            }
        });

        LinearLayout item4 = (LinearLayout) findViewById(R.id.item4);
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriFurniture.this, TampilanBarang.class);
                startActivity(i);
            }
        });

        LinearLayout item5 = (LinearLayout) findViewById(R.id.item5);
        item5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriFurniture.this, TampilanBarang.class);
                startActivity(i);
            }
        });

        ImageView back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriFurniture.this, MenuAwal.class);
                startActivity(i);
            }
        });
    }
}
