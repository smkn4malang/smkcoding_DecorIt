package com.example.asus.decorit;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;

public class MenuAwal extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_awal);

        ImageView profile = (ImageView)findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuAwal.this, TampilanProfile.class);
                startActivity(i);
            }
        });

        RelativeLayout furniture = (RelativeLayout) findViewById(R.id.kategorifurniture);
        furniture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuAwal.this, KategoriFurniture.class);
                startActivity(i);
            }
        });

        RelativeLayout design = (RelativeLayout) findViewById(R.id.kategoridesign);
        design.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuAwal.this, KategoriDesign.class);
                startActivity(i);
            }
        });

        LinearLayout item1 = (LinearLayout) findViewById(R.id.item1);
        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuAwal.this, TampilanBarang.class);
                startActivity(i);
            }
        });

        LinearLayout item2 = (LinearLayout) findViewById(R.id.item2);
        item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuAwal.this, TampilanBarang.class);
                startActivity(i);
            }
        });

        LinearLayout item3 = (LinearLayout) findViewById(R.id.item3);
        item3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuAwal.this, TampilanBarang.class);
                startActivity(i);
            }
        });

        LinearLayout item4 = (LinearLayout) findViewById(R.id.item4);
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuAwal.this, TampilanBarang.class);
                startActivity(i);
            }
        });

        LinearLayout item5 = (LinearLayout) findViewById(R.id.item5);
        item5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuAwal.this, TampilanBarang.class);
                startActivity(i);
            }
        });
    }
}
