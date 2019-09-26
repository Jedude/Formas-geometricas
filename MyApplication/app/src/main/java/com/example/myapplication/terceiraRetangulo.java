package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class terceiraRetangulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_retangulo);

        Button bt= findViewById(R.id.avancarMenu);

        final TextView text=findViewById(R.id.areaRetangulo);

        Intent intenc=getIntent();
        String base=intenc.getStringExtra("BASE");
        double based = Double.parseDouble(base);
        String altura=intenc.getStringExtra("ALTURA");
        double alturad = Double.parseDouble(altura);
        double area= based*alturad;
        String resultado= String.valueOf(area);

        text.setText(resultado);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencao = new  Intent(terceiraRetangulo.this, MainActivity.class);
                startActivity(intencao);

            }
        });
    }
}
