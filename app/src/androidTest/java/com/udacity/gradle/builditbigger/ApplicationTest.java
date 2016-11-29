package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.ApplicationTestCase;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {

    private static String TEST_JOKE = "This is a test joke";

    public ApplicationTest() {
        super(Application.class);
    }

    @Test
    public void clickButton_showJoke() {
        // Type text and then press the button.
        onView(withId(R.id.btnTellJoke))
                .perform(click());

        // Check that the text was changed.
        onView(withId(R.id.joketext)).check(matches(withText(TEST_JOKE)));
    }
}