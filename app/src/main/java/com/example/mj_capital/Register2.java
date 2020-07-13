package com.example.mj_capital;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class Register2 extends AppCompatActivity {

     public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState)
     {
          super.onCreate(savedInstanceState, persistentState);
          setContentView(R.layout.register2);
          TextInputEditText requestamount = findViewById(R.id.requestamount);
          TextInputEditText repaymentdate = findViewById(R.id.repaymentdate);
          TextInputEditText description = findViewById(R.id.description);
          TextInputEditText timeline1 = findViewById(R.id.timeline1);
          TextInputEditText timeline2 = findViewById(R.id.timeline2);
          TextInputEditText timeline3 = findViewById(R.id.timeline3);
          Button submit1 = findViewById(R.id.submit1);







     }

}

