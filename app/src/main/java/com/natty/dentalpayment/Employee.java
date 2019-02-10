package com.natty.dentalpayment;

import java.util.Date;

/**
 * Created by Dell on 5/24/2018.
 */

public class Employee {
    String firstName;
    String lastName;
    String phoneNumber;
    String emailString;
    String password;
    String userName;
    int    Eid;
    String dateOfBirth;

    public Employee(){

    }

    public Employee(String fn, String ln, String pn, String em, String un, String pw, String d ){
        firstName = fn;
        lastName = ln;
        phoneNumber = pn;
        emailString = em;
        password = pw;
        dateOfBirth = d;
        userName = un;
    }

    //set first name
    public void setFirstName(String fName){
        firstName = fName;
    }

    //get frist name
    public String getFirstName(){
        return  firstName;
    }

    //set last name
    public void setLastName(String lName){
        lastName = lName;
    }

    //get last name
    public String getLastName(){
        return  lastName;
    }

    //phone number
    public void setPhoneNumber(String pNumber){
        phoneNumber = pNumber;
    }

    //get last name
    public String getPhoneNumber(){
        return  phoneNumber;
    }

    //set last name
    public void setEmail(String email){
        emailString = email;
    }

    //get last name
    public String getEmail(){
        return  emailString;
    }

    //set last name
    public void setPassword(String pswrd){
        password = pswrd;
    }

    //get last name
    public String getPassword(){
        return  password;
    }

    //set last name
    public void setDateOfBirth(String bd){
        dateOfBirth = bd;
    }

    //get birthdate
    public String getBirthDate(){
        return  dateOfBirth;
    }


    //employee id
    public void setEmployeeID(int id){
        Eid = id;
    }

    public int getEmployeeID(){
        return Eid;
    }

    //user name
    public void setUserName(String un){
        userName = un;
    }

    //get user name
    public String getUserName(){
        return userName;
    }

}
