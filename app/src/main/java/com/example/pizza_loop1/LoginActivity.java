package com.example.pizza_loop1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private Button login;
    private TextView forgot_pass;
    private TextView sign_up;
    private TextView sign_up2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        login = findViewById(R.id.btn_login);
        forgot_pass = findViewById(R.id.lbl_forgot_pass);
        sign_up = findViewById(R.id.lbl_register);
        sign_up2 = findViewById(R.id.lbl_register2);

        sign_up2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToRegister();
            }
        });


        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToRegister();
            }
        });

        forgot_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToPassReset();
            }
        });

    }

    public void GoToRegister(){
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }

    public void GoToPassReset(){
        Intent intent = new Intent(this, PassResetActivity.class);
        startActivity(intent);
    }
}
