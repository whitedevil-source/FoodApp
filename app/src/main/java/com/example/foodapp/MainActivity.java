package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.foodapp.R;

public class MainActivity extends AppCompatActivity {
    Button mb1;
    EditText na, em, pw;
    String name,email,pword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mb1 = findViewById(R.id.b1);
        na = findViewById(R.id.name);
        em = findViewById(R.id.email);
        pw = findViewById(R.id.pword);

        mb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name=na.getText().toString();
                email=em.getText().toString();
                pword=pw.getText().toString();
                Intent i = new Intent(MainActivity.this, details.class);
                i.putExtra("kNa",name);
                i.putExtra("kEm",email);
                i.putExtra("kPw",pword);
                startActivity(i);

            }
        });

    }
}