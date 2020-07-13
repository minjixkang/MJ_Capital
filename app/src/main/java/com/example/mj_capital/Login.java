package com.example.mj_capital;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class Login extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.login);
        Button login = findViewById(R.id.button);
        Button register = findViewById(R.id.button2);
        TextInputEditText username = findViewById(R.id.username1);
        TextInputEditText password = findViewById(R.id.password1);
        Button enter = findViewById(R.id.enter);
        Button forgot = findViewById(R.id.forgot);


    }
}

