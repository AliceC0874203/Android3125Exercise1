package com.example.android_3125_exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText height, mass;
    private Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height = findViewById(R.id.edt1);
        mass = findViewById(R.id.edt2);
        calculate = findViewById(R.id.btnCal);
    }

    public void calculate(View view) {
        String heightText = height.getText().toString();
        String massText = mass.getText().toString();

        if (heightText.isEmpty() || massText.isEmpty()) {
            Toast.makeText(this, "Please input number Height(Meter) and Mass(KG)", Toast.LENGTH_LONG).show();
        } else {
            // to usd
            double heightDouble = Double.parseDouble(heightText);
            double massDouble = Double.parseDouble(massText);
            double bmiValue = massDouble/(heightDouble*2);
            Toast.makeText(this, "Your BMI = " + bmiValue, Toast.LENGTH_LONG).show();
            goToBMIActivity(bmiValue);
        }
    }

    public void goToBMIActivity(double bmiValue) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("bmiValue", bmiValue);
        startActivity(intent);
    }
}