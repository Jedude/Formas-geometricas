package com.example.myapplication;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup groupOpcao;
    private RadioButton opcaoSel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioButton quadrado= findViewById(R.id.opcaoQuadrado);
        RadioButton triangulo= findViewById(R.id.opcaoCirculo);
        final RadioButton circulo= findViewById(R.id.opcaoCirculo);
        TextView titulo= findViewById(R.id.titulo);

        Button bt= findViewById(R.id.avancarMenu);
        bt.setText("Avançar");

//        final RadioGroup group = (RadioGroup) findViewById(R.id.group);
//        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                RadioButton button = (RadioButton) group.findViewById(checkedId);
//                String resposta = button.getText().toString();
//            }
//        });

        groupOpcao=findViewById(R.id.group);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId=groupOpcao.getCheckedRadioButtonId();
                opcaoSel=findViewById(selectedId);
                if(opcaoSel==circulo){
                    Intent intencao = new Intent(MainActivity.this, segundaCirculo.class);
                    startActivity(intencao);
                }else if(opcaoSel==quadrado){
                    Intent intencao = new Intent(MainActivity.this, segundaRetangulo.class);
                    startActivity(intencao);
                }else {
                    Intent intencao = new Intent(MainActivity.this, segundaTriangulo.class);
                    startActivity(intencao);
                }

            }
        });

    }
}
