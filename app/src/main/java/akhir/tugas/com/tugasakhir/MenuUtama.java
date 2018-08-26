package akhir.tugas.com.tugasakhir;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterViewFlipper;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MenuUtama extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        ImageView profile = (ImageView) findViewById(R.id.profil);
        profile.setOnClickListener(new View.OnClickListener(){

            public void onClick (View argo) {
                Intent i = new Intent(getApplicationContext(), Profile.class);
                startActivity(i);
                }
        });

        LinearLayout barang1 = (LinearLayout) findViewById(R.id.barang1);
        barang1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View argo) {
                Intent i = new Intent(getApplicationContext(), TampilanBarang.class);
                startActivity(i);
            }
        });

        LinearLayout barang2 = (LinearLayout) findViewById(R.id.barang2);
        barang2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View argo) {
                Intent i = new Intent(getApplicationContext(), TampilanBarang.class);
                startActivity(i);
            }
        });

        LinearLayout barang3 = (LinearLayout) findViewById(R.id.barang3);
        barang3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View argo) {
                Intent i = new Intent(getApplicationContext(), TampilanBarang.class);
                startActivity(i);
            }
        });

        LinearLayout barang4 = (LinearLayout) findViewById(R.id.barang4);
        barang4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View argo) {
                Intent i = new Intent(getApplicationContext(), TampilanBarang.class);
                startActivity(i);
            }
        });
    }
}
