package com.example.sistemas.enviodemercancias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText xet1, xet2, xet3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        xet1= findViewById(R.id.edt1);
        xet2= findViewById(R.id.edt2);
        xet3= findViewById(R.id.edt3);



    }

    public void Enviar(View view){

        Intent intento =new Intent(this, Main2Activity.class);

        intento.putExtra("Dato1", xet1.getText().toString());
        intento.putExtra("Dato2", xet2.getText().toString());
        startActivity(intento);
    }

    public void navegar(View view){

        Intent intento= new Intent(this, Main3Activity.class);
        intento.putExtra("URL", xet3.getText().toString());
        startActivity(intento);

    }
}
