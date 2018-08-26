package akhir.tugas.com.tugasakhir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GoogleLogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_log_in);

        Button next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener(){

            public void onClick (View argo) {
                Intent i = new Intent(getApplicationContext(), Start.class);
                startActivity(i);
                }
            }
        );
    }
}
