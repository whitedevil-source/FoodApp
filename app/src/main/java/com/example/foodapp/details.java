package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.foodapp.R;

public class details extends AppCompatActivity {
    TextView inr, email, pword;
    String n, e, p;
    Button mb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        inr = findViewById(R.id.intro);
        email = findViewById(R.id.em);
        pword = findViewById(R.id.pw);
        mb2 = findViewById(R.id.b2);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            n = extras.getString("kNa");
            e = extras.getString("kEm");
            p = extras.getString("kPw");
            n = "HI!! " + n;

            email.setText(e);
            pword.setText(p);
            inr.setText(n);

        }
        mb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent j = new Intent(details.this,menu.class);
                startActivity(j);

            }
        });

    }
}