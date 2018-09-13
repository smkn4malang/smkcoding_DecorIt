package com.example.asus.decorit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class KategoriRuangTamu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori_ruang_tamu);

        ImageView back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriRuangTamu.this, KategoriDesign.class);
                startActivity(i);
            }
        });

        LinearLayout item1 = (LinearLayout) findViewById(R.id.item1);
        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriRuangTamu.this, TampilanDesign.class);
                startActivity(i);
            }
        });

        LinearLayout item2 = (LinearLayout) findViewById(R.id.item2);
        item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriRuangTamu.this, TampilanDesign.class);
                startActivity(i);
            }
        });

        LinearLayout item3 = (LinearLayout) findViewById(R.id.item3);
        item3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriRuangTamu.this, TampilanDesign.class);
                startActivity(i);
            }
        });

        LinearLayout item4 = (LinearLayout) findViewById(R.id.item4);
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriRuangTamu.this, TampilanDesign.class);
                startActivity(i);
            }
        });

        LinearLayout item5 = (LinearLayout) findViewById(R.id.item5);
        item5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriRuangTamu.this, TampilanDesign.class);
                startActivity(i);
            }
        });

        LinearLayout item6 = (LinearLayout) findViewById(R.id.item6);
        item6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriRuangTamu.this, TampilanDesign.class);
                startActivity(i);
            }
        });

        LinearLayout item7 = (LinearLayout) findViewById(R.id.item7);
        item7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriRuangTamu.this, TampilanDesign.class);
                startActivity(i);
            }
        });

        LinearLayout item8 = (LinearLayout) findViewById(R.id.item8);
        item8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriRuangTamu.this, TampilanDesign.class);
                startActivity(i);
            }
        });

        LinearLayout item9 = (LinearLayout) findViewById(R.id.item9);
        item9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriRuangTamu.this, TampilanDesign.class);
                startActivity(i);
            }
        });

        LinearLayout item10 = (LinearLayout) findViewById(R.id.item10);
        item10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KategoriRuangTamu.this, TampilanDesign.class);
                startActivity(i);
            }
        });
    }
}
