package org.example.model;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class TodoItemTaskTest {

    private Person person;
    private TodoItem todoItem;
    private TodoItemTask testObject;
    public static final String FIRST_NAME = "haris";
    public static final String LAST_NAME = "Gusinac";
    public static final String EMAIL = "Hgusinac@gmail.com";
    public static final String TITLE = "Work";
    public static final String TASK_DESCRIPTION = "Code Java";
    public static final LocalDate DEAD_LINE = LocalDate.parse("2021-11-01");
    public static final boolean DONE = false;

    @Before
    public void setUp() throws Exception {
        person = new Person(1, FIRST_NAME, LAST_NAME, EMAIL);
        todoItem = new TodoItem(1, TITLE, TASK_DESCRIPTION, DEAD_LINE, DONE,person);
        testObject = new TodoItemTask(1,true,todoItem,person);
    }
    @Test
    public void testobject_successfully_instantiated() {

        assertTrue(testObject.isAssigned());
        assertNotNull(String.valueOf(todoItem),testObject.getTodoItem());
        assertNotNull(String.valueOf(person),testObject.getAssignee());

    }

    @Test(expected = RuntimeException.class)
    public void null_runtime_exeption() {
        testObject = new TodoItemTask(0,false,todoItem,null);

    }
}