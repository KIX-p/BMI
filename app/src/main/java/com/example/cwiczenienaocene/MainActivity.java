package com.example.cwiczenienaocene;

import static java.lang.Math.round;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText polewzrost = findViewById(R.id.polewzrost);
                EditText polewaga = findViewById(R.id.polewaga);
                TextView wynik = findViewById(R.id.wynik);
                int wzrost = Integer.parseInt(polewzrost.getText().toString());
                int waga = Integer.parseInt(polewaga.getText().toString());
                double bmi = waga/ ((wzrost / 100.0) * (wzrost / 100.0));
                bmi = round(bmi * 10.0) / 10.0;
                wynik.setText(String.valueOf(bmi));


                if(bmi < 18.5) {
                    Toast.makeText(getApplicationContext(), "Niedowaga", Toast.LENGTH_LONG).show();
                } else if (bmi >= 18.5 && bmi < 24.9) {
                    Toast.makeText(getApplicationContext(), "Waga prawidłowa", Toast.LENGTH_LONG).show();
                } else if (bmi >= 25 && bmi < 29.9) {
                    Toast.makeText(getApplicationContext(), "Nadwaga", Toast.LENGTH_LONG).show();
                } else if (bmi >= 30) {
                    Toast.makeText(getApplicationContext(), "Otyłość", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}