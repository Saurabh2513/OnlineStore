package com.example.practice1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity
{
    EditText e2;
    TextView t2;
    Button Previous;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        initViews();

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        t2.setText(bundle.getString("Information"));
        Previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(SecondActivity.this,MainActivity.class);
                intent1.putExtra("data",e2.getText().toString());
                setResult(1,intent1);
                finish();
            }
        });
    }
    public void initViews()
    {
        e2=findViewById(R.id.edtInfo1);
        t2=findViewById(R.id.edtInfo1);
        Previous=findViewById(R.id.next1);
    }
}
