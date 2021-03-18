package com.hh.coronalastupdate.fragments

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.hh.coronalastupdate.MainActivity
import com.hh.coronalastupdate.R
import com.hh.coronalastupdate.adapters.MyListAdapter
import com.hh.coronalastupdate.data.FakeData
import io.mockk.every
import io.mockk.mockk
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4ClassRunner::class)
class ListFragmentTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    val LIST_ITEM_IN_TEST = 0
    val ITEM_IN_TEST = FakeData.Countries[LIST_ITEM_IN_TEST]

    @Test
    fun test_isListFragmentVisible_onAppLaunch() {
        onView(withId(R.id.swiperefresh)).check(matches(isDisplayed()))
    }
    @Test
    fun test_selectListItem_isDetailFragmentVisible() {
        // Click list item #LIST_ITEM_IN_TEST
        onView(withId(R.id.recyclerView))
            .perform(actionOnItemAtPosition<MyListAdapter.ViewHolder>(LIST_ITEM_IN_TEST, click()))

        // Confirm nav to DetailFragment and display main view
        onView(withId(R.id.detailFragmentParentId)).check(matches(isDisplayed()))
       onView(withId(R.id.country_name)).check(matches(withText(ITEM_IN_TEST.Country)))

        val dataSource = mockk<FakeData>()
        every {

        }
    }



}
