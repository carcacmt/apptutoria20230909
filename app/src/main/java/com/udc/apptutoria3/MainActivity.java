package com.udc.apptutoria3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.udc.apptutoria3.servicio.ConvertirDolar;
import com.udc.apptutoria3.servicio.ConvertirEuro;
import com.udc.apptutoria3.servicio.IConvertir;

public class MainActivity extends AppCompatActivity {
    private TextView pesoText;
    private EditText dolarText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pesoText = findViewById(R.id.pesotext);
        dolarText = findViewById(R.id.dolartext);
    }
    public void calcularObjecto(){
        IConvertir convertir = new ConvertirEuro(dolarText.getText().toString());
        pesoText.setText(convertir.convertirPesoString());
    }
     public void calcular(){
        int ndolar,peso;
        final int DOLAR_PESO=4100;
        ndolar =Integer.valueOf(dolarText.getText().toString());
        peso = ndolar * DOLAR_PESO;
        pesoText.setText(String.valueOf(peso));
     }
     public void calcularBoton(View view){
        calcularObjecto();
     }

}