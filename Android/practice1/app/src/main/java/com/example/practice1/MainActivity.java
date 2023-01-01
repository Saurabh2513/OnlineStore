package com.example.practice1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button next;
EditText e1;
TextView t1;
String p1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        next.setOnClickListener(this);
    }
    public void initViews()
    {
        next=findViewById(R.id.next);
        e1=findViewById(R.id.edtInfo);
        t1=findViewById(R.id.text1);
    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("Information",e1.getText().toString());
        startActivityForResult(intent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bundle bundle=data.getExtras();
        p1=bundle.getString("data");
        t1.setText(p1);

    }
}