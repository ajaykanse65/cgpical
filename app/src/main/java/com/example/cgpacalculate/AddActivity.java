package com.example.cgpacalculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;

public class AddActivity extends AppCompatActivity {
    private EditText semno;
    private EditText cgpa;
    private Button asave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        semno=findViewById(R.id.etsemno);
        cgpa=findViewById(R.id.etcgpa);
        asave=findViewById(R.id.btasave);
    }
}