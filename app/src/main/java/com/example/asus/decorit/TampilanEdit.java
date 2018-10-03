package com.example.asus.decorit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TampilanEdit extends AppCompatActivity {

    public static final String  EXTRA_NAME = "EXTRA_NAME";

    @BindView(R.id.editname)
    EditText editName;
    @BindView(R.id.update)
    Button Update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_edit);
        ButterKnife.bind(this);

//        Button update = (Button)findViewById(R.id.update);
//        update.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(TampilanEdit.this, TampilanProfile.class);
//                startActivity(i);
//            }
//        });
    }

    @OnClick(R.id.update)
    public void onViewClicked() {
        String name = editName.getText().toString();
        Intent intent = new Intent();
        intent.putExtra( EXTRA_NAME , name);
        setResult( RESULT_OK , intent);
        finish();
    }
}
