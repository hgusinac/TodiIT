package org.example;

import org.example.model.Person;
import org.example.model.TodoItem;
import org.example.model.TodoItemTask;
import sun.util.resources.LocaleData;

import java.time.LocalDate;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person person1 = new Person(5,"Haris","Gusinac","hgusinac@gmail.com");

        TodoItem todoItem = new TodoItem(1,"Work","Code Java", LocalDate.of(2021,11,1),true,person1);

        System.out.println(todoItem.getSummary());

        System.out.println(todoItem.isOverdue());

    }
}
