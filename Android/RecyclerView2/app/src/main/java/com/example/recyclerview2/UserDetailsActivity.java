package com.example.recyclerview2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class UserDetailsActivity extends Activity {
    TextView txtUsername;
    ImageView userImageView;
    User user;
    int userId;
    String username;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_details_activity);
        initView();
        extractInput();
    }

    private void initView() {
        userImageView = findViewById(R.id.userImageView);
        txtUsername = findViewById(R.id.txtUsername);
    }

    private void extractInput() {
        Intent intent = getIntent();
        user=(User) intent.getSerializableExtra("user");
        userId = user.userId;

        userImageView.setImageResource(R.mipmap.ic_launcher);
        txtUsername.setText(user.getUsername());
    }
}
