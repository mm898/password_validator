package com.example.mukhtaralhejji.password_validator;

/**
 * Created by mukhtaralhejji on 2018-02-08.
 */

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class EspressoTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void test1() {
        onView(withId(R.id.input))
                .perform(typeText("password"), closeSoftKeyboard());
        onView(withId(R.id.submit)).perform(click());
        onView(withId(R.id.result))
                .check(matches(withText("Not Valid Password")));
    }

    @Test
    public void test2() {
        onView(withId(R.id.input))
                .perform(typeText("abcdefghijklmn"), closeSoftKeyboard());
        onView(withId(R.id.submit)).perform(click());
        onView(withId(R.id.result))
                .check(matches(withText("Not Valid Password")));
    }

    @Test
    public void test3() {
        onView(withId(R.id.input))
                .perform(typeText("short"), closeSoftKeyboard());
        onView(withId(R.id.submit)).perform(click());
        onView(withId(R.id.result))
                .check(matches(withText("Not Valid Password")));
    }

    @Test
    public void test4() {
        onView(withId(R.id.input))
                .perform(typeText("abcdefgh123"), closeSoftKeyboard());
        onView(withId(R.id.submit)).perform(click());
        onView(withId(R.id.result))
                .check(matches(withText("Not Valid Password")));
    }

    @Test
    public void test5() {
        onView(withId(R.id.input))
                .perform(typeText("abcde@hdhfbn"), closeSoftKeyboard());
        onView(withId(R.id.submit)).perform(click());
        onView(withId(R.id.result))
                .check(matches(withText("Not Valid Password")));
    }

    @Test
    public void test6() {
        onView(withId(R.id.input))
                .perform(typeText("Huss@123abcd"), closeSoftKeyboard());
        onView(withId(R.id.submit)).perform(click());
        onView(withId(R.id.result))
                .check(matches(withText("Valid Password")));
    }

}
