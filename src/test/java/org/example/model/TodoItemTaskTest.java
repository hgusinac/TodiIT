package org.example.model;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class TodoItemTaskTest {


    public static final int PERSON_ID = 1;
    public static final String FIRST_NAME = "Haris";
    public static final String LAST_NAME = "Gusinac";
    public static final String EMAIL = "hg@gmail.com";



    public static final int ID = 2;
    public static final String TITLE = "Work";
    public static final String TASK_DESCRIPTION = "Code Java";
    public static final LocalDate DEAD_LINE = LocalDate.parse("2021-12-11");
    public static final boolean DONE = false;

    public static final AppUser USER= new AppUser("Haris Gusinac","1234567",AppRole.ROLE_APP_ADMIN);

    public static final Person CREATOR = new Person(PERSON_ID, FIRST_NAME, LAST_NAME, EMAIL, USER);
    public static final TodoItem todoItem = new TodoItem(ID, TITLE, TASK_DESCRIPTION, DEAD_LINE, DONE, CREATOR);
    public static final TodoItem TODO_ITEM = todoItem;
    public static final int TODO_ITEM_TASK_ID = 3;

    private TodoItemTask testObject;

    @Before
    public void setUp() throws Exception {
        testObject= new TodoItemTask(TODO_ITEM_TASK_ID,TODO_ITEM,CREATOR);


    }
    @Test
    public void testobject_successfully_instantiated() {

        assertEquals(TODO_ITEM_TASK_ID,testObject.getId());
        assertNotEquals(testObject.getId(),0);

        assertEquals(TODO_ITEM,testObject.getTodoItem());

        assertEquals(CREATOR,testObject.getAssignee());


        assertTrue(testObject.isAssigned());


    }

    @Test
    public void test_getSummary() {
        String result = "Haris Gusinac assigned Work";

        assertEquals(testObject.getSummary(),result);


    }

}