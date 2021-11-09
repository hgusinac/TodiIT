package org.example.Model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    public static final int ID = 1;
    public static final String FIRST_NAME = "Haris";
    public static final String LAST_NAME = "Gusinac";
    public static final String EMAIL = "Hg@gmail.com";
    public static final AppUser USER = new AppUser("Haris","1234",AppRole.ROLE_APP_ADMIN);
    private Person testObject;

    @Before
    public void setUp() throws Exception {
        testObject = new Person(ID, FIRST_NAME, LAST_NAME, EMAIL, USER);

    }

    @Test
    public void testobject_successfully_instantiated() {
        assertNotNull(testObject.getId());
        assertEquals(FIRST_NAME,testObject.getFirstName());
        assertNotNull(FIRST_NAME,testObject.getFirstName());


        assertEquals(LAST_NAME,testObject.getLastName());
        assertNotNull(LAST_NAME,testObject.getLastName());

        assertEquals(EMAIL,testObject.getEmail());
        assertNotNull(EMAIL,testObject.getEmail());

        assertEquals("\nPersonId: " + ID +
                "\nFirstName: " + FIRST_NAME +
                "\nLastName: " + LAST_NAME +
                "\nEmail: " + EMAIL +
                "\n"+USER,testObject.toString());
    }

    @Test(expected = RuntimeException.class)
    public void null_runtime_exeption() {
        new Person(0,null,null,null,USER);
    }
}