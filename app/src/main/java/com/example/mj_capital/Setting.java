package com.example.mj_capital;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class Setting extends AppCompatActivity {

    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.setting);
        TextInputEditText nameset = findViewById(R.id.nameset);
        TextInputEditText dobset = findViewById(R.id.dobset);
        TextInputEditText descriptionset = findViewById(R.id.descriptionset);
        TextInputEditText usernameset = findViewById(R.id.usernameset);
        TextInputEditText passwordset = findViewById(R.id.passwordset);
        TextInputEditText cpasswordset = findViewById(R.id.cpasswordset);
        Button submitset = findViewById(R.id.submitset);
    }
}
