package com.example.androiduitesting


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SecondaryActivityTest{

    @get:Rule
    val activityRule = ActivityScenarioRule<SecondaryActivity>(SecondaryActivity::class.java)


    @Test
    fun testIsActivityInView()
    {
        onView(ViewMatchers.withId(R.id.secondary))
            .check(ViewAssertions.matches(isDisplayed()))
    }

    @Test
    fun testVisibilityTitleAndNextButton()
    {
        onView(ViewMatchers.withId(R.id.textViewTitle)).check(ViewAssertions.matches(isDisplayed()))
        onView(ViewMatchers.withId(R.id.buttonBack)).check(ViewAssertions.matches(isDisplayed()))
        onView(ViewMatchers.withId(R.id.buttonBack)).check(
            ViewAssertions.matches(
                ViewMatchers.withEffectiveVisibility(
                    ViewMatchers.Visibility.VISIBLE
                )
            )
        )
    }

    @Test
    fun testTitleIsCorrect()
    {
        onView(ViewMatchers.withId(R.id.textViewTitle)).check(
            ViewAssertions.matches(
                ViewMatchers.withText(
                    "This is secondary Activity"
                )
            )
        )
    }
}