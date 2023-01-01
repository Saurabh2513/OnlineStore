package com.example.btncolor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView textView1, textView2, textView3;
        EditText editText;
        Button button;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().equals("1")) {
                    textView1.setBackgroundColor(Color.BLUE);
                    textView2.setBackgroundColor(Color.YELLOW);
                    textView2.setTextColor(Color.BLACK);
                    textView3.setBackgroundColor(Color.YELLOW);
                    textView3.setTextColor(Color.BLACK);

                } else if (editText.getText().toString().equals("2")) {
                    textView2.setBackgroundColor(Color.BLUE);
                    textView1.setBackgroundColor(Color.GREEN);
                    textView1.setTextColor(Color.BLACK);
                    textView3.setBackgroundColor(Color.GREEN);
                    textView3.setTextColor(Color.BLACK);

                } else if (editText.getText().toString().equals("3")) {
                    textView3.setBackgroundColor(Color.BLUE);
                    textView1.setBackgroundColor(Color.RED);
                    textView1.setTextColor(Color.BLACK);
                    textView2.setBackgroundColor(Color.RED);
                    textView2.setTextColor(Color.BLACK);

                }
                else{
                    Toast.makeText(getApplicationContext(),"enter 1,2,3",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}