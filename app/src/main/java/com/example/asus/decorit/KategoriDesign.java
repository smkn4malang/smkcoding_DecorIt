package com.example.asus.decorit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class KategoriDesign extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori_design);

        RelativeLayout dapur = (RelativeLayout) findViewById(R.id.kategoridapur);
        dapur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriDesign.this, KategoriDapur.class);
                startActivity(i);
            }
        });

        RelativeLayout kamarmandi = (RelativeLayout) findViewById(R.id.kategorikamarmandi);
        kamarmandi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriDesign.this, KategoriKamarMandi.class);
                startActivity(i);
            }
        });

        RelativeLayout kamar = (RelativeLayout) findViewById(R.id.kategorikamar);
        kamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriDesign.this, KategoriKamar.class);
                startActivity(i);
            }
        });

        RelativeLayout ruangtamu = (RelativeLayout) findViewById(R.id.kategoriruangtamu);
        ruangtamu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriDesign.this, KategoriRuangTamu.class);
                startActivity(i);
            }
        });

        LinearLayout item1 = (LinearLayout) findViewById(R.id.item1);
        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriDesign.this, TampilanDesign.class);
                startActivity(i);
            }
        });

        LinearLayout item2 = (LinearLayout) findViewById(R.id.item2);
        item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriDesign.this, TampilanDesign.class);
                startActivity(i);
            }
        });

        LinearLayout item3 = (LinearLayout) findViewById(R.id.item3);
        item3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriDesign.this, TampilanDesign.class);
                startActivity(i);
            }
        });

        LinearLayout item4 = (LinearLayout) findViewById(R.id.item4);
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriDesign.this, TampilanDesign.class);
                startActivity(i);
            }
        });

        LinearLayout item5 = (LinearLayout) findViewById(R.id.item5);
        item5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriDesign.this, TampilanDesign.class);
                startActivity(i);
            }
        });

        ImageView back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriDesign.this, MenuAwal.class);
                startActivity(i);
            }
        });
    }
}