package com.example.konversisuhu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText text1 , text2, text3, text4;
    Button conver;
    float hsl1, hsl2, hsl3, hsl4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (EditText) findViewById(R.id.celcius);
        text2 = (EditText) findViewById(R.id.kelvin);
        text3 = (EditText) findViewById(R.id.farenheit);
        text4 = (EditText) findViewById(R.id.reamur);
        conver = (Button) findViewById(R.id.btn_konversi);
        conver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hsl1 = Float.parseFloat(text1.getText().toString().trim());
                hsl2 = (hsl1*9/5)+32;
                hsl3 = hsl1 + 273;
                hsl4 = (float) (0.8 * hsl1);

                text2.setText(hsl2+"");
                text3.setText(hsl3+"");
                text4.setText(hsl4+"");
            }
        });
    }
}
