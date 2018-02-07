package com.example.mukhtaralhejji.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void password_is_not_password(){
        assertFalse(validator.validate("password"));
    }

    @Test
    public void password_is_not_PASSWORD(){
        assertFalse(validator.validate("PASSWORD"));
    }

    @Test
    public void password_is_not_short(){
        assertFalse(validator.validate("PASS"));
    }


}