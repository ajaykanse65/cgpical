package com.example.cgpacalculate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomePageActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private Button calculate;
    private TextView result;
    private Button record;
    private Button data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        num1 = (EditText)findViewById(R.id.etNum1);
        num2 = (EditText)findViewById(R.id.etNum2);
        calculate=(Button)findViewById(R.id.btnclaculate);
        result=(TextView)findViewById(R.id.tvAnswer);
        record=(Button)findViewById(R.id.btadd);
        data=( Button)findViewById(R.id.btsave);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float number1 = Float.parseFloat( num1.getText().toString());
                float number2 = Float.parseFloat( num2.getText().toString());
                float cgpa=number2/number1;
                result.setText("CGPA:" + String.valueOf(cgpa));
            }
        });
        record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomePageActivity.this,AddActivity.class);
                startActivity(intent);

            }
        });
        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomePageActivity.this,SaveActivity.class);
                startActivity(intent);
            }
        });


    }
}