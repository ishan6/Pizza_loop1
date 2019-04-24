package com.example.pizza_loop1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private Button button;
    private TextView forgot_pass;
    private TextView sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        button = findViewById(R.id.button3);
        forgot_pass = findViewById(R.id.forgot_pass);
        sign_up = findViewById(R.id.sign_up);

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openlogin1();
            }
        });



    }

    public void openlogin1(){
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
}
