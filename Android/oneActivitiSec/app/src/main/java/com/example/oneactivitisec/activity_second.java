package com.example.oneactivitisec;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class activity_second extends Activity {
    TextView txtInfo;
    Button btnPrevious;
    EditText edtResult;

    String information;
    int code;
    boolean isValue;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initializeViews();
        extractData();
        initializeListeners();
    }

    private void initializeListeners(){
        btnPrevious.setOnClickListener(new BtnPreviousClickListener());
    }

    private void initializeViews(){
        txtInfo = findViewById(R.id.txtInfo);
        btnPrevious = findViewById(R.id.btnPrevious);
        edtResult = findViewById(R.id.edtResult);
    }

    private void extractData(){

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        information = bundle.getString("information");
        code = bundle.getInt("code");
        isValue = bundle.getBoolean("isValue");

        txtInfo.setText(information +"-----"+code);
    }

    class BtnPreviousClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {

            Intent resIntent = new Intent();
            resIntent.putExtra("result",edtResult.getText().toString());
            setResult(1,resIntent);
            finish();
        }
    }
}

