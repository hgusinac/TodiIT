package org.example;

import org.example.model.Person;
import org.example.model.TodoItem;
import sun.util.resources.LocaleData;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person person1 = new Person();
        System.out.println(person1.getSummary(1,"Haris","Gusinac","hgusinac@gmail.com"));


    }
}
