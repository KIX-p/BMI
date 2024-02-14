package com.example.cwiczenienaocene;

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
                int waga = Integer.parseInt(polewzrost.getText().toString());
                int bmi = waga/(wzrost/100);
                wynik.setText(getText(bmi));
            }
        });
    }
}