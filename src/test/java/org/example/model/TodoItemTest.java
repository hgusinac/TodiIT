package org.example.model;

import org.junit.Before;
import org.junit.Test;
import sun.util.resources.LocaleData;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class TodoItemTest {

    public static final String FIRST_NAME = "haris";
    public static final String LAST_NAME = "Gusinac";
    public static final String EMAIL = "Hgusinac@gmail.com";
    public static final int ID = 1;
    public static final String TITLE = "Work";
    public static final String TASK_DESCRIPTION = "Code Java";
    public static final LocalDate DEAD_LINE = LocalDate.parse("2021-11-01");
    public static final boolean DONE = false;
    private TodoItem testObject;
    private Person person;
    @Before
    public void setUp() throws Exception {
        person = new Person(1, FIRST_NAME, LAST_NAME, EMAIL);
        testObject = new TodoItem(ID, TITLE, TASK_DESCRIPTION, DEAD_LINE, DONE,person);

    }

    @Test
    public void testobject_successfully_instantiated(){
        assertEquals(TITLE,testObject.getTitle());
        assertEquals(TASK_DESCRIPTION,testObject.getTaskDescription());
        assertEquals(DEAD_LINE,testObject.getDeadLine());
        assertEquals(person,testObject.getCreator());
        assertTrue(String.valueOf(DONE),testObject.isDone());
        assertFalse(String.valueOf(DEAD_LINE),testObject.isOverdue());

        
    }

    @Test(expected = RuntimeException.class)
    public void constructor_null_runtime_exeption() {
        new TodoItem(0,null,null,null,false,null);
    }
}