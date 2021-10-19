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
        Person person1 = new Person();
        System.out.println(person1.getSummary(1,"Haris","Gusinac","hgusinac@gmail.com"));
        System.out.println("----------------------");


        TodoItem todoItem = new TodoItem(1,"Work","Code Java", LocalDate.now(),true,person1);
        System.out.println(todoItem.getSummary());
        System.out.println("----------------------");


        TodoItemTask todoItemTask = new TodoItemTask(1,true,todoItem,person1);
        System.out.println(todoItemTask.getSummary());
        System.out.println("----------------------");

    }
}
