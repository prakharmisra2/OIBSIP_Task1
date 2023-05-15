package com.example.kmtomile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonConvMileToKm = findViewById(R.id.buttonConvertMileToKm);

        buttonConvMileToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextMile = findViewById(R.id.editTextMiles);
                EditText editTextKm = findViewById(R.id.editTextKm);
                Double Miles = Double.valueOf(editTextMile.getText().toString());
                Double Km = Miles/0.62137;
                DecimalFormat formatvalue = new DecimalFormat("##.##");
                formatvalue.format(Km);
                editTextKm.setText(formatvalue.format(Km));

            }
        });
        Button buttonConvKmToMile = findViewById(R.id.buttonConvertKmToMile);
        buttonConvKmToMile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextKm = findViewById(R.id.editTextKm);
                EditText editTextMile = findViewById(R.id.editTextMiles);
                Double Km = Double.valueOf(editTextKm.getText().toString());
                Double Mile = Km * 0.62137;
                DecimalFormat formatval = new DecimalFormat("##.##");
                editTextMile.setText(formatval.format(Mile));

            }
        });
    }
}