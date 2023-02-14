package com.example.androiduitesting

import android.view.View
import android.view.View.VISIBLE
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{

    @Test
    fun testIsActivityInView()
    {
        val activityScenario = ActivityScenario.launch<MainActivity>(MainActivity::class.java)
        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }

    @Test
    fun testVisibilityTitleAndNextButton()
    {
        val activityScenario = ActivityScenario.launch<MainActivity>(MainActivity::class.java)
        onView(withId(R.id.textViewTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.buttonNext)).check(matches(isDisplayed()))
        onView(withId(R.id.buttonNext)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
    }

    @Test
    fun testTitleIsCorrect()
    {
        val activityScenario = ActivityScenario.launch<MainActivity>(MainActivity::class.java)
        onView(withId(R.id.textViewTitle)).check(matches(withText("This is first Activity")))
    }

}