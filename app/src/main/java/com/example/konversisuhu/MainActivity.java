package com.example.konversisuhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtCel, txtKel, txtFah, txtRea;
    Button btnKonv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Konversi Suhu Celcius");

        txtCel = (EditText)findViewById(R.id.txtCel);
        txtKel = (EditText)findViewById(R.id.txtKel);
        txtFah = (EditText)findViewById(R.id.txtFah);
        txtRea = (EditText)findViewById(R.id.txtRea);
        btnKonv = (Button) findViewById(R.id.btnKonv);

        btnKonv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Cel = txtCel.getText().toString();

                double c = Double.parseDouble(Cel);
                double k;
                double f;
                double r;

                k = c+273;
                f = c*1.8+32;
                r = c*0.8;

                txtKel.setText(k+"");
                txtFah.setText(f+"");
                txtRea.setText(r+"");

            }
        });
    }
}
