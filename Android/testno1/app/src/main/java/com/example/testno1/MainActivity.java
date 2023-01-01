package com.example.testno1;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userName, password, phoneNo;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeView();
        initializeListeners();

    }
    private void initializeView() {
        userName = findViewById(R.id.username);
        password = findViewById(R.id.pass);
        phoneNo = findViewById(R.id.number);
        login = findViewById(R.id.login);

    }

    private void initializeListeners() {
        login.setOnClickListener(new ButtonLoginClickListener());

    }


    private class ButtonLoginClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {


            if (userName.getText().toString().equals("saurabh") && password.getText().toString().equals("saurabh12")) {
                Intent intent = new Intent(MainActivity.this, dateTimeConversion.class);
                intent.putExtra("userN", userName.getText().toString());
                intent.putExtra("phone_", phoneNo.getText().toString());
                startActivity(intent);

            }
            else{
                Toast.makeText(MainActivity.this,"Put Valid Username & Password",Toast.LENGTH_SHORT).show();
            }
        }
    }
}