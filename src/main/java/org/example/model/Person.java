package org.example.model;

    public class Person {
    private int personId;
    private String firstName;
    private String lastName;
    private String email;

    public Person(){}


    //Constructor
    public Person(int id,String firstName,String lastName,String email){
        this.personId=personId;
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }

    public String getSummary(int personId,String firstName,String lastName,String email){

      return "Summary of Person:" + "\n PersonId:" + personId + "\n FirstName:" + firstName + "\n lastName:" + lastName + "\n email:" + email;


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

    public String getEmail() {
        if (email == null) throw new RuntimeException("Email was null");
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
