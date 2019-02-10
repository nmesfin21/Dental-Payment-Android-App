package com.natty.dentalpayment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

public class Bill extends Activity {
    int cleaningValue = 0;
    int fluorideValue = 0;
    int cavityValue = 0;
    int xRayValue = 0;
    double total = 0;
    String otherValueString;
    CheckBox cleaningCheckBox = null;
    CheckBox cavityCheckBox = null;
    CheckBox fluorideCheckBox = null;
    CheckBox xRayCheckBox = null;
    CheckBox otherCheckBox = null;
    EditText theOtherEditText = null;
    EditText resultEditText = null;
    EditText patientEditText = null;
    TextView displayTextView = null;
    double otherValue = 0;
    StringBuffer display = new StringBuffer();


    /**
     * set the cleaning value to 35
     * @param view
     */
    public void cleaningCheckBoxFun(View view){
        cleaningCheckBox = findViewById(R.id.cleaningeCheckBox);

        if(cleaningCheckBox.isChecked()) {
            cleaningValue = 35;
        } else{
            cleaningValue = 0;
        }

        Toast.makeText(Bill.this, "hi there" + cleaningValue, Toast.LENGTH_SHORT).show();

    }

    /**
     * set the cavity value to 150
     * @param view
     */
    public void cavityCheckBoxFun(View view){
        cavityCheckBox = findViewById(R.id.cavityCheckBox);
        if(cavityCheckBox.isChecked()) {
            cavityValue = 150;
        }else{
            cavityValue =0;
        }
        Toast.makeText(Bill.this, "hi there " + cavityValue, Toast.LENGTH_SHORT).show();

    }

    /**
     * set the fluoridevalue to 50
     * @param view
     */
    public void fluorideCheckBoxFun(View view){
       fluorideCheckBox = findViewById(R.id.fluorideCheckBox);
        if(fluorideCheckBox.isChecked()) {
            fluorideValue = 50;
        }else{
            fluorideValue = 0;
        }
        Toast.makeText(Bill.this, "hi there " + fluorideValue, Toast.LENGTH_SHORT).show();

    }

    /**
     * set the xRayValue to 85 o
     * @param view
     */
    public void xRayCheckBoxFun(View view){
        xRayCheckBox = findViewById(R.id.xrayCheckBox);
        if(xRayCheckBox.isChecked()) {
            xRayValue = 85;
        } else{
            xRayValue = 0;
        }
        Toast.makeText(Bill.this, "hi there " + xRayValue, Toast.LENGTH_SHORT).show();

    }


    public void otherCheckBoxFun(View view){
        otherCheckBox = findViewById(R.id.otherCheckBox);
        EditText otherEditText = (EditText) findViewById(R.id.otherTextView);
        if(otherCheckBox.isChecked()) {
            otherEditText.setEnabled(true);
        }
    }



    public void calculateTotalFun(View view){
        theOtherEditText = (EditText) findViewById(R.id.otherTextView);
        if(theOtherEditText.isEnabled() && theOtherEditText.getText().toString() != null) {
            otherValue = Double.parseDouble(theOtherEditText.getText().toString());
            theOtherEditText.setEnabled(false);
        } else{
            otherValue = 0;
        }

        resultEditText = (EditText) findViewById(R.id.resultTextView);
        total = cleaningValue + cavityValue + fluorideValue + xRayValue + otherValue;
        String totalString = String.valueOf((total));
        resultEditText.setText(totalString);
        resultEditText.setEnabled(false);
    }

    public void displayFunction(View view){
        patientEditText = findViewById(R.id.patientEditText);
        if(patientEditText.getText().toString().isEmpty()){
            Toast.makeText(Bill.this, "Enter valid Patient Name", Toast.LENGTH_SHORT).show();
        }
        else {
            displayTextView = findViewById(R.id.displayTextView);
            displayTextView.append("-------------------------------------------------------" + '\n');
            displayTextView.append("Patient Name:     "  + patientEditText.getText().toString() + '\n');
            displayTextView.append("Cleaning:              "  + "$ " +  cleaningValue + '\n');
            displayTextView.append("Cavity:                   "  + "$ " + cavityValue + '\n');
            displayTextView.append("Fluoride:               "  + "$ " + fluorideValue + '\n');
            displayTextView.append("X-Ray:                    "  + "$ " + xRayValue + '\n');
            displayTextView.append("Additional:            "  + "$ " + otherValue + '\n');
            displayTextView.append("Total:                      " + "$ " +total + '\n');
            displayTextView.append("--------------------------------------------------------");
        }
    }

    public void saveFunction(View view){
        if(view.getId() == R.id.saveButton){
            Intent i = new Intent(Bill.this, MainActivity.class);
            startActivity(i);
        }
    }

    public void clearFunction(View view){
        cleaningCheckBox = findViewById(R.id.cleaningeCheckBox);
        cavityCheckBox = findViewById(R.id.cavityCheckBox);
        fluorideCheckBox = findViewById(R.id.fluorideCheckBox);
        xRayCheckBox = findViewById(R.id.xrayCheckBox);
        otherCheckBox = findViewById(R.id.otherCheckBox);
        theOtherEditText = findViewById(R.id.otherTextView);
        resultEditText = findViewById(R.id.resultTextView);
        patientEditText = findViewById(R.id.patientEditText);
        displayTextView = findViewById(R.id.displayTextView);
        cleaningCheckBox.setChecked(false);
        cavityCheckBox.setChecked(false);
        fluorideCheckBox.setChecked(false);
        xRayCheckBox.setChecked(false);
        otherCheckBox.setChecked(false);
        theOtherEditText.setText("");
        theOtherEditText.setHint("Enter Value Here");
        resultEditText.setText("");
        resultEditText.setHint("Total");
        patientEditText.setText("");
        patientEditText.setHint("Enter Patient Name");
        total = 0;
        otherValue = 0;
        displayTextView.setText("");

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bill);
    }
}

