package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class segundaRetangulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_retangulo);

        Button bt= findViewById(R.id.avancarMenu);

        final EditText base= findViewById(R.id.baseRetangulo);
        final EditText altura= findViewById(R.id.alturaRetangulo);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencao = new  Intent(segundaRetangulo.this, terceiraRetangulo.class);
                String text = base.getText().toString();
                intencao.putExtra("BASE",text);
                String text1 = altura.getText().toString();
                intencao.putExtra("ALTURA",text1);
                startActivity(intencao);

            }
        });
    }
}
