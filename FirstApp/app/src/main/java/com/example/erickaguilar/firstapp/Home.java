package com.example.erickaguilar.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void dadosUsuario(View view) {
        TextView rgm = (TextView) findViewById(R.id.txtAuto);
        TextView nome = (TextView) findViewById(R.id.txtNome);

        rgm.setText("RGM: 17846641");
        nome.setText("Erick Silva Aguilar");
    }
    public void Auto(View view) {
        TextView auto = (TextView) findViewById(R.id.txtAuto);
        auto.setText("AUTO");
    }

}
