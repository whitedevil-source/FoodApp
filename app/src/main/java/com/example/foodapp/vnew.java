package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class vnew extends AppCompatActivity {
    Button b7,v1,v2,v3,v4;
    String choices="";
    Double price=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vnew);
        b7=findViewById(R.id.b7);
        v1=findViewById(R.id.v1);
        v2=findViewById(R.id.v2);
        v3=findViewById(R.id.v3);
        v4=findViewById(R.id.v4);

    }

    public void add_to_list(View view){
        if(view==findViewById(R.id.v1)){
            choices=choices+"PANEER BUTTER MASALA"+"\n";
            price=price+200.0;
        }
        if (view==findViewById(R.id.v2)){
            choices=choices+"VEG MANCHURIAN"+"\n";
            price=price+120.0;
        }
        if (view==findViewById(R.id.v3)){
            choices=choices+"MUSHROOM CHILLI"+"\n";
            price=price+180.0;
        }
        if (view==findViewById(R.id.v4)){
            choices=choices+"MALAI KOFTA"+"\n";
            price=price+150.0;
        }
    }

    public void view_cart(View view){
        Intent in=new Intent(vnew.this,cart.class);
        Bundle bundle=new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("price",price);
        in.putExtras(bundle);
        startActivity(in);
    }


}
