package com.example.s2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button accion;
    public EditText text;
    public EditText apellido;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        accion=(Button) findViewById(R.id.btnhola);
        text=  (EditText) findViewById(R.id.edtnombre);
        apellido= (EditText) findViewById(R.id.edtapellido);



    }

    public void accionclic(View view){

        String cadena=text.getText().toString();
        String ap=apellido.getText().toString();
        Toast.makeText(getApplicationContext(), cadena+ap+"Bienvenidos a Android", Toast.LENGTH_LONG).show();

    }

}