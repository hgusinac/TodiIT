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
        Person Sven = new Person(500,"Bajro","Gusinac","bgusinac@gmail.com");

        TodoItem todoItem = new TodoItem(1,"Work","Code Java", LocalDate.of(2021,11,1),true,person1);
        TodoItem Swim = new TodoItem(100,"Train","Swim",LocalDate.of(2010,01,01),false,Sven);

        TodoItemTask todoItemTask = new TodoItemTask(1,true,todoItem,person1);
        System.out.println(todoItemTask.getSummary());

        TodoItemTask todoItemTask2 = new TodoItemTask(2,true,Swim,Sven);
        System.out.println(todoItemTask2.getSummary());


    }
}
