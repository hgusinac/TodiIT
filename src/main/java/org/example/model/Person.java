package org.example.model;

import jdk.nashorn.internal.ir.IfNode;

import java.util.UUID;

public class Person {
    private int personId;
    private String firstName;
    private String lastName;
    private String email;

    public Person() {
    }

    //Constructor
    public Person(int personId,String firstName,String lastName,String email){

        if (personId <=0) throw  new RuntimeException();
        this.personId=personId;
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }




    public int getId() {
        return personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) throw new RuntimeException("Firstname was null");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName==null) throw new RuntimeException("Lastname was null");
        this.lastName = lastName;
    }

    public String getEmail() {return email;}

    public void setEmail(String email) {
        if (email == null) throw new RuntimeException("Email was null");
        this.email = email;
    }

    public String getSummary(){
        return "\nPersonId: " + personId +
                "\nFirstName: " + firstName +
                "\nLastName: " + lastName +
                "\nEmail: " + email;

    }
}
