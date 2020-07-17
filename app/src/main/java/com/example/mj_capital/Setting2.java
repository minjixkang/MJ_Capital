package com.example.mj_capital;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class Setting2 extends AppCompatActivity {

    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.setting);
        TextInputEditText requestamount = findViewById(R.id.requestamount);
        TextInputEditText repaymentdate = findViewById(R.id.repaymentdate);
        TextInputEditText descriptionset2 = findViewById(R.id.descriptionset2);
        TextInputEditText repaymenttimeline1 = findViewById(R.id.repaymentdatetl1);
        TextInputEditText repaymenttimeline2 = findViewById(R.id.repaymentdatetl2);
        TextInputEditText repaymenttimeline3 = findViewById(R.id.repaymentdatetl3);
        Button submitset2 = findViewById(R.id.button7);
    }
}
