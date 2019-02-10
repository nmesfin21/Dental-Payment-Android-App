package com.natty.dentalpayment;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

/**
 * Created by Dell on 5/29/2018.
 */

public class RegisterPatient extends Activity {
    EditText firstName = null;
    EditText lastName = null;
    EditText date = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patientregister);


    }
}
