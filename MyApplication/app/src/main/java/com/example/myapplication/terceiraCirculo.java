package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class terceiraCirculo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_circulo);

        final TextView text=findViewById(R.id.areaCirculo);

        Button bt= findViewById(R.id.avancarMenu);

        Intent intenc=getIntent();
        String resultado=intenc.getStringExtra("RAIO");
        double result = Double.parseDouble(resultado);
        double area= 3.1416* Math.pow(result,2);
        resultado= String.valueOf(area);

        text.setText(resultado);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencao = new  Intent(terceiraCirculo.this, MainActivity.class);
                startActivity(intencao);

            }
        });
    }
}
