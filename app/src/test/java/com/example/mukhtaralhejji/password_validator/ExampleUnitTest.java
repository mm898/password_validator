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
    public void password_is_not_short(){
        assertFalse(validator.validate("PASS"));
    }

    @Test
    public void password_not_contains_special_char(){
        assertFalse(validator.validate("abcdefghijklm"));
    }

    @Test
    public void password_not_contains_digit(){
        assertFalse(validator.validate("abcdefghijklm"));
    }

    @Test
    public void password_not_contains_lowercase(){
        assertFalse(validator.validate("ABCDEFGHIJKLM"));
    }

    @Test
    public void password_not_contains_upercase(){
        assertFalse(validator.validate("abcdefghijklm"));
    }

    @Test
    public void password_is_perfect(){
        assertTrue(validator.validate("abcdef@gHi1jklm"));
    }


}