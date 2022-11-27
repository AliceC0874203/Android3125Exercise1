package com.example.android_3125_exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            double bmiValue = extras.getDouble("bmiValue");
            TextView bmiTextView = findViewById(R.id.bmiValue);
            bmiTextView.setText(""+bmiValue);
        }
    }
}