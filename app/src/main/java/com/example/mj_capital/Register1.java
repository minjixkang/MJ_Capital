package com.example.mj_capital;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;

public class Register1 extends AppCompatActivity {
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState)
    {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.register1);
        CheckBox loaner = findViewById(R.id.checkBox);
        CheckBox register = findViewById(R.id.checkBox2);
        TextInputEditText name = findViewById(R.id.name);
        TextInputEditText dob = findViewById(R.id.dob);
        TextInputEditText email = findViewById(R.id.email);
        TextInputEditText username = findViewById(R.id.username);
        TextInputEditText password = findViewById(R.id.password);
        TextInputEditText cpassword = findViewById(R.id.cpassword);
        Button submit = findViewById(R.id.submit);
    }
    }
