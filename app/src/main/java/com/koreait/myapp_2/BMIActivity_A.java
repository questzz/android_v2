package com.koreait.myapp_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BMIActivity_A extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiactivity_a);

        EditText etHeight = findViewById(R.id.etHeight);
        EditText etWeight = findViewById(R.id.etWeight);
        Button btnIsOk = findViewById(R.id.btnIsOk);

        btnIsOk.setOnClickListener(view -> {
            if (etHeight.getText().length() < 1 || etWeight.getText().length() < 1) {
                Log.d("TAG", "is NUll");
                Toast.makeText(this, "빈 값이 있습니다.", Toast.LENGTH_SHORT).show();
                return;
            } else {
                int height = Integer.parseInt(etHeight.getText().toString());
                int weight = Integer.parseInt(etWeight.getText().toString());
                Intent intent = new Intent(this, BMIActivity_B.class);
                intent.putExtra("height", height);
                intent.putExtra("weight", weight);
                Log.d("TAG", "height :" + height);
                Log.d("TAG", "weight :" + weight);
                startActivity(intent);
            }
        });

    }
}