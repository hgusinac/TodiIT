package org.example.model;

import jdk.nashorn.internal.ir.IfNode;

import java.util.Objects;
import java.util.UUID;

public class Person {
    private int personId;
    private String firstName;
    private String lastName;
    private String email;
    private AppUser credentials;

    public Person() {
    }

    //Constructor
    public Person(int personId,String firstName,String lastName,String email,AppUser credentials){

        if (personId <=0) throw  new RuntimeException();
        this.personId=personId;
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setCredentials(credentials);

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

    public AppUser getCredentials() {
        return credentials;
    }

    public void setCredentials(AppUser credentials) {
        this.credentials = credentials;
    }

    @Override
    public String toString(){
        return "\nPersonId: " + personId +
                "\nFirstName: " + firstName +
                "\nLastName: " + lastName +
                "\nEmail: " + email +
                "\n" + credentials;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return personId == person.personId && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, firstName, lastName, email);
    }
}
