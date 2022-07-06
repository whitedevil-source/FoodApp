package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nvnew extends AppCompatActivity {
    Button b8,nv1,nv2,nv3,nv4;
    String choices_n="";
    Double price_n=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nvnew);
        b8=findViewById(R.id.b8);
        nv1=findViewById(R.id.nv1);
        nv2=findViewById(R.id.nv2);
        nv3=findViewById(R.id.nv3);
        nv4=findViewById(R.id.nv4);

    }
    public void add_to_list_n(View view){
        if(view==findViewById(R.id.nv1)){
            choices_n=choices_n+"CHICKEN BUTTER MASALA"+"\n";
            price_n=price_n+300.0;
        }
        if (view==findViewById(R.id.nv2)){
            choices_n=choices_n+"MUTTON KORMA"+"\n";
            price_n=price_n+400.0;
        }
        if (view==findViewById(R.id.nv3)){
            choices_n=choices_n+"PRAWN CHILLI"+"\n";
            price_n=price_n+320.0;
        }
        if (view==findViewById(R.id.nv4)){
            choices_n=choices_n+"EGG MASALA"+"\n";
            price_n=price_n+160.0;
        }
    }

    public void view_cart_n(View view){
        Intent in=new Intent(nvnew.this,cart.class);
        Bundle bundle2=new Bundle();
        bundle2.putString("choices_n",choices_n);
        bundle2.putDouble("price_n",price_n);
        in.putExtras(bundle2);
        startActivity(in);
    }

}