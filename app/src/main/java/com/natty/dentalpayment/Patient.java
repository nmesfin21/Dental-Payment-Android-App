package com.natty.dentalpayment;

import android.app.Activity;

import java.util.Date;

/**
 * Created by Dell on 5/29/2018.
 */

public class Patient{
    String firstName;
    String lastName;
    Date   dateOfBirth;

    public Patient(){

    }

    public Patient(String fn, String ln, Date db){
        firstName = fn;
        lastName = ln;
        dateOfBirth = db;
    }

    public void setFirstName(String fn){
        firstName = fn;
    }

    public String getFirstName(){
        return  firstName;
    }

    public void setLastName(String ln){
        lastName = ln;
    }

    public String getLastName(){
        return  lastName;
    }

    public void setDateOfBirth(Date db){
        dateOfBirth = db;
    }

    public Date getDateOfBirth(){
        return  dateOfBirth;
    }
}
