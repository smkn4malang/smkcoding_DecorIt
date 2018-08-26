package akhir.tugas.com.tugasakhir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        Button google = (Button) findViewById(R.id.google);
        google.setOnClickListener(new View.OnClickListener(){

                public void onClick (View argo) {
                    Intent i = new Intent(getApplicationContext(), GoogleLogIn.class);
                    startActivity(i);
                }
            }
        );

        Button email = (Button) findViewById(R.id.email);
        email.setOnClickListener(new View.OnClickListener(){

                public void onClick (View argo) {
                    Intent i = new Intent(getApplicationContext(), EmailLogIn.class);
                    startActivity(i);
                }
            }
        );
    }
}
