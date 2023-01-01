package com.example.dialogsdemo;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.Button;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Step1 creating variables
    Button btnLogin1, btnLogin2, btnLogin3, btnLogout;
    EditText edtUsername,edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initListeners();
    }
//Step2 initialize views
    private void initViews(){
        btnLogin1 = findViewById(R.id.btnLogin1);
        btnLogin2 = findViewById(R.id.btnLogin2);
        btnLogin3 = findViewById(R.id.btnLogin3);
    }
//step3 initialize listener
    private void initListeners(){
        btnLogin1.setOnClickListener(new BtnLogin1ClickListener());
        //btnLogin2.setOnClickListener(new BtnLogin2ClickListener());
        //btnLogin3.setOnClickListener(new BtnLogin3CLickListener());
    }

    //way 1
    class BtnLogin1ClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Dialog logoutDialog = new Dialog(MainActivity.this);
            logoutDialog.setContentView(R.layout.logout_dialog);
            edtUsername = logoutDialog.findViewById(R.id.edtUsername);
            edtPassword = logoutDialog.findViewById(R.id.edtPassword);
            btnLogout = logoutDialog.findViewById(R.id.btnLogout);
            btnLogout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(edtUsername.getText().toString().equals("krishna") && edtPassword.getText().toString().equals("krishna123")){
                        makeToast("Logout Action Successful!");
                        logoutDialog.dismiss();
                    } else{
                        makeToast("Logout Failed!");
                    }
                }
            });
            logoutDialog.show();
        }
    }

    private void makeToast(String text){
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }

}