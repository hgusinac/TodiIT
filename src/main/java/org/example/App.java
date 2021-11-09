package org.example;

import org.example.Model.*;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AppUser appUser = new AppUser("Haris","12345",AppRole.ROLE_APP_USER);
        AppUser appUser2 = new AppUser("Sven","gunilla112",AppRole.ROLE_APP_ADMIN);
        System.out.println(appUser2.toString());


        Person person = new Person(1,"Haris","Gusinac","Hg.gmail.com",new AppUser("Haris","1234",AppRole.ROLE_APP_ADMIN));
        System.out.println(person);







    }
}
