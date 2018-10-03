package com.example.asus.decorit;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import butterknife.BindView;

public class TampilanRegister extends AppCompatActivity {

    private EditText inputusername, inputemail;
    private TextInputEditText inputpassword, inputconfirmpassword;
    private TextView txtlogin;
    private Button btnregister;
    private ProgressBar progressBar;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_register);
        mAuth = FirebaseAuth.getInstance();

        inputemail = (EditText)findViewById(R.id.email);
        inputpassword = (TextInputEditText) findViewById(R.id.inputpassword);
        inputconfirmpassword = (TextInputEditText)findViewById(R.id.inputconfirmpassword);
        btnregister = (Button)findViewById(R.id.register);
        txtlogin = (TextView) findViewById(R.id.login);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = inputemail.getText().toString().trim();
                String password = inputpassword.getText().toString().trim();
                String confirmpassword = inputconfirmpassword.getText().toString().trim();

                if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password) || TextUtils.isEmpty(confirmpassword)) {
                    Toast.makeText(getApplicationContext(), "Please Enter All Field!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(!password.equals(confirmpassword)){
                    Toast.makeText(getApplicationContext(), "Password Tidak Sama", Toast.LENGTH_SHORT).show();
                    return;
                }

                progressBar.setVisibility(View.VISIBLE);
                mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(TampilanRegister.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                Toast.makeText(TampilanRegister.this, "Register Berhasil", Toast.LENGTH_SHORT).show();
                                progressBar.setVisibility(View.GONE);
                                if (!task.isSuccessful()) {
                                    Toast.makeText(TampilanRegister.this, "Register Gagal",
                                            Toast.LENGTH_SHORT).show();
                                } else {
                                    startActivity(new Intent(TampilanRegister.this, MenuAwal.class));
                                    finish();
                                }
                            }
                        });
            }
        });

        txtlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TampilanRegister.this, MainActivity.class));
                finish();
            }
        });
    }
}