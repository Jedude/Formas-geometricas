package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class terceiraTriangulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_triangulo);

        Button bt= findViewById(R.id.avancarMenu);

        final TextView text=findViewById(R.id.areaTriangulo);

        Intent intenc=getIntent();
        String base=intenc.getStringExtra("BASE");
        double based = Double.parseDouble(base);
        String altura=intenc.getStringExtra("ALTURA");
        double alturad = Double.parseDouble(altura);
        double area= (based*alturad)/2;
        String resultado= String.valueOf(area);

        text.setText(resultado);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencao = new  Intent(terceiraTriangulo.this, MainActivity.class);
                startActivity(intencao);

            }
        });
    }
}
