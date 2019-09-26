package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class segundaCirculo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_circulo);

        final EditText raio= findViewById(R.id.raioCirculo);

        Button bt= findViewById(R.id.avancarMenu);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencao = new  Intent(segundaCirculo.this, terceiraCirculo.class);
                String text = raio.getText().toString();
                intencao.putExtra("RAIO",text);
                startActivity(intencao);

            }
        });

    }
}
