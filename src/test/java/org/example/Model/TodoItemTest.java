package org.example.Model;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class TodoItemTest {

    public static final int ID = 1;
    public static final String TITLE = "Work";
    public static final String TASK_DESCRIPTION = "Code Java";
    public static final LocalDate DEAD_LINE = LocalDate.parse("2021-11-01");
    public static final boolean DONE = false;

    public static final AppUser USER = new AppUser("Haris","1234",AppRole.ROLE_APP_ADMIN);
    public static final Person CREATOR = new Person(1,"Haris","Gusinac","Hgusinac@gmail.com", USER);
    private TodoItem testObject;
    @Before
    public void setUp()  {
        testObject = new TodoItem(ID, TITLE, TASK_DESCRIPTION, DEAD_LINE, DONE, CREATOR);


    }

    @Test
    public void testobject_successfully_instantiated(){
       assertEquals(ID,testObject.getId());
       assertNotEquals(testObject.getId(),0);

       assertEquals(TITLE,testObject.getTitle());
       assertNotNull(testObject.getTitle());
       assertNotEquals(testObject.getTitle(),"");

       assertEquals(TASK_DESCRIPTION,testObject.getTaskDescription());
       assertNotNull(testObject.getTaskDescription());

       assertEquals(DEAD_LINE,testObject.getDeadLine());
       assertNotNull(testObject.getDeadLine());

       assertEquals(DONE,testObject.isDone());

       assertEquals(CREATOR,testObject.getCreator());

        
    }

    @Test(expected = RuntimeException.class)
    public void constructor_null_runtime_exeption() {
        new TodoItem(0,null,null,null,false,null);
    }

    @Test
    public void test_isOverDue() {
        LocalDate isnow = LocalDate.now();
        testObject.setDeadLine(isnow.plusWeeks(2));
        assertFalse(testObject.isOverdue());


    }

    @Test
    public void test_getSummary() {
        String result = "\nTitle: "+TITLE+
                "\nDescription: "+ TASK_DESCRIPTION+
                "\nDeadline: " + DEAD_LINE +
                "\nIsOverdue: "+ testObject.isOverdue()+
                "\nDone: "+DONE +
                "\nCreator: "  +CREATOR.toString();
        assertEquals(testObject.getSummary(),result);
    }
}