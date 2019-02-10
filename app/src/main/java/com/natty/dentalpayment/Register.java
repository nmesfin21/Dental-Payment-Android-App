package com.natty.dentalpayment;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * Created by Dell on 5/24/2018.
 */

public class Register extends Activity {

    public static final String FILE_NAME = "employee_data.txt";
    EmployeeDBHandler employeeDB;
    EditText fName = null;
    EditText lName = null;
    EditText bDate = null;
    EditText pNumber = null;
    EditText createPassword = null;
    EditText email = null;
    EditText confirmPassword = null;
    EditText uName = null;
    Button registerButton = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        fName = (EditText) findViewById(R.id.firstNameEditText);
        lName = (EditText) findViewById(R.id.lastNameEditText);
        bDate = (EditText) findViewById(R.id.dateEditText);
        pNumber = (EditText) findViewById(R.id.phoneNumberEditText);
        email = (EditText) findViewById(R.id.emailEditText);
        createPassword = (EditText) findViewById(R.id.createPasswordEditText);
        confirmPassword = (EditText) findViewById(R.id.reEnterPassowrdEditText);
        uName = (EditText) findViewById(R.id.userNameEditText);
        registerButton = (Button) findViewById(R.id.registerButton);


        employeeDB = new EmployeeDBHandler(this, null, null, 1);


    }

    public void addEmployee(Employee employee){
        boolean insertEmployee = employeeDB.addEmployee(employee);
        if(insertEmployee == true){
            Toast.makeText(this, "data succussfuly added", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(this, "data is not succussfuly added", Toast.LENGTH_SHORT).show();
        }
    }

    public void registerFunction(View view){

        Employee emp = new Employee();


        if(  fName.getText().toString().isEmpty()|| lName.getText().toString().isEmpty() ||
                uName.getText().toString().isEmpty() || createPassword.getText().toString().isEmpty()){
            Toast.makeText(this,"Fill all the necessary files", Toast.LENGTH_LONG).show();
        } else if(!createPassword.getText().toString().equals(confirmPassword.getText().toString())){
            Toast.makeText(this, "Password must match", Toast.LENGTH_SHORT).show();
        } else {
            if(fName.getText().toString().isEmpty()){
                fName.setText("");
            }
            if(lName.getText().toString().isEmpty()){
                lName.setText("");
            }

            if(uName.getText().toString().isEmpty()){
                uName.setText("");
            }

            if(pNumber.getText().toString().isEmpty()){
                pNumber.setText("");
            }

            if(email.getText().toString().isEmpty()){
                email.setText("");
            }

            if(bDate.getText().toString().isEmpty()){
                bDate.setText("");
            }

            if(createPassword.getText().toString().isEmpty()){
                createPassword.setText("");
            }

            emp.userName = uName.getText().toString();
            emp.firstName = fName.getText().toString();
            emp.lastName = lName.getText().toString();
            emp.dateOfBirth = bDate.getText().toString();
            emp.password = createPassword.getText().toString();
            emp.emailString = email.getText().toString();
            emp.phoneNumber = pNumber.getText().toString();
           addEmployee(emp);

            if(view.getId() == R.id.registerButton){
                Intent i = new Intent(Register.this, MainActivity.class);
                startActivity(i);
            }
        }

    }
}
