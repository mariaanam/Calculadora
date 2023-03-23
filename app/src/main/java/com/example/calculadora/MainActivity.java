package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView RT;
    EditText N1, N2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        RT = findViewById(R.id.resultado);
        N1 = findViewById(R.id.numero1);
        N2 = findViewById(R.id.numero2);
    }
    public void soma(View v){
        int n1 = Integer.parseInt(N1.getText().toString());
        int n2 = Integer.parseInt(N2.getText().toString());
        int res = n1 + n2;
        RT.setText(res+"");
        }
        public void subtracao(View v){
            int n1 = Integer.parseInt(N1.getText().toString());
            int n2 = Integer.parseInt(N2.getText().toString());
            int res = n1 - n2;
            RT.setText(res+"");
        }
        public void multiplicacao(View v){
            int n1 = Integer.parseInt(N1.getText().toString());
            int n2 = Integer.parseInt(N2.getText().toString());
            int res = n1 * n2;
            RT.setText(res+"");
        }
        public void divisao(View v){
            int n1 = Integer.parseInt(N1.getText().toString());
            int n2 = Integer.parseInt(N2.getText().toString());
            int res = n1 / n2;
            RT.setText(res+"");
        }
}