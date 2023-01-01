package com.example.datacommunicationbetweentwoactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    EditText edtInfo;
    Button btnNext;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitty_second);
        initializeViews();
        extractData();
        initializeListeners();
    }
    private void initializeListeners(){

    }
    private void initializeViews(){
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
    }
    private void extractData(){

    }
}
