package com.koreait.myapp_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class BMIActivity_B extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiactivity_b);

        int height = getIntent().getIntExtra("height", 0);
        int weight = getIntent().getIntExtra("weight", 0);

        //
        double bmiValue = weight / Math.pow(height / 100.0, 2);
        String resultValue = "";
        if (bmiValue < 18.5) {
            resultValue = "저체중입니다.";
        } else if(bmiValue < 23) {
            resultValue = "정상체중";
        } else if(bmiValue < 25) {
            resultValue = "과체중 ";
        } else if(bmiValue < 30) {
            resultValue = "경도비만 ";
        } else if(bmiValue < 35) {
            resultValue = "중정도비만 ";
        } else {
            resultValue = "고도 비만";
        }
        //aaa.setTExt();
    }
}