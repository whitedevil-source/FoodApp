package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class cart extends AppCompatActivity {
    TextView listview1,listview2,priceview;
    String list_choice,list_choice_n;
    Double price_v,price_nv,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        listview1=findViewById(R.id.listview1);
        listview2=findViewById(R.id.listview2);
        priceview=findViewById(R.id.priceview);

        Bundle bundle=getIntent().getExtras();
        list_choice=bundle.getString("choices");
        price_v=bundle.getDouble("price");

        Bundle bundle2=getIntent().getExtras();
        list_choice_n=bundle2.getString("choices_n");
        price_nv=bundle2.getDouble("price_n");

        p=price_v+price_nv;

        listview1.setText(list_choice);
        listview2.setText(list_choice_n);
        priceview.setText("BILL: "+p.toString());

    }
}