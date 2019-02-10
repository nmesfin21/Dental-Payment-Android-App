package com.natty.dentalpayment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    EmployeeDBHandler employeeDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginFunction(View view){


        if(view.getId() == R.id.loginButton){
            Intent i = new Intent(MainActivity.this, Bill.class);
            startActivity(i);
        }

    }

    public void registerFunction(View view){
        if(view.getId() == R.id.registerButton){
            Intent g = new Intent(MainActivity.this, Register.class);
            startActivity(g);
        }

    }

}
