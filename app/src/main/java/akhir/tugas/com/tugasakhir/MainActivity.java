package akhir.tugas.com.tugasakhir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class  MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signin = (Button) findViewById(R.id.signin);
        signin.setOnClickListener(new View.OnClickListener(){

                public void onClick (View argo) {
                    Intent i = new Intent(getApplicationContext(), SignIn.class);
                    startActivity(i);
                }
            }
        );

        Button login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener(){

                public void onClick (View argo) {
                    Intent i = new Intent(getApplicationContext(), LogIn.class);
                    startActivity(i);
                }
            }
        );


    }
}
